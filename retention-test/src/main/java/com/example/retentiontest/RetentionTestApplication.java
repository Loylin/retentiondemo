package com.example.retentiontest;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.example.retentioncore.retention.DisableDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@DisableDataSource
public class RetentionTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetentionTestApplication.class, args);
    }

}
