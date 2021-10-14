package com.zakCoding.userService.configBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConfigBeansClass
{
    @Bean
    public RestTemplate getRestTemplateBean(){
        return new RestTemplate();
    }


}
