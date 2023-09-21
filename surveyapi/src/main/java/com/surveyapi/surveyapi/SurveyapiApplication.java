package com.surveyapi.surveyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class SurveyapiApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SurveyapiApplication.class, args);
	}

}
