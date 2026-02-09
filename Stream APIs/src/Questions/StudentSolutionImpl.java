package Questions;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * <h3><b>Student Stream Operations</b></h3>
 *
 * <p>
 * This exercise set is designed to strengthen understanding of the
 * <b>Java Stream API</b> through practical, logic-heavy, and real-world
 * student data processing scenarios.
 * </p>
 * <p>
 * <hr/>
 *
 * <h4><b>1. Data Generation</b></h4>
 * <ul>
 *   <li>
 *     Create a <b>StudentStream</b> class that generates a stream of
 *     <b>Student</b> objects using random data.
 *   </li>
 *   <li>
 *     Each <b>Student</b> must contain the following attributes:
 *     <b>id</b>, <b>firstName</b>, <b>lastName</b>, <b>age</b>, <b>gender</b>,
 *     <b>department</b>, <b>joinedYear</b>, <b>grade</b>, <b>isActive</b>,
 *     <b>email</b>, and <b>city</b>.
 *   </li>
 *   <li>
 *     Use the <b>Stream API</b> to generate a list of <b>100 students</b>.
 *   </li>
 * </ul>
 * <p>
 * <hr/>
 *
 * <h4><b>2. Basic Filtering</b></h4>
 * <ol>
 *   <li>Find students whose <b>first name starts with "A"</b> and print their full name and email.</li>
 *   <li>Find students who are <b>above 20 years</b> and belong to the <b>Computer Science</b> department.</li>
 * </ol>
 * <p>
 * <hr/>
 *
 * <h4><b>3. Grouping & Aggregation</b></h4>
 * <ol>
 *   <li>Group students by <b>department</b> and count students in each group.</li>
 *   <li>Group students by department and find the <b>maximum grade</b> in each.</li>
 * </ol>
 * <p>
 * <hr/>
 *
 * <h4><b>FILTER + MAP + SORT</b></h4>
 * <ol>
 *   <li>Find all <b>active students</b> whose grade is above their department average.</li>
 *   <li>List students who joined <b>before 2022</b> and sort them by <b>grade</b>, then <b>age</b>.</li>
 *   <li>Find students whose email domain is <b>gmail.com</b> and whose city is not null.</li>
 *   <li>Extract full names of the <b>top 5 students</b> sorted by grade.</li>
 * </ol>
 * <p>
 * <hr/>
 *
 * <h4><b>DISTINCT + STATEFUL LOGIC</b></h4>
 * <ol>
 *   <li>Find distinct cities where <b>more than 3 students</b> are present.</li>
 *   <li>List departments that have <b>both active and inactive</b> students.</li>
 *   <li>Find departments containing <b>duplicate email domains</b>.</li>
 *   <li>Retrieve students having <b>unique first names</b> (no duplicates).</li>
 * </ol>
 * <p>
 * <hr/>
 *
 * <h4><b>GROUPING + COLLECTING</b></h4>
 * <ol>
 *   <li>Group students by city and count only <b>active</b> students.</li>
 *   <li>Group students by department and collect <b>only email IDs</b>.</li>
 *   <li>Group students by joined year and compute the <b>average grade</b>.</li>
 * </ol>
 * <p>
 * <hr/>
 *
 * <h4><b>REDUCTION + PRIMITIVE STREAMS</b></h4>
 * <ol>
 *   <li>Calculate the <b>total grade</b> of active students per department.</li>
 *   <li>Find the <b>maximum age</b> among inactive students.</li>
 *   <li>Find the <b>sum of grades</b> of students from Chennai using <b>reduce()</b>.</li>
 *   <li>Compute the <b>overall average grade</b>, excluding inactive students.</li>
 * </ol>
 * <p>
 * <hr/>
 *
 * <h4><b>OPTIONAL + SAFE HANDLING</b></h4>
 * <ol>
 *   <li>Safely find the <b>top-grade student</b> in each department using <b>Optional</b>.</li>
 *   <li>Find a student with <b>grade &gt; 9</b> and <b>age &lt; 20</b>, handling absence safely.</li>
 *   <li>Retrieve the email of the <b>youngest active student</b> while avoiding <b>NullPointerException</b>.</li>
 * </ol>
 * <p>
 * <hr/>
 *
 * <h4><b>SHORT-CIRCUITING OPERATIONS</b></h4>
 * <ol>
 *   <li>Check if <b>any department</b> has a student with grade &lt; 4.</li>
 *   <li>Find the <b>first inactive student</b> who joined after 2021.</li>
 *   <li>Verify whether <b>all departments</b> have at least one active student.</li>
 * </ol>
 * <p>
 * <hr/>
 *
 * <h4><b>COLLECTORS – ADVANCED</b></h4>
 * <ol>
 *   <li>Partition students into <b>active</b> and <b>inactive</b>, then sort each group by grade.</li>
 *   <li>Group students by department and extract the <b>top 2 students</b> by grade.</li>
 *   <li>Group students by city and find the <b>lowest-grade student</b>.</li>
 *   <li>Group students by department and calculate <b>grade variance</b> using manual logic.</li>
 * </ol>
 * <p>
 * <hr/>
 *
 * <h4><b>PARALLEL STREAMS (THINKING-BASED)</b></h4>
 * <ol>
 *   <li>Identify operations that are <b>unsafe for parallel streams</b>.</li>
 *   <li>Convert a sequential stream to <b>parallel</b> and analyze order impact.</li>
 *   <li>Count students with grade &gt; 8 using <b>parallel streams</b> and ensure correctness.</li>
 * </ol>
 * <p>
 * <hr/>
 *
 * <h4><b>LOGIC-HEAVY PROBLEMS</b></h4>
 * <ol>
 *   <li>Find students whose grade is above both <b>overall</b> and <b>department</b> averages.</li>
 *   <li>From each department, find the <b>youngest top-grade student</b>.</li>
 *   <li>Identify cities where <b>all students are active</b>.</li>
 *   <li>Find departments where the <b>average grade increases</b> by joined year.</li>
 *   <li>Find students whose <b>email domain appears only once</b> in the dataset.</li>
 *   <li>For each department, <b>skip the top student</b> and return the next two.</li>
 * </ol>
 */


public class StudentSolutionImpl {
    public List<Student> findStudentFirstNameStartsWithA(List<Student> students) {
        return students.stream()
                .filter(s -> s.getFirstName().startsWith("A"))
                .collect(Collectors.toList());
    }

    public List<Student> findStudentAgeAbove20AndDepartmentComputerScience(List<Student> students) {
        return students.stream()
                .filter(student -> student.getAge() > 20 && student.getDepartment().equalsIgnoreCase("computer science"))
                .collect(Collectors.toList());
    }

    public void groupStudentsByDepartment(List<Student> students) {
        Map<String, Long> groupedByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));

        System.out.println("\n3) Students grouped by department: \n");

        System.out.println("-".repeat(Integer.parseInt("37")));
        System.out.printf("| %-23s | %-7s |%n", "Department", "Count");
        System.out.println("-".repeat(Integer.parseInt("37")));

        groupedByDepartment.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.printf("%-25s | %-2s      |%n".formatted(entry.getKey(), entry.getValue())));
        System.out.println("-".repeat(Integer.parseInt("37")));
    }

    public void groupStudentsByMaxGradeByDepartment(List<Student> students) {
        Map<String, Student> groupedMyMaxGradeByDepartment = students.stream()
                .collect(Collectors.toMap(Student::getDepartment, Function.identity(), BinaryOperator.maxBy(Comparator.comparingDouble(Student::getGrade))));

        System.out.println("\n4) Students grouped by max grade by department: \n");
        System.out.println("-".repeat(Integer.parseInt("36")));
        System.out.printf("| %-20s | %-7s |%n", "Department", "Max Grade");
        System.out.println("-".repeat(Integer.parseInt("36")));
        groupedMyMaxGradeByDepartment.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Student::getGrade).reversed()))
                .forEach(entry -> System.out.printf("%-23s|%5.2f %6s %n", entry.getValue().getDepartment(), entry.getValue().getGrade(), "|"));

        System.out.println("-".repeat(Integer.parseInt("36")));
    }

    public List<Student> findActiveStudentsAboveDepartmentAverage(List<Student> students) {

        Map<String, Double> departmentAverageGrades = students.stream()
                .collect(
                        Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getGrade))
                );
        System.out.println("\n6) Department average grades: \n");
        System.out.println("-".repeat(Integer.parseInt("36")));
        System.out.printf("| %-20s | %-7s |%n", "Department", "Avg Grade");
        System.out.println("-".repeat(Integer.parseInt("36")));
        departmentAverageGrades.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.printf("%-23s|%5.2f %6s %n", entry.getKey(), entry.getValue(), "|"));
        System.out.println("-".repeat(Integer.parseInt("36")));

        return students.stream()
                .filter(Student::isActive)
                .filter(student -> student.getGrade() > departmentAverageGrades.get(student.getDepartment()))
                .collect(Collectors.toList());

    }

    public void findStudentsJoinedBefore2022SortedByGradeAndAge(List<Student> students) {
        List<Student> studentsBefore2022 = students.stream()
                .filter(student -> student.getJoinedYear() > 2019)
                .sorted(Comparator.comparingDouble(Student::getGrade))
                .sorted(Comparator.comparingInt(Student::getAge))
                .toList();

        System.out.println("-".repeat(Integer.parseInt("47")));
        System.out.printf("| %-17s | %-10s| %-3s | %-2s|%n", "Full Name", "Joined year", "Grade", "Age");
        System.out.println("-".repeat(Integer.parseInt("47")));
        studentsBefore2022.forEach(student -> System.out.printf("| %-17s | %-10s | %-5.2f | %-2d |%n".formatted(student.getFirstName() + " " + student.getLastName(), student.getJoinedYear(), student.getGrade(), student.getAge())));
        System.out.println("-".repeat(Integer.parseInt("47")));
    }

    public void findStudentsWithGmailAndCityNotNull(List<Student> students) {
        List<Student> studentsWithGmailAndCityNotNull = students.stream()
                .filter(student -> student.getEmail().contains("gmail.com") && student.getCity() != null)
                .toList();

        System.out.println("-".repeat(Integer.parseInt("60")));
        System.out.printf("| %-15s | %-24s | %-10s  |%n", "Full Name", "Email", "City");
        System.out.println("-".repeat(Integer.parseInt("60")));
        studentsWithGmailAndCityNotNull.forEach(student -> System.out.printf("| %-15s | %-24s | %-10s |%n".formatted(student.getFirstName() + " " + student.getLastName(), student.getEmail(), student.getCity())));
        System.out.println("-".repeat(Integer.parseInt("60")));

    }

    public void retrieveStudetentsWithUniqueFirstNames(List<Student> students) {
        Map<String, Long> firstNameCounts = students.stream()
                .collect(Collectors.groupingBy(Student::getFirstName, Collectors.counting()));

        List<Student> studentsWithUniqueFirstNames = students.stream()
                .filter(student -> firstNameCounts.get(student.getFirstName()) == 1)
                .toList();

        System.out.println("-".repeat(Integer.parseInt("60")));
        System.out.printf("| %-15s | %-24s |%n", "Full Name", "First Name Count");
        System.out.println("-".repeat(Integer.parseInt("60")));
        studentsWithUniqueFirstNames.forEach(student -> System.out.printf("| %-15s | %-24s |%n".formatted(student.getFirstName() + " " + student.getLastName(), firstNameCounts.get(student.getFirstName()))));
        System.out.println("-".repeat(Integer.parseInt("60")));

    }

    /**
     * GROUPING + COLLECTING
     */
    public void groupStudentsByCityAndCountActive(List<Student> students) {
        Map<String, Long> activeStudentsByCity = students.stream()
                .filter(Student::isActive)
                .filter(student -> student.getCity() != null)
                .collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));

        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "City", "Active Count");
        System.out.println("-".repeat(Integer.parseInt("40")));
        activeStudentsByCity.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.printf("| %-20s | %-7d |%n", entry.getKey(), entry.getValue()));
        System.out.println("-".repeat(Integer.parseInt("40")));
    }

    /**
     * Group students by joined year and compute the average grade.
     *
     */
    public void groupStudentsByJoinedYearAndAverageGrade(List<Student> students) {
        Map<Integer, Double> averageGradeByJoinedYear = students.stream()

                .collect(Collectors.groupingBy(Student::getJoinedYear, Collectors.averagingDouble(Student::getGrade)));

        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "Joined Year", "Avg Grade");
        System.out.println("-".repeat(Integer.parseInt("40")));
        averageGradeByJoinedYear.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.printf("| %-20d | %-7.2f |%n", entry.getKey(), entry.getValue()));
        System.out.println("-".repeat(Integer.parseInt("40")));
    }

    /**
     * REDUCTION + PRIMITIVE STREAMS
     * Calculate the total grade of active students per department.
     */
    public void totalGradeOfActiveStudentsPerDepartment(List<Student> students) {
        Map<String, Double> totalGradeByDepartment = students.stream()
                .filter(Student::isActive)
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.summingDouble(Student::getGrade)));

        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "Department", "Total Grade");
        System.out.println("-".repeat(Integer.parseInt("40")));
        totalGradeByDepartment.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.printf("| %-20s | %-7.2f |%n", entry.getKey(), entry.getValue()));
        System.out.println("-".repeat(Integer.parseInt("40")));
    }

    public void maximumAgeAmongInactiveStudents(List<Student> students) {
        Optional<Integer> maxAge = students.stream()
                .filter(student -> !student.isActive())
                .map(Student::getAge)
                .max(Integer::compareTo);

        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "Status", "Max Age");
        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "Inactive Students", maxAge.orElse(null));
        System.out.println("-".repeat(Integer.parseInt("40")));
    }

    public void sumOfGradesOfStudentsFromChennai(List<Student> students) {
        double sumOfGrades = students.stream()
                .filter(student -> "Chennai".equalsIgnoreCase(student.getCity()))
                .mapToDouble(Student::getGrade)
                .sum();

        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "City", "Sum of Grades");
        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7.2f |%n", "Chennai", sumOfGrades);
        System.out.println("-".repeat(Integer.parseInt("40")));
    }

    public void overallAverageGradeExcludingInactiveStudents(List<Student> students) {
        OptionalDouble averageGrade = students.stream()
                .filter(Student::isActive)
                .mapToDouble(Student::getGrade)
                .average();

        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "Status", "Avg Grade");
        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7.2f |%n", "Active Students", averageGrade.orElse(Double.NaN));
        System.out.println("-".repeat(Integer.parseInt("40")));
    }

    public void topGradeStudentInEachDepartment(List<Student> students) {
        Map<String, Student> topGradeStudentByDepartment = students.stream()
                .collect(Collectors.toMap(Student::getDepartment, Function.identity(), BinaryOperator.maxBy(Comparator.comparingDouble(Student::getGrade))));

        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "Department", "Top Grade Student");
        System.out.println("-".repeat(Integer.parseInt("40")));
        topGradeStudentByDepartment.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Student::getGrade).reversed()))
                .forEach(entry -> System.out.printf("| %-20s | %-7.2f |%n", entry.getKey(), entry.getValue().getGrade()));
        System.out.println("-".repeat(Integer.parseInt("40")));
    }

    public void findStudentWithGradeAbove9AndAgeBelow20(List<Student> students) {
        Optional<Student> studentOptional = students.stream()
                .filter(student -> student.getGrade() > 9 && student.getAge() < 20)
                .findFirst();

        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "Criteria", "Student Found");
        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "Grade > 9 & Age < 20", studentOptional.map(Student::getFirstName).orElse("No Student Found"));
        System.out.println("-".repeat(Integer.parseInt("40")));
    }

    public void youngestActiveStudentEmail(List<Student> students) {
        Optional<Student> youngestActiveStudent = students.stream()
                .filter(Student::isActive)
                .min(Comparator.comparingDouble(Student::getAge));


        System.out.println("-".repeat(Integer.parseInt("52")));
        System.out.printf("| %-20s : %-7s |%n", "Youngest Active Student", youngestActiveStudent.map(Student::getEmail).orElse("No Active Student Found"));
        System.out.println("-".repeat(Integer.parseInt("52")));

    }

    public void checkAnyDepartmentHasStudentWithGradeBelow4(List<Student> students) {
        boolean anyDepartmentHasStudentWithGradeBelow4 = students.stream()
                .anyMatch(student -> student.getAge() > 4);
        System.out.println("The answer to the question 'Check if any department has a student with grade < 4' is: " + anyDepartmentHasStudentWithGradeBelow4);
    }

    public void findFirstInactiveStudentJoinedAfter2021(List<Student> students) {
        Optional<Student> firstInactiveStudentJoinedAfter2021 = students.stream()
                .filter(student -> student.getJoinedYear() > 2021 && !student.isActive())
                .findFirst();

        System.out.println("The answer to the question 'Find the first inactive student who joined after 2021' is: " + firstInactiveStudentJoinedAfter2021.map(Student::getFirstName).orElse("No Inactive Student Found"));
    }

    public void verifyAllDepartmentsHaveAtLeastOneActiveStudent(List<Student> students) {
        boolean allDepartmentsHaveAtLeastOneActiveStudent = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment))
                .values()
                .stream()
                .allMatch(departmentStudents -> departmentStudents.stream()
                        .anyMatch(Student::isActive));

        System.out.println("The answer to the question 'Verify whether all departments have at least one active student' is: " + allDepartmentsHaveAtLeastOneActiveStudent);
    }

    public void partitionStudentsByActiveAndSortByGrade(List<Student> students) {
        Map<Boolean, List<Student>> partitionedAndSortedStudents = students.stream()
                .collect(Collectors.partitioningBy(
                        Student::isActive,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                                        .toList()
                        )
                ));

        System.out.println("-".repeat(Integer.parseInt("60")));
        System.out.printf("| %-25s | %-20s |%n", "Active Status", "Top Students by Grade");
        System.out.println("-".repeat(Integer.parseInt("60")));
        partitionedAndSortedStudents.forEach((isActive, studentList) -> {
            String status = isActive ? "Active" : "Inactive";
            String topStudents = studentList.stream()
                    .limit(3)
                    .map(student -> student.getFirstName() + " " + student.getLastName() + " (" + student.getGrade() + ")")
                    .collect(Collectors.joining(", "));
            System.out.printf("| %-25s | %-20s |%n", status, topStudents);
        });
        System.out.println("-".repeat(Integer.parseInt("60")));
    }

    public void groupStudentsByDepartmentAndExtractTop2ByGrade(List<Student> students) {
        Map<String, List<Student>> top2StudentsByDepartment = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                                        .limit(2)
                                        .toList()
                        )
                ));

        System.out.println("-".repeat(Integer.parseInt("60")));
        System.out.printf("| %-25s | %-20s |%n", "Department", "Top 2 Students by Grade");
        System.out.println("-".repeat(Integer.parseInt("60")));
        top2StudentsByDepartment.forEach((department, studentList) -> {
            String topStudents = studentList.stream()
                    .map(student -> student.getFirstName() + " " + student.getLastName() + " (" + student.getGrade() + ")")
                    .collect(Collectors.joining(", "));
            System.out.printf("| %-25s | %-20s |%n", department, topStudents);
        });
        System.out.println("-".repeat(Integer.parseInt("60")));
    }

    public void groupStudentsByCityAndFindLowestGradeStudent(List<Student> students) {
        Map<String, Optional<Student>> lowestGradeStudentByCity = students.stream()
                .filter(student -> student.getCity() != null)
                .collect(Collectors.groupingBy(
                        Student::getCity,
                        Collectors.minBy(Comparator.comparingDouble(Student::getGrade))
                ));

        System.out.println("-".repeat(Integer.parseInt("60")));
        System.out.printf("| %-25s | %-20s |%n", "City", "Lowest Grade Student");
        System.out.println("-".repeat(Integer.parseInt("60")));
        lowestGradeStudentByCity.forEach((city, studentOptional) -> {
            String lowestStudent = studentOptional
                    .map(student -> student.getFirstName() + " " + student.getLastName() + " (" + student.getGrade() + ")")
                    .orElse("No Students Found");
            System.out.printf("| %-25s | %-20s |%n", city, lowestStudent);
        });
        System.out.println("-".repeat(Integer.parseInt("60")));
    }

    public void groupStudentsByDepartmentAndCalculateGradeVariance(List<Student> students) {
        Map<String, Double> gradeVarianceByDepartment = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> {
                                    double average = list.stream().mapToDouble(Student::getGrade).average().orElse(0);
                                    return list.stream().mapToDouble(student -> Math.pow(student.getGrade() - average, 2)).average().orElse(0);
                                }
                        )
                ));

        System.out.println("-".repeat(Integer.parseInt("40")));
        System.out.printf("| %-20s | %-7s |%n", "Department", "Grade Variance");
        System.out.println("-".repeat(Integer.parseInt("40")));
        gradeVarianceByDepartment.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.printf("| %-20s | %-7.2f |%n", entry.getKey(), entry.getValue()));
        System.out.println("-".repeat(Integer.parseInt("40")));
    }
}
