import streams.CreateStream;
import streams.IntermediateOperation;
import streams.TerminalOperation;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Manipulating data with and without Java Streams.
 *
 * <p><b>Without Streams:</b>
 * <p>We need to write more boilerplate code to iterate over the collection,
 * check conditions, and store the result manually.</p>
 *
 * <pre>{@code
 * ArrayList<Integer> numbers = new ArrayList<>();
 * numbers.add(1);
 * numbers.add(2);
 * numbers.add(3);
 *
 * List<Integer> evenNumbers = new ArrayList<>();
 * for (Integer number : numbers) {
 *     if (number % 2 == 0) {
 *         evenNumbers.add(number);
 *     }
 * }
 *
 * System.out.println(evenNumbers);
 * }</pre>
 *
 * <p><b>With Streams:</b>
 * <p>Streams allow us to write concise and readable code for data manipulation.</p>
 *
 * <pre>{@code
 * ArrayList<Integer> numbers = new ArrayList<>();
 * numbers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8));
 *
 * List<Integer> evenNumbers = numbers.stream()
 *     .filter(number -> number % 2 == 0)
 *     .collect(Collectors.toList());
 *
 * System.out.println(evenNumbers);
 * }</pre>
 */

public class Main {
    /**
     * <h3>Key features of Java Streams include:</h3>
     * <ul>
     *   <li><b>Declarative Style:</b> Streams allow you to express complex data processing queries in a clear and concise way.</li>
     *   <li><b>Lazy Evaluation:</b> Stream operations are lazy, meaning they are not executed until a terminal operation is invoked. This allows for efficient processing of large data sets.</li>
     *   <li><b>Parallel Processing:</b> Streams can be easily parallelized, allowing for improved performance on multi-core processors.</li>
     *   <li><b>Functional Programming:</b> Streams support functional programming paradigms, enabling you to use lambda expressions and method references for more expressive code.</li>
     * </ul>
     * <h3> Components in Streams Include:</h3>
     * <ul>
     *   <li><b>Source:</b> The data source for the stream, such as a collection, array, or I/O channel.</li>
     *   <li><b>Intermediate Operations:</b> Operations that transform the stream, such as filter, map, and sorted. These operations are lazy and return a new stream.</li>
     *   <li><b>Terminal Operations:</b> Operations that produce a result or side-effect, such as collect, forEach, and reduce. These operations trigger the processing of the stream.</li>
     * </ul>
     *
     */
    public static void main(String[] args) throws IOException {
        // 1. Ways of creating a stream
        CreateStream stream = new CreateStream();


        // 2. Intermediate operations
        System.out.println("\n--- Intermediate Operations ---");
        System.out.println("------------ 1. FILTERING -------------");
        System.out.println("1.1) Filtering even numbers from a list:");
        IntermediateOperation intermediateOperation = new IntermediateOperation();
        List<Integer> evenNumbers = intermediateOperation.filterEvenNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Even numbers: " + evenNumbers);

        System.out.println("\n1.2) Filtering odd numbers from a list:");
        List<Integer> oddNumbers = intermediateOperation.filterOddNumbers(stream.streamFromArray);
        System.out.println("Odd numbers: " + oddNumbers);

        System.out.println("\n------------ 2. MAPPING -------------");
        System.out.println("2.1) Mapping integers to strings: ");
        List<?> mapOfString = intermediateOperation.mapToString(List.of(12, 34, 56, 78, 90));
        System.out.println("Class from: " + mapOfString.getFirst().getClass().getName());

        System.out.println("\n2.2) Mapping integers to their squares: ");
        List<Integer> mapOfSquare = intermediateOperation.mapToSquare((Stream<Integer>) stream.streamFromValues);
        System.out.println("Squares: " + mapOfSquare);

        System.out.println("\n------------ 3. SORTING -------------");
        System.out.println("3.1) Sorting a list of integers: ");
        List<Integer> sortedNumbers = intermediateOperation.sortNumbers(stream.streamFromCollection.collect(Collectors.toList()));

        System.out.println("Sorted numbers: " + sortedNumbers);


        System.out.println("\n3.2) Sorting a list of strings: ");
        List<String> sortedStrings = intermediateOperation.sortStrings(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));

        System.out.println("Sorted strings: " + sortedStrings);


        System.out.println("\n3.3) sorting by length of string: ");
        List<String> sortedByLength = intermediateOperation.sortByLengthDesc(sortedStrings);

        System.out.println("Sorted by length (desc): " + sortedByLength);


        System.out.println("\n------------ 4. DISTINCT -------------");
        System.out.println("4.1) Distinct numbers from a list: ");
        List<Integer> distinctNumbers = intermediateOperation.distinctNumbers(List.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Distinct numbers: " + distinctNumbers);

        System.out.println("\n4.2) Distinct strings from a list: ");
        List<String> distinctStrings = intermediateOperation.distinctStrings(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi", "YUVARAJ", "yuvav"));

        System.out.println("Distinct strings: " + distinctStrings);


        System.out.println("\n------------ 5. LIMIT -------------");
        System.out.println("5.1) Limiting a stream to the first 5 elements: ");
        List<Integer> limitedNumbers = intermediateOperation.limitNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15), 5);

        System.out.println("Limited numbers: " + limitedNumbers);


        System.out.println("\n5.2) Limiting a stream to the first 3 elements: ");
        List<String> limitedStrings = intermediateOperation.limitStrings(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"), 3);

        System.out.println("Limited strings: " + limitedStrings);


        System.out.println("\n------------ 6. SKIP -------------");
        System.out.println("6.1) Skipping the first 5 elements of a stream: ");
        List<Integer> skippedNumbers = intermediateOperation.skipNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15), 5);

        System.out.println("Skipped numbers: " + skippedNumbers);


        System.out.println("\n6.2) Skipping the first 3 elements of a stream: ");
        List<String> skippedStrings = intermediateOperation.skipStrings(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"), 3);

        System.out.println("Skipped strings: " + skippedStrings);


        System.out.println("\n ----------- 7. FLATMAP -------------");
        System.out.println("7.1) Flattening a stream of lists of integers: ");
        List<Integer> flatMappedNumbers = intermediateOperation.flatMapToNumbers(List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6)));

        System.out.println("FlatMapped numbers: " + flatMappedNumbers);


        System.out.println("\n7.2) Flattening a stream of lists of strings: ");
        List<String> flatMappedStrings = intermediateOperation.flatMapToStrings(List.of(List.of("YUVARAJ", "yuvav"), List.of("boopal", "agan"), List.of("Ravi chandrain", "siva", "abi")));

        System.out.println("FlatMapped strings: " + flatMappedStrings);


        System.out.println("\n------------ 8. PEEK -------------");
        System.out.println("8.1) Using peek to debug a stream of integers: ");
        List<Integer> peekedNumbers = intermediateOperation.peekNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Peeked numbers: " + peekedNumbers);

        System.out.println("\n8.2) Using peek to debug a stream of strings: ");
        List<String> peekedStrings = intermediateOperation.peekStrings(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));
        System.out.println("Peeked strings: " + peekedStrings);


        // 3. Terminal operations
        System.out.println("\n--- Terminal Operations ---");
        TerminalOperation terminalOperation = new TerminalOperation();

        System.out.println("\n ------------1. forEach -------------");
        System.out.println("1.1) Using forEach to print each element in a stream of integers: ");
        terminalOperation.printNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("1.2) using forEachOrdered to print each element in a parallel stream of strings: ");
        terminalOperation.namesInParallel(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));

        System.out.println("\n ------------2. collect -------------");
        System.out.println("2.1) Collecting even numbers from a stream into a list: ");
        terminalOperation.collectToList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("\n2.2) Collecting names starting with 'A' from a stream into a set: ");
        terminalOperation.collectToSet(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));

        System.out.println("\n2.3) Collecting names starting with 'A' from a stream into a map: ");
        terminalOperation.collectToMap(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));

        System.out.println("\n ------------3. reduce -------------");
        System.out.println("3.1) Reducing a stream of integers to their sum: ");
        terminalOperation.reduceSum(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("\n3.2) Reducing a stream of integers to their product: ");
        terminalOperation.reduceProduct(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("\n3.3) Reducing a stream of maximum value: ");
        terminalOperation.reduceMax(List.of(1, 2, 3, 4, 5, 6, 101, 7, 8, 9, 10));

        System.out.println("------------ 4. count -------------");
        System.out.println("4.1) Counting the number of even numbers in a stream: ");
        terminalOperation.countEvenNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("\n4.2) Counting the number of names starting with 'A' in a stream: ");
        terminalOperation.countNamesStartingWithA(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));

        System.out.println("\n4.3) Counting the total number of characters in a stream of strings: ");
        terminalOperation.countTotalCharacters(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));

        System.out.println("\n------------ 5. anyMatch, allMatch, noneMatch -------------");
        System.out.println("5.1) Checking if any numbers in a stream are even: ");
        terminalOperation.anyMatchEven(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("\n5.2) Checking if any names in a stream start with 'A': ");
        terminalOperation.anyMatchNameStartingWithA(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));


        System.out.println("------------ 6. findFirst, findAny -------------");
        System.out.println("6.1) Finding the first even number in a stream: ");
        terminalOperation.findFirstEven(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("\n6.2) Finding any name starting with 'A' in a stream: ");
        terminalOperation.findAnyNameStartingWithA(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));

        System.out.println("\n ----------- 7. allMatch -------------");
        System.out.println("7.1) Checking if all numbers in a stream are even: ");
        terminalOperation.allMatchEven(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("\n7.2) Checking if all names in a stream start with 'A': ");
        terminalOperation.allMatchNameStartingWithA(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));

        System.out.println("\n------------ 8. noneMatch -------------");
        System.out.println("8.1) Checking if no numbers in a stream are negative: ");
        terminalOperation.noneMatchEven(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("\n8.2) Checking if no names in a stream start with 'A': ");
        terminalOperation.noneMatchNameStartingWithA(List.of("YUVARAJ", "yuvav", "boopal", "agan", "Ravi chandrain", "siva", "abi"));



    }

}