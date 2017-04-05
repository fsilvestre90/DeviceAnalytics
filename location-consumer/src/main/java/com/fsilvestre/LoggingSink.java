package com.fsilvestre;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.SubscribableChannel;

public interface LoggingSink {

    String INPUT = "input";

    @Input(Sink.INPUT)
    SubscribableChannel input();
}