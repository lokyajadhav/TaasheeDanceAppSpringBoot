package com.Spring.NewDanceApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Spring.NewDanceApp.Beans.Dances;
import com.Spring.NewDanceApp.Services.DanceServices;
import com.fasterxml.jackson.databind.ObjectMapper;



@Controller
@RequestMapping("/")
public class DanceMVCCOntroller {
	@Autowired
	DanceServices danceServices;
	
	
	@GetMapping("/home")
	public String LoginPage()
	{
		return "homePage";
	}
	@PostMapping("/jlogin")
	public String Login(@RequestParam String userName, @RequestParam String password)
	{
		if(danceServices.isAuthenticated(userName,password))
		return "homePage";
		else
			return "login";
	}
	
	@GetMapping("/allDances")
	public String getAllDances(ModelMap modelMap )
	{
		//System.out.println(danceServices.getAllDances()); 
		List<Dances> list= danceServices.getAllDances();
		modelMap.put("DancesList", list);
		return "displayDancesList";
		
	}
	@GetMapping("/add")
	public String Add()
	{
		return "addDance";
	}
	@PostMapping("/addDance")
	public String addDance(@RequestParam int id, @RequestParam String name,@RequestParam String  state, ModelMap modelMap)
	{
		danceServices.addDance(new Dances(id,name,state));
		return getAllDances(modelMap);
	}
	@GetMapping("/getDancesById")
	public String getDanceById(@RequestParam int danceId, ModelMap modelMap)
	{
		Dances dance=danceServices.getDanceById(danceId);
		modelMap.put("dance", dance);
		return update();
	}
	@GetMapping("/update")
	public String update()
	{
		return "updateDance";
	}
	@PostMapping("/updateDance")
	public String updateDance(@RequestParam int id, @RequestParam String name, @RequestParam String state, ModelMap modelMap)
	{
		danceServices.updateDance(new Dances(id,name,state));
		return getAllDances(modelMap);
	}
	@GetMapping("/deleteDanceById")
	public String delete(@RequestParam int danceId, ModelMap modelMap)
	{
		danceServices.deleteDance(danceId);
		return getAllDances(modelMap);
	}
	@GetMapping("/logout")
	public String logout()
	{
		return "login";
	}
	
	
}
