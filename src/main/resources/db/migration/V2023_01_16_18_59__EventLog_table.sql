CREATE TABLE events
(
    e_id                INT AUTO_INCREMENT NOT NULL,
    e_ip_address        VARCHAR(255)       NOT NULL,
    e_request_method    VARCHAR(255)       NOT NULL,
    e_request_uri       VARCHAR(255)       NOT NULL,
    e_request_timestamp date               NOT NULL,
    CONSTRAINT pk_events PRIMARY KEY (e_id)
);