package com.fethi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// 
		UserBuilder users = User.withDefaultPasswordEncoder();
		//springin autont edeceği kodları gömdük
		auth.inMemoryAuthentication()
		.withUser(users.username("fethi").password("fethi").roles("ADMIN"))
		.withUser(users.username("can").password("can").roles("PERSONEL"))
		.withUser(users.username("tugce").password("tugce").roles("PERSONEL"));
		
		//super.configure(auth);
	}
	
	

}
