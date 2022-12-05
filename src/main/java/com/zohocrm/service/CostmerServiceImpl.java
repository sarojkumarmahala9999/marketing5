package com.zohocrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.enities.Costmer;
import com.zohocrm.repository.CostmerRepository;

@Service
public class CostmerServiceImpl implements CostmerService {

	@Autowired
	private CostmerRepository costmerRepo;
	
	@Override
	public void saveOneCostmer(Costmer cost) {
		costmerRepo.save(cost);
	}

}
