package com.kafka.endUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.BlockingDeque;

@Configuration
public class KafkaConsumerConfig {
    @KafkaListener(topics ="location-update-topic",groupId = "group-1")
    public void kafkaConsumer(String location){
    System.out.println(location + "Message Consumed ..................");
    }
}
