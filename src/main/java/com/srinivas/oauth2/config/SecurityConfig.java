package com.srinivas.oauth2.config;

import static org.springframework.security.config.Customizer.withDefaults;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
	@Bean
	SecurityFilterChain getSecurityFilterChain(HttpSecurity http) throws Exception {
		
		return http.authorizeHttpRequests((requests) -> {
			requests.requestMatchers("/oauth2/simple").permitAll();
			requests.anyRequest().authenticated();
			})
		.oauth2Login(withDefaults())
		.formLogin(withDefaults())
		.build();
	}

}
