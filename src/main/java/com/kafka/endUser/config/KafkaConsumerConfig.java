package com.kafka.endUser.config;

import com.kafka.endUser.entity.LocationStorageEntity;
import com.kafka.endUser.repository.KafkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.BlockingDeque;

@Configuration
public class KafkaConsumerConfig {
    @Autowired
    private KafkaRepository kafkaRepository;
    @KafkaListener(topics ="random-number-topic",groupId = "group-1")
    public void kafkaConsumer(String location){
    System.out.println(location + "Message Consumed ..................");
        LocationStorageEntity locationStorageEntity = new LocationStorageEntity();
        locationStorageEntity.setLocation(location);
        kafkaRepository.save(locationStorageEntity);
    }
}
