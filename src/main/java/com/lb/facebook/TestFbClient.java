package com.lb.facebook;

import com.lb.facebook.service.FbDataService;
import com.lb.facebook.service.FbDataServiceImpl;

public class TestFbClient {
	
	public static void main(String[] args) {
		//System.out.println("test"); 
		
		String accessToken = "CAACEdEose0cBAKCkGGhXfqksQpfvGQux1mvNdm1VIPFRTZAe5gwzIO4rh0FiK7X39rZA86gHTY0IFduSiBO6lq4jakoSkv2NclBdNm6201X2n1VWtSMluF4uPTETRoDWHHL1tw2yAlfZCZAOA9p5y7MuqABZAVMiM6wT6JgR0zG3ZB8Vg1dEPv8aTE3uzD7JEZD";
		
		try {
			FbDataService fbService = new FbDataServiceImpl();
			//String friends = fbService.getFriends(accessToken);
			//System.out.println(friends);
			String user = fbService.getUserProfile(accessToken);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
