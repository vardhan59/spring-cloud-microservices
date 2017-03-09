package com.example.service;

import java.util.List;

import com.example.mdoel.TollUsage;

public interface TollServiceintf {
	
	List<TollUsage> findAll();
	TollUsage getById(String id);
		
	}


