import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {

        // Lambda expression to create a thread
        // 1. Using a lambda expression to create a thread
        System.out.println("======== 1. Runnable with Lambda Expression ========");
        Runnable r1 = () -> System.out.println("Running Lambda Expression");
        new Thread(r1).start();


        // 2. Using a lambda expression to implement a functional interface
        System.out.println("======== 2. Calculator with Lambda Expression ========");
        Calculator calculator = (a, b) -> a + b;
        int result = calculator.calculate(5, 3);
        System.out.println("Result of 5 + 3 = " + result);

        // 3. Using a lambda expression with a collection
        System.out.println("======== 3. Using Lambda with Collections ========");
        List<String> names = Arrays.asList("Tamil", "English", "Hindi", "French");
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted Names: " + names);

        // 4. Using a lambda expression with forEach
        System.out.println("======== 4. Using Lambda with forEach ========");
        names.forEach(System.out::println);

        // 5. Using a lambda expression with a predicate
        System.out.println("======== 5. Using Lambda with Predicate ========");
        List<String> topActors = Arrays.asList("Rajinikanth", "Amitabh Bachchan", "Shah Rukh Khan", "Leonardo DiCaprio", "Brad Pitt", "Tom Hanks", "Johnny Depp", "Will Smith", "Denzel Washington", "Morgan Freeman");
        Predicate<String> isEndsWithN = (name) -> name.endsWith("n");
        System.out.println("Actors whose names end with 'n':");
        List<String> filteredActors = topActors.stream()
                .filter(isEndsWithN)
                .toList();
        filteredActors.forEach(System.out::println);

        // 6. Using a lambda expression with a consumer
        System.out.println("======== 6. Using Lambda with Consumer ========");
        List<String> movies = Arrays.asList("Inception", "The Dark Knight", "Pulp Fiction", "The Shawshank Redemption", "The Godfather");
        Consumer<String> printMovie = (movie) -> System.out.println("Movie: " + movie);
        movies.forEach(printMovie);

        // 7. Using a lambda expression with a Function (Input -> Output)
        System.out.println("======== 7. Using Lambda with Function ========");
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
        Function<Integer, String> getLanguageByIndex = index -> {
            if (index >= 0 && index < languages.size()) {
                return languages.get(index);
            } else {
                return "Index out of bounds";
            }
        };
        System.out.println("Language at index 2: " + getLanguageByIndex.apply(2));
        System.out.println("Language at index 5: " + getLanguageByIndex.apply(5));
        System.out.println("Language at index -1: " + getLanguageByIndex.apply(-1));

        // 8. Using a lambda expression with a Supplier (No input -> Output)
        System.out.println("======== 8. Using Lambda with Supplier ========");
        Supplier<String> getCurrentTime = () -> new Date().toString();
        System.out.println("Current Time: " + getCurrentTime.get());

        // 9. Using a lambda expression in Stream API
        System.out.println("======== 9. Using Lambda with Stream API ========");
        List<Integer> numbers = Arrays.asList(6, 3, 4, 5, 8, 7, 2, 10, 19, -10, -5, 15, 3);
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);

        // 10. Using a lambda expression with a method reference
        System.out.println("======== 10. Using Lambda with Method Reference ========");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");
        fruits.forEach(System.out::println);


    }
}