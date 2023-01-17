package com.example.restservicetracking.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = EventLog.TABLE_NAME)
public class EventLog {

    public static final String TABLE_NAME = "eventlogs";
    public static final String COLUMN_PREFIX = "e_";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COLUMN_PREFIX + "id", nullable = false)
    private int id;

    @Column(name = COLUMN_PREFIX + "ip_address", nullable = false)
    private String ipAddress;

    @Column(name = COLUMN_PREFIX + "request_method", nullable = false)
    private String requestMethod;

    @Column(name = COLUMN_PREFIX + "request_uri", nullable = false)
    private String requestUri;

    @Column(name = COLUMN_PREFIX + "request_timestamp", nullable = false)
    private LocalDate requestTimestamp;

}
