# 🚀 Java Lambda Expressions – Complete Guide (With & Without Lambda)

This README provides a **complete, interview-ready comparison** of **ALL common lambda expression use cases in Java**, shown **WITHOUT lambda** and **WITH lambda** side by side.

> ✅ Java Version: **Java 8+**
> 🎯 Useful for: **Interviews (Zoho / Product Companies), Clean Code, Stream API**

---

## 🔹 What is a Lambda Expression?

A **lambda expression** is a concise way to represent an **anonymous function**. It is mainly used to implement **functional interfaces** (interfaces with only one abstract method).

**Syntax:**

```java
(parameters) -> expression
(parameters) -> { statements }
```

---

## 1️⃣ Runnable (Thread)

### ❌ Without Lambda

```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Thread running");
    }
};
new Thread(r).start();
```

### ✅ With Lambda

```java
Runnable r = () -> System.out.println("Thread running");
new Thread(r).start();
```

---

## 2️⃣ Custom Functional Interface (No Parameters)

```java
interface Hello {
    void sayHello();
}
```

### ❌ Without Lambda

```java
Hello h = new Hello() {
    public void sayHello() {
        System.out.println("Hello World");
    }
};
h.sayHello();
```

### ✅ With Lambda

```java
Hello h = () -> System.out.println("Hello World");
h.sayHello();
```

---

## 3️⃣ Functional Interface (With Parameters)

```java
interface Add {
    int sum(int a, int b);
}
```

### ❌ Without Lambda

```java
Add a = new Add() {
    public int sum(int x, int y) {
        return x + y;
    }
};
System.out.println(a.sum(10, 20));
```

### ✅ With Lambda

```java
Add a = (x, y) -> x + y;
System.out.println(a.sum(10, 20));
```

---

## 4️⃣ Comparator (Sorting)

### ❌ Without Lambda

```java
Collections.sort(list, new Comparator<Integer>() {
    public int compare(Integer a, Integer b) {
        return a - b;
    }
});
```

### ✅ With Lambda

```java
Collections.sort(list, (a, b) -> a - b);
```

---

## 5️⃣ forEach Loop

### ❌ Without Lambda

```java
for(Integer i : list) {
    System.out.println(i);
}
```

### ✅ With Lambda

```java
list.forEach(i -> System.out.println(i));
```

---

## 6️⃣ Predicate (Condition Check)

### ❌ Without Lambda

```java
Predicate<Integer> even = new Predicate<Integer>() {
    public boolean test(Integer n) {
        return n % 2 == 0;
    }
};
System.out.println(even.test(10));
```

### ✅ With Lambda

```java
Predicate<Integer> even = n -> n % 2 == 0;
System.out.println(even.test(10));
```

---

## 7️⃣ Consumer (No Return Value)

### ❌ Without Lambda

```java
Consumer<String> c = new Consumer<String>() {
    public void accept(String s) {
        System.out.println(s);
    }
};
c.accept("Java");
```

### ✅ With Lambda

```java
Consumer<String> c = s -> System.out.println(s);
c.accept("Java");
```

---

## 8️⃣ Function (Input → Output)

### ❌ Without Lambda

```java
Function<Integer, Integer> square = new Function<Integer, Integer>() {
    public Integer apply(Integer n) {
        return n * n;
    }
};
System.out.println(square.apply(5));
```

### ✅ With Lambda

```java
Function<Integer, Integer> square = n -> n * n;
System.out.println(square.apply(5));
```

---

## 9️⃣ Supplier (No Input)

### ❌ Without Lambda

```java
Supplier<Double> random = new Supplier<Double>() {
    public Double get() {
        return Math.random();
    }
};
System.out.println(random.get());
```

### ✅ With Lambda

```java
Supplier<Double> random = () -> Math.random();
System.out.println(random.get());
```

---

## 🔟 Stream API

### ❌ Without Lambda

```java
for(Integer n : list) {
    if(n % 2 == 0) {
        System.out.println(n * n);
    }
}
```

### ✅ With Lambda

```java
list.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * n)
    .forEach(System.out::println);
```

---

## 1️⃣1️⃣ Method Reference (Lambda Shortcut)

### ❌ With Lambda

```java
list.forEach(n -> System.out.println(n));
```

### ✅ Method Reference

```java
list.forEach(System.out::println);
```

---

## 1️⃣2️⃣ Multiple Statements Lambda

### ❌ Without Lambda

```java
Add add = new Add() {
    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }
};
```

### ✅ With Lambda

```java
Add add = (a, b) -> {
    int result = a + b;
    return result;
};
```

---

## 🧠 Interview Golden Rule

> **Lambda expressions replace anonymous inner classes used for functional interfaces.**

---

## 📌 Summary Table

| Feature          | Without Lambda | With Lambda |
| ---------------- | -------------- | ----------- |
| Lines of Code    | More           | Less        |
| Readability      | Low            | High        |
| Boilerplate      | High           | Minimal     |
| Functional Style | ❌              | ✅           |

---

### ✅ End of README

Happy Coding! ☕🚀
