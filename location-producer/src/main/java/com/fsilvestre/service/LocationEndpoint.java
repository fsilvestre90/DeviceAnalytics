package com.fsilvestre.service;

import com.fsilvestre.event.RestEventHandler;
import com.fsilvestre.model.Location;
import com.fsilvestre.model.LocationWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationEndpoint {

    @Autowired
    RestEventHandler output;

    @PostMapping("/location")
    public void publishToKafka(@RequestBody LocationWrapper locations) {
        for (Location location : locations.getLocationList()) {
            output.locationReceived(location);
        }
    }

}
