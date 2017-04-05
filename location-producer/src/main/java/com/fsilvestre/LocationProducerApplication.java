package com.fsilvestre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(Source.class)
@SpringBootApplication
public class LocationProducerApplication {

    @Autowired
    JobForwarder output;

	@PostMapping("/location")
	public void publish(@RequestBody Location location) {
        output.forwardLocation(location);
	}

//	@InboundChannelAdapter(channel = Source.OUTPUT)
//	public Location emitData() {
//		return new Location(45.5445, -122.234234, 3123123);
//	}

	public static void main(String[] args) {
		SpringApplication.run(LocationProducerApplication.class, args);
	}
}