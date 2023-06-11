package com.Spring.NewDanceApp.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
		
			private final PasswordEncoder passwordEncoder;
			private final DaoUserDetailsService daoUserDetailsService;
			@Autowired
			public SecurityConfiguration(DaoUserDetailsService daoUserDetailsService,PasswordEncoder passwordEncoder) {
				
				this.daoUserDetailsService = daoUserDetailsService;
				this.passwordEncoder = passwordEncoder;
				System.out.println(passwordEncoder.encode("lokya@123"));
				System.out.println(passwordEncoder.encode("jadhav@123"));
				System.out.println(passwordEncoder.encode("naik@123"));
				System.out.println(passwordEncoder.encode("student1@123"));
				System.out.println(passwordEncoder.encode("student2@123"));
				
			}


			@Override
			protected void configure(HttpSecurity http) throws Exception {
				http
					 .csrf().disable()
				     .authorizeRequests()
				     //for restController
//				     .antMatchers(HttpMethod.POST,"/dances/**").hasAuthority(UserPermission.WRITE.getPermission())
//				     .antMatchers(HttpMethod.PUT,"/dances/**").hasAnyAuthority(UserPermission.WRITE.getPermission())
//				     .antMatchers(HttpMethod.DELETE,"/dances/**").hasAuthority(UserPermission.WRITE.getPermission())
//				     .antMatchers(HttpMethod.GET,"/dances/**").hasAuthority(UserPermission.READ.getPermission())
				     
				     
				    // for MVC Controller
				     
				     .antMatchers(HttpMethod.POST,"/**").hasAuthority(UserPermission.WRITE.getPermission())
				     .antMatchers(HttpMethod.DELETE,"/**").hasAuthority(UserPermission.WRITE.getPermission())
				     .antMatchers(HttpMethod.PUT,"/**").hasAuthority(UserPermission.WRITE.getPermission())
				     .antMatchers(HttpMethod.GET,"/**").hasAuthority(UserPermission.READ.getPermission())
				     .anyRequest()
				     .authenticated()
				     .and()
				     .formLogin()
				        .loginPage("/login")
				        .defaultSuccessUrl("/home",true)
				        .permitAll()
						.usernameParameter("userName");
				   // .httpBasic();
			}
			
			@Override
			//@Bean
			protected UserDetailsService userDetailsService() {
				UserDetails userStudentDetails=User.builder()
												.username("lokya")
												.password(passwordEncoder.encode("lokya123"))
												.authorities(UserRoles.STUDENT.getGrantedPermission())
												//.roles(UserRoles.STUDENT.name())
												.build();
				UserDetails userAdminDetails=User.builder()
											.username("jadhav")
											.password(passwordEncoder.encode("jadhav123"))
											.authorities(UserRoles.ADMIN.getGrantedPermission())
											//.roles(UserRoles.ADMIN.name())
											.build();
				return new InMemoryUserDetailsManager(userStudentDetails,userAdminDetails);
			}
			
			@Override
			protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			// TODO Auto-generated method stub
			auth.authenticationProvider(daoAuthenticationProvider());
			} 
			@Bean
			public DaoAuthenticationProvider daoAuthenticationProvider() {
				
				DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
					provider.setPasswordEncoder(passwordEncoder);
					provider.setUserDetailsService(daoUserDetailsService);
					return provider;
				
			}
}
