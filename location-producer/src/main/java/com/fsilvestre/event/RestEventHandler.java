package com.fsilvestre.event;

import com.fsilvestre.model.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class RestEventHandler {

    private static Logger logger = LoggerFactory.getLogger(RestEventHandler.class);
    private Source source;

    @Autowired
    public RestEventHandler(Source source) {
        this.source = source;
    }

    public void locationReceived(Location location) {
        source.output().send(MessageBuilder.withPayload(location).build());
        logger.info("Sending Location: " + location);
    }
}