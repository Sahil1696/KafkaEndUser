package com.kafka.endUser.repository;

import com.kafka.endUser.entity.LocationStorageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaRepository extends JpaRepository<LocationStorageEntity,Long> {
}
