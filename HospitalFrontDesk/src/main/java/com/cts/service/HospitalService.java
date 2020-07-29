package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.cts.model.Hospital;
import com.cts.repository.HospitalRepository;
@ComponentScan

@Service
public class HospitalService{
	
	@Autowired
	HospitalRepository hospitalRepository;
	
	public List<Hospital> getAll() {
		return (List<Hospital>) hospitalRepository.findAll();
	}

	public List<Hospital> getBedsAvailableDetails(int bedsAvailable) {
		List<Hospital> beds =(List<Hospital>) hospitalRepository.findByBedsAvailable(bedsAvailable);
		for(Hospital hospital:beds){
			if(hospital.getBedsAvailable()==0){
				System.out.println("No beds available");			
				}
			}
			return beds;
	}
}