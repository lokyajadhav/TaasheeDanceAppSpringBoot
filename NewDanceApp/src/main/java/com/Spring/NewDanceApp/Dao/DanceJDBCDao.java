package com.Spring.NewDanceApp.Dao;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.Spring.NewDanceApp.Beans.Dances;





public interface DanceJDBCDao {

	public List<Dances> getAllDances();

	public int deleteDances(int id);

	public int addDance(Dances dance);

	public int updateDance(Dances dance);

	public List<Dances> searchDance(Dances dance);

	public boolean isAuthenticated(String username, String password);

	public Dances getDanceById(int id);

	public UserDetails getAdminByUsername(String username);

}
