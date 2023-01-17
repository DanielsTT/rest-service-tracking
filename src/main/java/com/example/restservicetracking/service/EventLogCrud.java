package com.example.restservicetracking.service;

import com.example.restservicetracking.dto.CreateEventLogDto;
import com.example.restservicetracking.dto.EventLogDto;

import java.util.List;

public interface EventLogCrud {

    EventLogDto save(CreateEventLogDto createEventLogDto);

    List<EventLogDto> getAllEventLogs();

}
