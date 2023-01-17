package com.example.restservicetracking.service;

import com.example.restservicetracking.dto.CreateEventLogDto;
import com.example.restservicetracking.dto.EventLogDto;
import com.example.restservicetracking.entity.EventLog;
import com.example.restservicetracking.repository.EventLogRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EventLogService {

    private final EventLogRepository eventLogRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public EventLogDto save(CreateEventLogDto createEventLogDto) {
        EventLog newEventLog = modelMapper.map(createEventLogDto, EventLog.class);
        return modelMapper.map(eventLogRepository.save(newEventLog), EventLogDto.class);
    }

    @Transactional
    public List<EventLogDto> getAllEventLogs() {
        return eventLogRepository.findAll().stream()
                .map(eventLog -> modelMapper.map(eventLog, EventLogDto.class))
                .collect(Collectors.toList());
    }
}
