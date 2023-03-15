package exercise;

// BEGIN
public final class App {
    
    public static void printSquare(Circle circle) throws NegativeRadiusException {
        try {
            final int result = (int) Math.ceil(circle.getSquare());

            System.out.println(result);
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь");
        }

        System.out.println("Вычисление окончено");
    }
}
// END
