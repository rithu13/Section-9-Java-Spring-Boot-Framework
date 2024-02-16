package com.learn.demo.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.demo.enterprise.example.data.Data;

@Component
public class Business {
	@Autowired
	private Data datas;
	public long cal() {
		
		List<Integer> data=datas.getdata();
		return data.stream().reduce(Integer::sum).get();
	}
}
