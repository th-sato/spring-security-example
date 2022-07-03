package com.study.spring.security.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(
                (auth) -> auth
                        .antMatchers("/hello").authenticated()
                        .antMatchers("/test", "/test-two").permitAll())
                .httpBasic(Customizer.withDefaults())
                .build();
    }

}
