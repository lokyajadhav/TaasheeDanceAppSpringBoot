package com.Spring.NewDanceApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.NewDanceApp.Beans.Dances;
import com.Spring.NewDanceApp.Services.DanceServices;




@RestController
@RequestMapping("/dances")
public class DanceController {
	@Autowired
	private DanceServices danceServices;
	
	@GetMapping("/allDances")
	public List<Dances> getAllDances()
	{
		//System.out.println(danceServices.getAllDances()); 
		return danceServices.getAllDances();
	}
	@DeleteMapping
	public int deleteDance(@RequestParam int id)
	{
		return danceServices.deleteDance(id);
	}
	
	@PostMapping
	public int addDance(@RequestBody Dances dance)
	{
		return danceServices.addDance(dance);
	}
	@PutMapping
	public int updateDance(@RequestBody Dances dance)
	{
		return danceServices.updateDance(dance);
	}
	@PostMapping("/searchDances")
	public List<Dances> searchDances(@RequestBody Dances dance)
	{
		//System.out.println(danceServices.getAllDances()); 
		return danceServices.searchDances(dance);
	}

}
