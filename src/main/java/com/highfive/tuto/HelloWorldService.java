package com.highfive.tuto;
import com.highfive.tuto.config.ApplicationProperties;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public HelloWorldService(ApplicationProperties applicationProperties) {
        System.out.println(applicationProperties.getHello());
    }
}
