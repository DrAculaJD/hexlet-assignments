package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() {
        ObjectMapper mapper = new ObjectMapper();
        String result;

        try {
            result = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException();
        }

        return result;
    }

    public static Car unserialize(String json) {
        ObjectMapper mapper = new ObjectMapper();
        Car result;

        try {
            result = mapper.readValue(json, Car.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
    // END
}
