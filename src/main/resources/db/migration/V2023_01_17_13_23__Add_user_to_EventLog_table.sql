ALTER TABLE events
    ADD e_user VARCHAR(255) NULL;

ALTER TABLE events
    MODIFY e_user VARCHAR(255) NOT NULL;