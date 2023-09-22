package com.concerto.user_authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class UserAuthentication {

	public static void main(String[] args) {
		SpringApplication.run(UserAuthentication.class, args);
	}

}
