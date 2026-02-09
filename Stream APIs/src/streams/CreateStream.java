package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public Stream<Integer> streamFromCollection;
    public Stream<Integer> streamFromArray;
    public Stream<?> streamFromValues;
    Stream<?> streamFromGenerator;
    Stream<?> streamFromFile;
    Stream<?> streamFromRange;

    /**
     * Ways of creating a stream
     * <p>1. From a collection</p>
     * <pre>{@code
     * List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     * Stream<Integer> streamFromCollection = numbers.stream();
     * }</pre>
     * <p>
     * <p>
     * <p>2. From an array</p>
     * <pre>{@code
     * Integer[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     * Stream<Integer> streamFromArray = Stream.of(numberArray);
     * }</pre>
     *
     * <p>3. From individual values</p>
     * <pre>{@code
     * Stream<Integer> streamFromValues = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     * }</pre>
     *
     * <p>4. From a generator (example, not executed here)</p>
     * <pre>{@code
     *
     * Stream<Double> streamFromGenerator = Stream.generate(Math::random).limit(10);
     * }</pre>
     * <p>
     * <p>5. From a file (example, not executed here)</p>
     * <pre>{@code
     * Stream<String> streamFromFile = Files.lines(Paths.get("path/to/file.txt"));
     * }</pre>
     * <p> 6. From a range (example, not executed here)</p>
     * <pre>{@code
     * Stream<Integer> streamFromRange = Stream.iterate(1, n -> n + 1).limit(10);
     * }</pre>
     */

    public CreateStream() throws IOException {
        // This method demonstrates various ways to create streams in Java.
        streamFromCollection = List.of(6, 7, 8, 9, 10, 1, 2, 3, 4, 5).stream();

        streamFromArray = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        streamFromValues = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        streamFromGenerator = Stream.generate(Math::random).limit(10);


        // Note: The following line is commented out to avoid IOException in this example.
        Stream<String> streamFromFile = Files.lines(Paths.get("C:\\Users\\yuvar\\Documents\\api = 579b464db66ec23bdd000001438c1.txt"));
        streamFromRange = Stream.iterate(1, n -> n + 1).limit(10);

        System.out.println("Streams created successfully.");
        /*
        System.out.println("1. Stream from Collection: " + streamFromCollection);
        System.out.println("2. Stream from Array: " + streamFromArray);
        System.out.println("3. Stream from Values: " + streamFromValues);
        System.out.println("4. Stream from Generator: " + streamFromGenerator);
        System.out.println("5. Stream from File: " + streamFromFile);
        System.out.println("6. Stream from Range: " + streamFromRange);
        */

    }
}
