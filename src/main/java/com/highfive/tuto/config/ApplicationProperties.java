package com.highfive.tuto.config;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter

@ConfigurationProperties(prefix="application",ignoreUnknownFields=false)
public class ApplicationProperties {
    public String hello;

}
