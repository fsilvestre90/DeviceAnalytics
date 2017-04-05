package com.fsilvestre.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;

@Configuration
@EnableBinding(LocationSink.class)
public class LocationEventHandler {

    private static Logger logger = LoggerFactory.getLogger(LocationSink.class);

    @ServiceActivator(inputChannel = LocationSink.INPUT)
    public void emittedEvent(Object payload) {
        logger.info("Received Location: " + payload);
    }

}