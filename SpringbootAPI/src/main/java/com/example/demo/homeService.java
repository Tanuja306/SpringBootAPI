package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface homeService {
	
	public void saveData(customer s1);
	
	public List<customer> getAllInfo();
	
	public void deldata(int id);
	
	public Optional<customer> getOneInfo(int id);
	
	

}
