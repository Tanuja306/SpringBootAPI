package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
	
	@Autowired
	homeService hs;

	
	@PostMapping("/saveInfo")
    public String one(@RequestBody customer s1)
    {
		hs.saveData(s1);
		
		return "Data save successfully";
    }
	
	@GetMapping("/getAllInfo")
	public List<customer> two()
	{
		List<customer> l1=hs.getAllInfo();
		
		return l1;
	}
	
	@DeleteMapping("/deldata/{id}")
	public String three(@PathVariable int id)
	{
		hs.deldata(id);
		return "delete record";
	}
	
	@GetMapping("/edit/{id}")
	public Optional<customer> four(@PathVariable int id)
	{
		Optional<customer> c2=hs.getOneInfo(id);
		return c2;
	}
	
	@PostMapping("/update")
	public String five(@RequestBody customer cc)
	{
		hs.saveData(cc);
		
		return "Data update successfully";
	}
}
