package br.com.natan.ecommerce.ecommerce_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

//temporário
@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf.disable()) // desativa proteção CSRF (necessário para POST no Swagger)
        .authorizeHttpRequests(auth -> auth
            .anyRequest().permitAll() // libera todos os endpoints
        );

    return http.build();
  }
}
