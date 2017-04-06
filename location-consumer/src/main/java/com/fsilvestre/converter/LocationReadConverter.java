package com.fsilvestre.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fsilvestre.model.Location;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.UUID;

public final class LocationReadConverter implements Converter<String, Location> {

    public Location convert(String source) {
        if (StringUtils.hasText(source)) {
            try {
                Location location = new ObjectMapper().readValue(source, Location.class);
                location.setId(UUID.randomUUID());
                return location;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        return null;
    }
}
