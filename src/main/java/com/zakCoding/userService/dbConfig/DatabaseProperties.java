package com.zakCoding.userService.dbConfig;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class DatabaseProperties {


    private String driverclassname;
    private String url;
    private String username;
    private String  password;

}
