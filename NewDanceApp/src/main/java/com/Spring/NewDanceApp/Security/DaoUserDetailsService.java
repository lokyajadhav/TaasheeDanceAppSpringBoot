package com.Spring.NewDanceApp.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Spring.NewDanceApp.Dao.DanceJDBCDao;
@Service
public class DaoUserDetailsService implements UserDetailsService {
	@Autowired
	DanceJDBCDao danceJDBCDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserDetails user=danceJDBCDao.getAdminByUsername(username);
		return user;
	}

}
