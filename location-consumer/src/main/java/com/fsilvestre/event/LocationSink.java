package com.fsilvestre.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.SubscribableChannel;

public interface LocationSink {

    String INPUT = "input";

    @Input(Sink.INPUT)
    SubscribableChannel input();
}
