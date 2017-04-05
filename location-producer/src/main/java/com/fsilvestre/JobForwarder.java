package com.fsilvestre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class JobForwarder {

    private Source source;

    @Autowired
    public JobForwarder(Source source) {
        this.source = source;
    }

    public void forwardLocation(Location location) {
        source.output().send(MessageBuilder.withPayload(location).build());
    }
}