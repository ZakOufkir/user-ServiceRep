package com.zakCoding.userService.dbConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DbConfiguration {


    @Autowired
    DatabaseProperties userdbProp;

    @Bean
    public DataSource createDataSource(){

        DataSourceBuilder datasource = DataSourceBuilder.create();
        datasource.username(userdbProp.getUsername());
        datasource.password(userdbProp.getPassword());
        datasource.url(userdbProp.getUrl());
        datasource.driverClassName(userdbProp.getDriverclassname());
        return datasource.build();

    }
}
