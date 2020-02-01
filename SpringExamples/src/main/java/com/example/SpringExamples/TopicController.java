package com.example.SpringExamples;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("topic")
	public List<Topic> getList(){
		return topicService.getAll();
	}
	
	  @RequestMapping("topic/{idList}") 
	  public Topic getId(@PathVariable("idList") String id) 
	  {
		  return topicService.getTopic(id); 
	  }
	 
	  
	/*
	 * @RequestMapping("topic/id") public Topic getId( String id) { return
	 * topicService.getTopic(id); }
	 */
	
}
