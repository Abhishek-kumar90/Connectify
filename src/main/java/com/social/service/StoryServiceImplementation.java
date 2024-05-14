package com.social.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.models.Story;
import com.social.models.User;
import com.social.repository.StoryRepository;


@Service
public class StoryServiceImplementation implements StoryService{

	@Autowired
	private StoryRepository storyRepository;
	
	@Autowired
	private UserService userService;
	
	@Override
	public Story createStrory(Story story, User user) {
		
		Story createdstory = new Story();
		createdstory.setCaption(story.getCaption());
		
		createdstory.setImage(story.getImage());
		
		createdstory.setUser(user);
		createdstory.setTimestamp(LocalDateTime.now());
		
		
		
		return storyRepository.save(createdstory);
	}

	@Override
	public List<Story> findStoryByUserId(Integer userId) throws Exception {
		
		
		User user = userService.findUserById(userId);
		
		return storyRepository.findByUserId(userId);
	}

	
}
