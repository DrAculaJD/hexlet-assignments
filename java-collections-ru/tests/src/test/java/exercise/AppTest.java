package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result = new ArrayList<>(App.take(numbers1, 2));
        Assertions.assertEquals(numbers1.get(0), 1);
        Assertions.assertEquals(numbers1.get(1), 2);
        // END
    }
}
