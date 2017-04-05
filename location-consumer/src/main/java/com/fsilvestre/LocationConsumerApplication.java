package com.fsilvestre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
public class LocationConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocationConsumerApplication.class, args);
    }

    @StreamListener(Sink.INPUT)
    public void log(String data) {
        System.out.println(data);
    }
}