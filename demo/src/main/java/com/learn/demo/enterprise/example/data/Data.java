package com.learn.demo.enterprise.example.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Data{
	@Autowired
	public List<Integer> getdata()
	{
		return Arrays.asList(10,20,30,40);
	}
}