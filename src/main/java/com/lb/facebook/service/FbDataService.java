package com.lb.facebook.service;

import facebook4j.FacebookException;

public interface FbDataService {

	public String getFriends(String accessToken) throws FacebookException;

	public String getUserProfile(String accessToken) throws FacebookException;
}
