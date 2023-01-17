package com.example.restservicetracking.repository;

import com.example.restservicetracking.entity.EventLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventLogRepository extends JpaRepository<EventLog, Integer> {
}