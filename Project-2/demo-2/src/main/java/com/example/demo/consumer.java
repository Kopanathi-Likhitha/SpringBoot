package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component

public class consumer {
	
	 @KafkaListener(topics = "second-topic", groupId = "group_id")
	    public void processMessage(String content){
	        System.out.println("Message: " + content);
	    }
	}

