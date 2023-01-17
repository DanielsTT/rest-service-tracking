package com.example.restservicetracking.controller;

import com.example.restservicetracking.dto.CreateEventLogDto;
import com.example.restservicetracking.dto.EventLogDto;
import com.example.restservicetracking.service.EventLogCrud;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/tracking", produces = MediaType.APPLICATION_JSON_VALUE)
public class EventLogController {

    private final Logger logger = LoggerFactory.getLogger(EventLogController.class);

    private final EventLogCrud eventLogService;

    public EventLogController(EventLogCrud eventLogService) {
        this.eventLogService = eventLogService;
    }

    @PostMapping("/event")
    public ResponseEntity<EventLogDto> createEventLog(@RequestBody CreateEventLogDto createEventLogDto) {
        EventLogDto newEventLogDto = eventLogService.save(createEventLogDto);
        return ResponseEntity.created(URI.create("/tracking" + newEventLogDto.getId())).body(newEventLogDto);
    }

    @GetMapping(path = "/logs")
    public ResponseEntity<List<EventLogDto>> getAllLogs() {
        logger.info("Getting all logs");
        return ResponseEntity.ok(eventLogService.getAllEventLogs());
    }
}
