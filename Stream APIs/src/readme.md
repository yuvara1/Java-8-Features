# Components in Java Stream API

The **Java Stream API** is a powerful feature introduced in **Java 8** that allows you to process collections of data in
a **functional programming style**. It helps write clean, concise, and readable code by eliminating explicit loops and
focusing on *what* to do rather than *how* to do it.

A stream represents a **sequence of elements** and supports operations such as **filtering, mapping, and reducing**.

---

## 1. Stream Creation

You can create streams from various data sources such as **collections, arrays, files, or generators**.

### Example: Creating a Stream from a Collection

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> numberStream = numbers.stream();

// Example: Creating a Stream from an Array

javaString[] names = {"Alice", "Bob", "Charlie"};
Stream<String> nameStream = Arrays.stream(names);

//Example: Creating a Stream from a File
Path path = Paths.get("data.txt");
Stream<String> lines = Files.lines(path);
```

## 2. Intermediate Operations

Intermediate operations are **lazy** and return a new stream. They are used to **transform** or **filter** the data.

2.1) ***Filtering***: Select elements based on a condition.

```java
Stream<Integer> evenNumbers = numberStream.filter(n -> n % 2 == 0);
```

2.2) ***map***: Transform each element into another form.

```java
Stream<Integer> squaredNumbers = numberStream.map(n -> n * n);
```

2.3) ***flatMap***: Flatten nested structures into a single stream.

```java
import java.util.stream.Stream;

Stream<Integer> nestedStream = Stream.of(Stream.of(1, 2), Stream.of(3, 4));
Stream<Integer> flatStream = nestedStream.flatMap(s -> s);

```

2.4) ***sorted***: Sort the elements in natural order or using a custom comparator.

```java
import java.util.stream.Stream;

Stream<Integer> unsortedStream = Stream.of(5, 3, 1, 4, 2);
Stream<Integer> sortedStream = unsortedStream.sorted();
```

2.5) ***distinct***: Remove duplicate elements.

```java
Stream<Integer> duplicateStream = Stream.of(1, 2, 2, 3, 4, 4, 5);
Stream<Integer> distinctStream = duplicateStream.distinct();
```

2.6) ***limit***: Limit the number of elements in the stream.

```java
Stream<Integer> limitedStream = numberStream.limit(3);
```

2.7) ***skip***: Skip a specified number of elements.\

```java
import java.util.stream.Stream;

Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
Stream<Integer> skippedStream = numberStream.skip(2);
```

2.8) ***peek***: Perform an action on each element without modifying the stream.

```java
Stream<Integer> peekedStream = numberStream.peek(n -> System.out.println("Processing: " + n));
```

---

## 3. Terminal Operations

Terminal operations are **eager** and produce a result or side effect. They trigger the processing of the stream.\

3.1) ***forEach***: Perform an action for each element.

```java
Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
numberStream.

forEach(n ->System.out.

println(n));
```

3.2) ***collect***: Collect the elements into a collection or a summary result.

```java

Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
List<Integer> collectedNumbers = numberStream.collect(Collectors.toList());
```

3.3) ***reduce***: Combine elements to produce a single result.

```java
Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
Optional<Integer> sum = numberStream.reduce((a, b) -> a + b);
```

3.4) ***count***: Count the number of elements in the stream.

```java
Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
long count = numberStream.count();
```

3.5) ***anyMatch***: Check if any elements match a given predicate.

```java
Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
boolean hasEven = numberStream.anyMatch(n -> n % 2 == 0);
```

3.6) ***allMatch***: Check if all elements match a given predicate.

```java
Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
boolean allEven = numberStream.allMatch(n -> n % 2 == 0);
```

3.7) ***noneMatch***: Check if no elements match a given predicate.

```java
Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
boolean noneNegative = numberStream.noneMatch(n -> n < 0);
```

3.8) ***findFirst***: Find the first element in the stream.

```java
Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
Optional<Integer> first = numberStream.findFirst();
```

3.9) ***findAny***: Find any element in the stream (useful in parallel streams).

```java
Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
Optional<Integer> any = numberStream.findAny();
```

---

## 4. Parallel Streams

The Stream API also supports **parallel processing**. You can create a parallel stream using the `parallelStream()`
method. Parallel streams can improve performance by utilizing multiple CPU cores, but they should be used with caution,
especially when dealing with shared mutable data or when the order of processing matters.

### Example: Creating a Parallel Stream

4.1) ***Creating a Parallel Stream from a Collection***

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> parallelStream = numbers.parallelStream();
``` 

4.2) ***Creating a Parallel Stream from an Array***

```java
Integer[] numbersArray = {1, 2, 3, 4, 5};
Stream<Integer> parallelStream = Arrays.stream(numbersArray).parallel();
```

4.3) ***Creating a Parallel Stream from a File***

```java
Path path = Paths.get("data.txt");
Stream<String> parallelLines = Files.lines(path).parallel();
```

4.4) ***Using Parallel Streams for Processing***

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> squaredNumbers = numbers.parallelStream()
        .map(n -> n * n)
        .collect(Collectors.toList());
```

4.5) ***Caution with Parallel Streams***
When using parallel streams, be mindful of the following:

- Avoid using shared mutable data structures, as they can lead to race conditions.
- Be cautious with operations that depend on the order of processing, as parallel streams may process elements in an
  unpredictable order.
    - Test the performance of parallel streams, as they may not always provide a performance boost, especially for small
      datasets or simple operations.
    - Consider using `sequential()` to switch back to a sequential stream if needed.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> squaredNumbers = numbers.parallelStream()
        .map(n -> n * n)
        .sequential() // Switch back to sequential stream if needed       
        .collect(Collectors.toList());
```

4.6) ***Performance Considerations***
While parallel streams can improve performance, they are not always the best choice. The performance benefits depend on factors such as the size of the dataset, the complexity of the operations, and the available hardware. It's important to benchmark and test your code to determine whether parallel streams are appropriate for your specific use case.

4.7) ***Best Practices for Parallel Streams***
- Use parallel streams for computationally intensive tasks that can be easily parallelized.
- Avoid using parallel streams for I/O-bound tasks, as they may not provide significant performance benefits.
- Be cautious when using parallel streams with shared mutable data structures, as they can lead to race conditions and other concurrency issues.
- Always test and benchmark your code to ensure that parallel streams are providing the expected performance benefits.
- Consider using `ForkJoinPool` for more control over parallelism, especially when dealing with custom thread pools or specific performance requirements.

```java
ForkJoinPool customThreadPool = new ForkJoinPool(4); // Create a custom thread
customThreadPool.submit(() -> {
    List<Integer> squaredNumbers = numbers.parallelStream()
            .map(n -> n * n)
            .collect(Collectors.toList());
}).get(); // Wait for the task to complete
```
---
## 5. Conclusion

The Java Stream API provides a powerful and expressive way to process collections of data. By using streams, you can
write more concise and readable code while taking advantage of functional programming concepts. Whether you're
filtering, transforming, or reducing data, the Stream API offers a wide range of operations to help you achieve your
goals efficiently.
