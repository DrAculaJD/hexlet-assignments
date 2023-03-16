package exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
final class App {

    public static void save(Path path, Car car) {
        String result = car.serialize();

        try {
            Files.write(path, result.getBytes(), StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Car extract(Path path) throws IOException {
        String jsonRepresentation = Files.readString(path);
        Car instance = Car.unserialize(jsonRepresentation);

        return instance;
    }
}
// END
