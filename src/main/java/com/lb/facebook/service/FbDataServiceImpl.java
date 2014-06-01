package com.lb.facebook.service;

import com.lb.facebook.util.JSONWriterUtil;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Friend;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;

public class FbDataServiceImpl implements FbDataService {

	public String getFriends(String accessTokenString) throws FacebookException {
		
		Facebook facebook = getFacebookInstance(accessTokenString);
		
		ResponseList<Friend> friends = facebook.getFriends();
		String json = null;
		
		if(null != friends && friends.size() > 0) {
			json = JSONWriterUtil.writeToJson(friends);
		}
		
		return json;
	}

	public String getUserProfile(String accessTokenString) throws FacebookException {
		
		Facebook facebook = getFacebookInstance(accessTokenString);
		String json = null;
		
		User user = facebook.getMe();
		if(null != user)
			json = JSONWriterUtil.writeToJson(user);
		
		return json;
	}

	public String getUserProfileByID(String accessToken) throws FacebookException {
		return null;
	}
	
	private Facebook getFacebookInstance(String accessTokenString) {
		Facebook facebook = new FacebookFactory().getInstance();
		facebook.setOAuthAppId("248278838697018", "e667cfb9a03ec31cb2369983466c8830");
		facebook.setOAuthPermissions("user_friends, email");
		AccessToken accessToken = new AccessToken(accessTokenString);
		facebook.setOAuthAccessToken(accessToken);
		return facebook;
	}
	
}
