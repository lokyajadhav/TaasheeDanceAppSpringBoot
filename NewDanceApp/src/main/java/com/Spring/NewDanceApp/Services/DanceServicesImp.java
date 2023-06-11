package com.Spring.NewDanceApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.NewDanceApp.Beans.Dances;
import com.Spring.NewDanceApp.Dao.DanceJDBCDao;





@Service
public class DanceServicesImp implements DanceServices {
	@Autowired
	private DanceJDBCDao danceJDBCDao;
	@Override
	public List<Dances> getAllDances() {
		
		return danceJDBCDao.getAllDances();
	}
	@Override
	public int deleteDance(int id) {
		return danceJDBCDao.deleteDances(id);
	}
	@Override
	public int addDance(Dances dance) {
		// TODO Auto-generated method stub
		return danceJDBCDao.addDance(dance);
	}
	@Override
	public int updateDance(Dances dance) {
		// TODO Auto-generated method stub
		return danceJDBCDao.updateDance(dance);
	}
	@Override
	public List<Dances> searchDances(Dances dance) {
		// TODO Auto-generated method stub
		return danceJDBCDao.searchDance(dance);
	}
	@Override
	public boolean isAuthenticated(String username, String password) {
		
		return danceJDBCDao.isAuthenticated(username,password);
	}
	@Override
	public Dances getDanceById(int id) {
		// TODO Auto-generated method stub
		return danceJDBCDao.getDanceById(id);
	}
	
	
	

}
