//package com.proj1.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests().antMatchers(HttpMethod.GET, "/**").permitAll();
//        http.authorizeRequests().antMatchers(HttpMethod.POST, "/**").authenticated();
//        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/**").authenticated();
//        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/**").authenticated();
//        http.authorizeRequests().and().formLogin().loginPage("/login").and().csrf().disable().httpBasic();
//
//        return http.build();
//
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource) {
//        return new JdbcUserDetailsManager(dataSource);
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//}
