 package com.Spring.NewDanceApp.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.Spring.NewDanceApp.Beans.Dances;
import com.Spring.NewDanceApp.Beans.admin;





@Repository
public class DanceJDBCDaoImpl implements DanceJDBCDao {
	@Autowired
	private JdbcTemplate jdbcTempate;
	@Override
	public List<Dances> getAllDances() {
		
		return jdbcTempate.query("SELECT * from dances", new BeanPropertyRowMapper<Dances>(Dances.class));
	}
	@Override
	public int deleteDances(int id) {
		
		return jdbcTempate.update("delete from dances where id=?", new Object[] {id});
	}
	@Override
	public int addDance(Dances dance) {
		// TODO Auto-generated method stub
		return jdbcTempate.update("insert into dances(id,name,state_of_origin) values(?,?,?)", new Object[] {dance.getId(),dance.getName(),dance.getState_of_origin()});
	}
	@Override
	public int updateDance(Dances dance) {
		// TODO Auto-generated method stub
		return jdbcTempate.update("update dances set name=?, state_of_origin=? where id=?", new Object[] {dance.getName(),dance.getState_of_origin(),dance.getId()});
	}
	@Override
	public List<Dances> searchDance(Dances dance) {
		
		return jdbcTempate.query("Select * from dances where name LIKE ? AND state_of_origin LIKE ?",new BeanPropertyRowMapper<Dances>(Dances.class),new Object[] {"%"+ dance.getName()+"%","%"+dance.getState_of_origin()+"%"});
	}
	@Override
	public boolean isAuthenticated(String username, String password) {
		
		List<admin> isExists =jdbcTempate.query("select * from admin where username=? and password=?", new BeanPropertyRowMapper<admin>(admin.class),new Object[] {username,password});
           
		if(isExists.size()>0)
			return true;
		else return false;
	}
	@Override
	public Dances getDanceById(int id) {
		
		return jdbcTempate.queryForObject("select * from dances where id= ?", new BeanPropertyRowMapper<Dances>(Dances.class), new Object[] {id});
	}
	@Override
	public UserDetails getAdminByUsername(String username) {
		// TODO Auto-generated method stub
		return  jdbcTempate.queryForObject("select * from admin where username=? ", new BeanPropertyRowMapper<admin>(admin.class),new Object[] {username});

	} 
	
	

}
