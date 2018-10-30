package com.mall.common.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Autowired
  BCryptPasswordEncoder bCryptPasswordEncoder;

  @Autowired
  DataSource dataSource;

  @Value("${spring.queries.users-query}")
  private String usersQuery;

  @Value("${spring.queries.authorities-query}")
  private String authoritiesQuery;

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    // 스프링 시큐리티에서 JDBC 지원 사용자 저장소에서 인증하기 위해 jdbcAuthentication() 메소드를 사용한다.
    auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(bCryptPasswordEncoder)
        .usersByUsernameQuery(usersQuery).authoritiesByUsernameQuery(authoritiesQuery);
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    super.configure(http);
    http.authorizeRequests().anyRequest().authenticated().and().csrf().disable();
  }

}
