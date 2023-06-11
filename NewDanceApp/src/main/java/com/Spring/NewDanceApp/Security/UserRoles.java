package com.Spring.NewDanceApp.Security;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum UserRoles {
	
	STUDENT(new HashSet<>(Arrays.asList(UserPermission.READ))),
	ADMIN(new HashSet<>(Arrays.asList(UserPermission.READ,UserPermission.WRITE)));
	
	private Set<UserPermission> permission;

	private UserRoles(Set<UserPermission> permission) {
		this.permission = permission;
	}

	public Set<UserPermission> getPermission() {
		return permission;
	}

	public void setPermission(Set<UserPermission> permission) {
		this.permission = permission;
	}
	
	public Set<SimpleGrantedAuthority> getGrantedPermission(){
			Set<SimpleGrantedAuthority> perminssion=getPermission().stream().map(permission->new SimpleGrantedAuthority(permission.getPermission())).collect(Collectors.toSet());
			return perminssion;
	}
	
	

}
