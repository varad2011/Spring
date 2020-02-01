package com.example.SpringExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class TopicService {
	private List<Topic> topic = Arrays.asList(new Topic("varad", "patil", "20"),new Topic("hanumant", "dalvi", "01"));

	public List<Topic> getAll(){
		return topic;
	}
	public Topic getTopic(String id){
		Topic topic1 = topic.stream().filter(t -> t.getName().equals(id)).collect(Collectors.toList()).get(0);
		System.out.println("topic" +topic1.toString());
		return topic1;
	}
	public void addTopi(Topic topic) {
		
	}
}
