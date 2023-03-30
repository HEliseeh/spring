package com.highfive.tuto;

import com.highfive.tuto.config.ApplicationProperties ;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties ;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class, LiquibaseProperties.class})
public class TutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutoApplication.class, args);
	}

}
