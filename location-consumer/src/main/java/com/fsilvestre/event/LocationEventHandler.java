package com.fsilvestre.event;

import com.fsilvestre.converter.LocationReadConverter;
import com.fsilvestre.model.Location;
import com.fsilvestre.repository.LocationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;

@Configuration
@EnableBinding(LocationSink.class)
public class LocationEventHandler {
    private static Logger logger = LoggerFactory.getLogger(LocationSink.class);
    private LocationReadConverter converter = new LocationReadConverter();

    @Autowired
    private LocationRepository repository;

    @ServiceActivator(inputChannel = LocationSink.INPUT)
    public void emittedEvent(Object payload) {
        Location location = converter.convert(payload.toString());
        logger.info("Received Location: " + location.toString());
        this.repository.save(location);
    }

}