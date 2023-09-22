package com.concerto.user_authentication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.concerto.user_authentication.security.JwtAuthenticationEntryPoint;
import com.concerto.user_authentication.security.JwtAuthenticationFilter;

@Configuration
public class SecurityConfig {

	@Autowired
	private JwtAuthenticationEntryPoint point;

	@Autowired
	private JwtAuthenticationFilter filter;

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf().disable().cors().disable().authorizeRequests(authorizeRequests -> authorizeRequests

				// Requires authentication for URLs starting with "/home/"
				.antMatchers("/home/**").authenticated()

				// Allows unrestricted access to "/auth/login"
				.antMatchers("/auth/login").permitAll()

				// Allows unrestricted access to "/auth/create-user"
				.antMatchers("/auth/create-user").permitAll()

				// Requires authentication for all other requests
				.anyRequest().authenticated())

				.exceptionHandling(exceptionHandling -> exceptionHandling.authenticationEntryPoint(point))
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}

	@Bean
	public DaoAuthenticationProvider doDaoAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(userDetailsService);
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder);
		return daoAuthenticationProvider;
	}

}
