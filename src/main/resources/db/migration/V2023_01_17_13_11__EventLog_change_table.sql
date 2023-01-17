ALTER TABLE events
    DROP COLUMN e_request_timestamp;

ALTER TABLE events
    ADD e_request_timestamp datetime NOT NULL;