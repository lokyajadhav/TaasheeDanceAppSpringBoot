package com.Spring.NewDanceApp.Beans;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.Spring.NewDanceApp.Security.UserRoles;

public class admin implements UserDetails {
	private String username;
	private String password;
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Set<SimpleGrantedAuthority> getAuthorities() {
		UserRoles userRoles = UserRoles.STUDENT;
		if (role.equals(UserRoles.ADMIN.name())) {
			userRoles = UserRoles.ADMIN;
		}
		Set<SimpleGrantedAuthority> perminssion = userRoles.getPermission().stream()
				.map(permission -> new SimpleGrantedAuthority(permission.getPermission())).collect(Collectors.toSet());
		perminssion.add(new SimpleGrantedAuthority("ROLE_" + role));
		return perminssion;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
