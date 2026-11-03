import java.util.List;

public class ListUtils {

    // Returns the first element, or null if the list is empty
    public static <T> T first(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // Returns the last element, or null if the list is empty
    public static <T> T last(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    // Prints every element on its own line
    public static <T> void printAll(List<T> list) {
        for (T item : list) {
            System.out.println("- " + item);
        }
    }

    // Only accepts lists of numbers (Integer, Double, Long...)
    public static <T extends Number> double sum(List<T> numbers) {
        double total = 0;
        for (T n : numbers) {
            total = total + n.doubleValue();
        }
        return total;
    }

    public static <T extends Number> double average(List<T> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        return sum(numbers) / numbers.size();
    }

    // Extra: the same sum, written with a wildcard
    public static double sumAll(List<? extends Number> numbers) {
        double total = 0;
        for (Number n : numbers) {
            total = total + n.doubleValue();
        }
        return total;
    }
}
