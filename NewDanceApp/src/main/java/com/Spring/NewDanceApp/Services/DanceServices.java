package com.Spring.NewDanceApp.Services;

import java.util.List;

import com.Spring.NewDanceApp.Beans.Dances;





public interface DanceServices {
	public List<Dances> getAllDances();

	public int deleteDance(int id);

	public int addDance(Dances dance) ;

	public int updateDance(Dances dance);


	public List<Dances> searchDances(Dances dance);

	public boolean isAuthenticated(String userName, String password);

	public Dances getDanceById(int id);
}
