CREATE TABLE IF NOT EXISTS short_url (
    short_id VARCHAR(255) PRIMARY KEY,
    url VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    INDEX idx__url (url)
);
