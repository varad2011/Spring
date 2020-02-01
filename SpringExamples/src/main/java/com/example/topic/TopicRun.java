package com.example.topic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringExamples.SpringExamplesApplication;
import com.example.SpringExamples.TopicController;
@SpringBootApplication
public class TopicRun {

	public static void main(String[] args) {
		SpringApplication.run(TopicController.class, args);

	}

}
