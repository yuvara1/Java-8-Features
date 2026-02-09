package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Intermediate operations are used to transform a stream into another stream.
 * They are lazy, meaning they do not execute until a terminal operation is invoked.
 * Examples of intermediate operations include:
 * <ul>
 *   <li><b>filter:</b> Used to select elements based on a condition.</li>
 *   <li><b>map:</b> Used to transform each element into another form.</li>
 *   <li><b>sorted:</b> Used to sort the elements in the stream.</li>
 *   <li><b>distinct:</b> Used to remove duplicate elements from the stream.</li>
 *   <li><b>limit:</b> Used to limit the number of elements in the stream.</li>
 *   <li><b>skip:</b> Used to skip a certain number of elements in the stream.</li>
 *   <li><b>flatMap:</b> Used to flatten a stream of collections into a single stream.</li>
 *   <li><b>peek:</b> Used to perform an action on each element as it is processed, without modifying the stream.</li>
 * </ul>
 */
public class IntermediateOperation {
    /**
     * 1. <b>filter:</b> Used to select elements based on a condition.
     */
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> filterOddNumbers(Stream<Integer> numbers) {
        return numbers.filter(number -> number % 2 != 0)
                .collect(Collectors.toList());
    }

    /**
     * 2. <b>map:</b> Used to transform each element into another form.
     */
    public List<String> mapToString(List<Integer> numbers) {
        return numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    public List<Integer> mapToSquare(Stream<Integer> numbers) {
        return numbers.map(number -> number * number)
                .collect(Collectors.toList());
    }

    /**
     * 3. <b>sorted:</b> Used to sort the elements in the stream.
     */
    public List<Integer> sortNumbers(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> sortStrings(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> sortByLengthDesc(List<String> strings) {
        return strings.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .collect(Collectors.toList());
    }

    /**
     * 4. <b>distinct:</b> Used to remove duplicate elements from the stream.
     */
    public List<Integer> distinctNumbers(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> distinctStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * 5. <b>limit:</b> Used to limit the number of elements in the stream.
     */
    public List<Integer> limitNumbers(List<Integer> numbers, int limit) {
        return numbers.stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

    public List<String> limitStrings(List<String> strings, int limit) {
        return strings.stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

    /**
     * 6. <b>skip:</b> Used to skip a certain number of elements in the stream.
     */
    public List<Integer> skipNumbers(List<Integer> numbers, int skip) {
        return numbers.stream()
                .skip(skip)
                .collect(Collectors.toList());
    }

    public List<String> skipStrings(List<String> strings, int skip) {
        return strings.stream()
                .skip(skip)
                .collect(Collectors.toList());
    }

    /**
     * 7. <b>flatMap:</b> Used to flatten a stream of collections into a single stream.
     */
    public List<Integer> flatMapToNumbers(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public List<String> flatMapToStrings(List<List<String>> listOfLists) {
        return listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    /**
     * 8. <b>peek:</b> Used to perform an action on each element as it is processed, without modifying the stream.
     */
    public List<Integer> peekNumbers(List<Integer> numbers) {
        return numbers.stream()
                .peek(number -> System.out.println("Processing number: " + number))
                .collect(Collectors.toList());
    }

    public List<String> peekStrings(List<String> strings) {
        return strings.stream()
                .peek(str -> System.out.println("Processing string: " + str))
                .collect(Collectors.toList());
    }


}
