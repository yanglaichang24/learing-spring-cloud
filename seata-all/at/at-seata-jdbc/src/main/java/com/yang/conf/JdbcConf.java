package com.yang.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcConf {

    @Bean
    @ConfigurationProperties(prefix = "spring.order")
    public DataSource orderDataSource(){
          return DataSourceBuilder.create().build();
    }

    @Bean
    public JdbcTemplate orderJdbcTemplate(DataSource orderDataSource){
           return new JdbcTemplate(orderDataSource);
    }


    @Bean
    @ConfigurationProperties(prefix = "spring.stock")
    public DataSource stockDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    public JdbcTemplate stockJdbcTemplate(DataSource stockDataSource){
        return new JdbcTemplate(stockDataSource);
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.account")
    public DataSource accountDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    public JdbcTemplate accountJdbcTemplate(DataSource accountDataSource){
        return new JdbcTemplate(accountDataSource);
    }


}
