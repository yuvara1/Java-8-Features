# Student Stream Operations

This exercise set is designed to strengthen understanding of the **Java Stream API** through practical, logic-heavy, and real-world student data processing scenarios.

---

## 1. Data Generation

- Create a **StudentStream** class that generates a stream of **Student** objects using random data.
- Each **Student** must contain the following attributes:
  - `id`
  - `firstName`
  - `lastName`
  - `age`
  - `gender`
  - `department`
  - `joinedYear`
  - `grade`
  - `isActive`
  - `email`
  - `city`
- Use the **Stream API** to generate a list of **100 students**.

---

## 2. Basic Filtering

1. Find students whose **first name starts with "A"** and print their full name and email.
2. Find students who are **above 20 years** and belong to the **Computer Science** department.

---

## 3. Grouping & Aggregation

1. Group students by **department** and count students in each group.
2. Group students by department and find the **maximum grade** in each.

---

## FILTER + MAP + SORT

1. Find all **active students** whose grade is above their department average.
2. List students who joined **before 2022** and sort them by **grade**, then **age**.
3. Find students whose email domain is **gmail.com** and whose city is not null.
4. Extract full names of the **top 5 students** sorted by grade.

---

## DISTINCT + STATEFUL LOGIC

1. Find distinct cities where **more than 3 students** are present.
2. List departments that have **both active and inactive** students.
3. Find departments containing **duplicate email domains**.
4. Retrieve students having **unique first names** (no duplicates).

---

## GROUPING + COLLECTING

1. Group students by city and count only **active** students.
2. Group students by department and collect **only email IDs**.
3. Group students by joined year and compute the **average grade**.

---

## REDUCTION + PRIMITIVE STREAMS

1. Calculate the **total grade** of active students per department.
2. Find the **maximum age** among inactive students.
3. Find the **sum of grades** of students from Chennai using `reduce()`.
4. Compute the **overall average grade**, excluding inactive students.

---

## OPTIONAL + SAFE HANDLING

1. Safely find the **top-grade student** in each department using `Optional`.
2. Find a student with **grade > 9** and **age < 20**, handling absence safely.
3. Retrieve the email of the **youngest active student** while avoiding `NullPointerException`.

---

## SHORT-CIRCUITING OPERATIONS

1. Check if **any department** has a student with grade `< 4`.
2. Find the **first inactive student** who joined after 2021.
3. Verify whether **all departments** have at least one active student.

---

## COLLECTORS – ADVANCED

1. Partition students into **active** and **inactive**, then sort each group by grade.
2. Group students by department and extract the **top 2 students** by grade.
3. Group students by city and find the **lowest-grade student**.
4. Group students by department and calculate **grade variance** using manual logic.

---

## PARALLEL STREAMS (THINKING-BASED)

1. Identify operations that are **unsafe for parallel streams**.
2. Convert a sequential stream to **parallel** and analyze order impact.
3. Count students with grade `> 8` using **parallel streams** and ensure correctness.

---

## LOGIC-HEAVY PROBLEMS

1. Find students whose grade is above both **overall** and **department** averages.
2. From each department, find the **youngest top-grade student**.
3. Identify cities where **all students are active**.
4. Find departments where the **average grade increases** by joined year.
5. Find students whose **email domain appears only once** in the dataset.
6. For each department, **skip the top student** and return the next two.
