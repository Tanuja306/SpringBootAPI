package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class homeDao implements homeService{
	
	@Autowired
	homeRepo hr;

	@Override
	public void saveData(customer s1) {
		
		hr.save(s1);
		
	}

	@Override
	public List<customer> getAllInfo() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public void deldata(int id) {
		
		hr.deleteById(id);
		
	}

	@Override
	public Optional<customer> getOneInfo(int id) {
		// TODO Auto-generated method stub
		return hr.findById(id);
	}

}
