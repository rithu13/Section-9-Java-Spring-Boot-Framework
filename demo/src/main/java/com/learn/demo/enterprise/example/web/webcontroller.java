package com.learn.demo.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.demo.enterprise.example.business.Business;

@Component
public class webcontroller {
	@Autowired
	private Business bus;
	public long retrunvalfrombusiness()
	{
		return bus.cal();
	}

}
