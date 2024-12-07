package com.klef.jfsd.exam.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.klef.jfsd.exam.repository.Ordersrepository;


@Service
public class OrdersService {

	@Autowired
	Ordersrepository or;
	
	public List<String> getorders(){		
		List<String> olist=new ArrayList<String>();
		for(orders o :or.findAll()) {
			olist.add(toJSON(o));	
		}
		return olist;
	}
	public String toJSON(Object obj) {
		GsonBuilder GB= new GsonBuilder();
		Gson G=GB.create();
		return G.toJson(obj);
	}
}
