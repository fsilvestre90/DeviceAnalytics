CREATE KEYSPACE IF NOT EXISTS device_location WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};

CREATE TABLE device_location.device_activity
(id uuid,
user_id text,
latitude double,
longitude double,
epoch long,
PRIMARY KEY (user_id, epoch));