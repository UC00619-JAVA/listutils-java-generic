import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("Ana", "Rui", "Marta");
        List<Integer> ages = List.of(25, 31, 19);
        List<Double> prices = List.of(2.5, 4.0, 1.25);

        // first and last work with any type, and return that type
        String firstName = ListUtils.first(names);
        Integer lastAge = ListUtils.last(ages);
        System.out.println("First name: " + firstName);
        System.out.println("Last age: " + lastAge);

        System.out.println("Names:");
        ListUtils.printAll(names);

        // sum and average only accept lists of numbers
        System.out.println("Sum of ages: " + ListUtils.sum(ages));
        System.out.println("Average age: " + ListUtils.average(ages));
        System.out.println("Sum of prices: " + ListUtils.sum(prices));

        // Empty list
        List<String> empty = List.of();
        System.out.println("First of empty list: " + ListUtils.first(empty));

        // Extra: wildcard version
        System.out.println("sumAll(prices): " + ListUtils.sumAll(prices));

        // Extra: this line does not compile (String is not a Number)
        // ListUtils.sum(names);
    }
}
