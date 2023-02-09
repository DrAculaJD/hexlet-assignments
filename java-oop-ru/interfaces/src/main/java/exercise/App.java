package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> homes, int amount) {
        List<String> result = new ArrayList<>();
        List<Home> sortHomes;

        if (homes.isEmpty()) {
            return result;
        }

        sortHomes = homes.stream()
                .sorted(Home::compareTo)
                .collect(Collectors.toList());

        for (Home home: sortHomes) {
            result.add(home.toString());
        }

        return result.subList(0, amount);
    }
}
// END
