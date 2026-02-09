package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <h3>Terminal Operations in Java Streams</h3>
 * <ol>
 *   <li><b>forEach:</b> Used to perform an action for each element in the stream. It is a void operation and does not return a result.</li>
 *   <li><b>collect:</b> Used to accumulate the elements of the stream into a collection, such as a List, Set, or Map. It is a mutable reduction operation.</li>
 *   <li><b>reduce:</b> Used to perform a reduction on the elements of the stream, using an associative accumulation function. It can return an Optional or a specific type depending on the parameters provided.</li>
 *   <li><b>count:</b> Used to count the number of elements in the stream. It returns a long value.</li>
 *   <li><b>anyMatch:</b> Used to check if any elements in the stream match a given predicate. It returns a boolean value.</li>
 *   <li><b>allMatch:</b> Used to check if all elements in the stream match a given predicate. It returns a boolean value.</li>
 *   <li><b>noneMatch:</b> Used to check if no elements in the stream match a given predicate. It returns a boolean value.</li>
 *   <li><b>findFirst:</b> Used to find the first element in the stream that matches a given predicate. It returns an Optional.</li>
 *   <li><b>findAny:</b> Used to find any element in the stream that matches a given predicate. It returns an Optional.</li>
 * </ol>
 *
 */
public class TerminalOperation {

    /**
     * 1. <b>forEach</b> is used to perform an action for each element in the stream. It is a void operation and does not return a result.
     */
    public void printNumbers(List<Integer> numbers) {
        numbers.stream()
                .forEach(number -> System.out.println(number));
    }

    public void namesInParallel(List<String> names) {
        names.parallelStream()
                .forEachOrdered(name -> System.out.println(name));
    }

    /**
     * 2. <b>collect</b> is used to accumulate the elements of the stream into a collection, such as a List, Set, or Map. It is a mutable reduction operation.
     *
     */
    public void collectToList(List<Integer> numbers) {
        List<Integer> collectedNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collectedNumbers);
    }

    public void collectToSet(List<String> names) {
        var collectedNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toSet());
        System.out.println(collectedNames);
    }

    public void collectToMap(List<String> names) {
        var collectedNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println(collectedNames);

    }

    /**
     * 3. <b>reduce</b> is used to perform a reduction on the elements of the stream, using an associative accumulation function. It can return an Optional or a specific type depending on the parameters provided.
     *
     */
    public void reduceSum(List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public void reduceProduct(List<Integer> numbers) {
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }

    public void reduceMax(List<Integer> numbers) {
        var max = numbers.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(max);

    }

    /**
     * 4. <b>count</b> is used to count the number of elements in the stream. It returns a long value.
     *
     */
    public void countEvenNumbers(List<Integer> numbers) {
        long count = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(count);
    }

    public void countNamesStartingWithA(List<String> names) {
        long count = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println(count);
    }

    public void countTotalCharacters(List<String> names) {
        long totalCharacters = names.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(totalCharacters);
    }


    /**
     * 5. <b>anyMatch</b> is used to check if any elements in the stream match a given predicate. It returns a boolean value.
     *
     */
    public void anyMatchEven(List<Integer> numbers) {
        boolean hasEven = numbers.stream()
                .anyMatch(number -> number % 2 == 0);
        System.out.println(hasEven);
    }

    public void anyMatchNameStartingWithA(List<String> names) {
        boolean hasNameStartingWithA = names.stream()
                .anyMatch(name -> name.startsWith("A"));
        System.out.println(hasNameStartingWithA);
    }


    /**
     * 6. <b>allMatch</b> is used to check if all elements in the stream match a given predicate. It returns a boolean value.
     *
     */
    public void allMatchEven(List<Integer> numbers) {
        boolean allEven = numbers.stream()
                .allMatch(number -> number % 2 == 0);
        System.out.println(allEven);
    }

    public void allMatchNameStartingWithA(List<String> names) {
        boolean allNamesStartingWithA = names.stream()
                .allMatch(name -> name.startsWith("A"));
        System.out.println(allNamesStartingWithA);
    }

    /**
     * 7. <b>noneMatch</b> is used to check if no elements in the stream match a given predicate. It returns a boolean value.
     *
     */
    public void noneMatchEven(List<Integer> numbers) {
        boolean noneEven = numbers.stream()
                .noneMatch(number -> number % 2 == 0);
        System.out.println(noneEven);
    }

    public void noneMatchNameStartingWithA(List<String> names) {
        boolean noneNamesStartingWithA = names.stream()
                .noneMatch(name -> name.startsWith("A"));
        System.out.println(noneNamesStartingWithA);
    }

    /**
     * 8. <b>findFirst</b> is used to find the first element in the stream that matches a given predicate. It returns an Optional.
     *
     */
    public void findFirstEven(List<Integer> numbers) {
        var firstEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .findFirst();
        System.out.println(firstEven);
    }

    public void findFirstNameStartingWithA(List<String> names) {
        var firstNameStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .findFirst();
        System.out.println(firstNameStartingWithA);
    }

    /**
     * 9. <b>findAny</b> is used to find any element in the stream that matches a given predicate. It returns an Optional.
     *
     */
    public void findAnyEven(List<Integer> numbers) {
        var anyEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .findAny();
        System.out.println(anyEven);
    }

    public void findAnyNameStartingWithA(List<String> names) {
        var anyNameStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .findAny();
        System.out.println(anyNameStartingWithA);
    }


}
