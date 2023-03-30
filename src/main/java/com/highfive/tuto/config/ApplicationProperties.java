package com.highfive.tuto.config;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="application",ignoreUnknownFields=false)
public class ApplicationProperties {
    public String hello(){
        return "hello";
    };
}
