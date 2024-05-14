package com.social.service;

import java.util.List;

import com.social.models.Reels;
import com.social.models.User;

public interface ReelsService {

	public Reels createReel(Reels reel , User user);
	
	public List<Reels> findAllReels();
	
	public List<Reels> findUsersReels(Integer userId) throws Exception;
	
	
	
}
