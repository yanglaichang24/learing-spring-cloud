package com.yang;

import com.netflix.hystrix.exception.HystrixRuntimeException;
import com.netflix.hystrix.exception.HystrixTimeoutException;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class ServiceIdFallbackProvider implements FallbackProvider {

    @Override
    public String getRoute() {
        return "service-id";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        if (cause instanceof HystrixRuntimeException) {
            // 设置响应的状态
            RequestContext context = RequestContext.getCurrentContext();
            HttpServletResponse response = context.getResponse();
            response.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE);

            // 设置响应的内容为JSON
            String reason = "{\"code\":\"503\",\"message\":\"Service Unavailable HystrixRuntimeException\"}";
            try {
                response.getWriter().write(reason);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // 返回修改后的响应
            return new ClientHttpResponse() {
                @Override
                public HttpStatus getStatusCode() throws IOException {
                    return HttpStatus.SERVICE_UNAVAILABLE;
                }

                @Override
                public int getRawStatusCode() throws IOException {
                    return HttpServletResponse.SC_SERVICE_UNAVAILABLE;
                }

                @Override
                public String getStatusText() throws IOException {
                    return "Service Unavailable";
                }

                @Override
                public void close() {
                }

                @Override
                public InputStream getBody() throws IOException {
                    return new ByteArrayInputStream(reason.getBytes());
                }

                @Override
                public HttpHeaders getHeaders() {
                    HttpHeaders headers = new HttpHeaders();
                    headers.setContentType(MediaType.APPLICATION_JSON);
                    return headers;
                }
            };
        }
        return null;
    }
}
