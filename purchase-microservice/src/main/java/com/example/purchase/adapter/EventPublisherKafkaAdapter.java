package com.example.purchase.adapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


import com.example.purchase.document.PurchaseDocument;
import com.example.purchase.adapter.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
// ACL: Anti Corruption Layer
@Service
public class EventPublisherKafkaAdapter implements EventPublisher {
	private static final Logger logger = 
			LoggerFactory.getLogger(EventPublisherKafkaAdapter.class);
	@Value("${purchase.events.topic}")
	private String topicName;
	
	private KafkaTemplate<String, String> kafkaTemplate;
	private ObjectMapper mapper;
	
	public EventPublisherKafkaAdapter(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper mapper) {
		this.kafkaTemplate = kafkaTemplate;
		this.mapper = mapper;
	}

	public void publishEvent(PurchaseDocument businessEvent) {
		try {
			var eventAsJson = mapper.writeValueAsString(businessEvent);
			kafkaTemplate.send(topicName, eventAsJson);
		} catch (JsonProcessingException e) {
			logger.error("Error while converting the event to json: {}",
					e.getMessage());
		}
	}

}