package Questions;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class StudentSolution {
    /**
     * <h3>Student Stream Operations</h3>
     * <p>1. Create a StudentStream class that generates a stream of Student objects with random data. Each Student object should have the following attributes: id, firstName, lastName, age, gender, department, joinedYear, grade, isActive, email, and city. Use Java's Stream API to generate a list of 100 Student objects with random values for each attribute.</p>
     * <p>2. Find the students whose First Name starts with "A". Print their full names and email addresses.</p>
     * <p>3. Find the students who are above 20 years old and are in the "Computer Science" department. Print their full names, ages, and departments.</p>
     * <p>4. Group the students by their department and count how many students are in each department. Print the department names along with the student counts.</p>
     *
     *
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        // 1. Create a StudentStream class that generates a stream of Student objects with random data. Each Student object should have the following attributes: id, firstName, lastName, age, gender, department, joinedYear, grade, isActive, email, and city. Use Java's Stream API to generate a list of 100 Student objects with random values for each attribute.
        StudentStream studentStream = new StudentStream();

        // 2. Find the students whose First Name starts with "A". Print their full names and email addresses.
        System.out.println("\nStudents whose First Name starts with 'A' and are in the 'Computer Science' department: \n");
        for (Student student : findStudentFirstNameStartsWithA(studentStream.students))
            System.out.println(student.getFirstName() + " " + student.getLastName() + " - Email: " + student.getEmail());

        // 3. Find the students who are above 20 years old and are in the "Computer Science" department. Print their full names, ages, and departments.
        System.out.println("\nStudents who are above 20 years old and are in the 'Computer Science' department: \n");

        for (Student student : findStudentAgeAbove20AndDepartmentComputerScience(studentStream.students))
            System.out.println(student.getFirstName() + " " + student.getLastName() + " - Age: " + student.getAge() + ", Department: " + student.getDepartment());

        // 4. Group the students by their department and count how many students are in each department. Print the department names along with the student counts.
        System.out.println("\nStudents grouped by department: \n");
        groupStudentsByDepartment(studentStream.students);
    }

    private static List<Student> findStudentFirstNameStartsWithA(List<Student> students) {
        return students.stream()
                .filter(s -> s.getFirstName().startsWith("A"))
                .collect(Collectors.toList());
    }

    private static List<Student> findStudentAgeAbove20AndDepartmentComputerScience(List<Student> students) {
        return students.stream()
                .filter(student -> student.getAge() > 20 && student.getDepartment().equalsIgnoreCase("computer science"))
                .collect(Collectors.toList());
    }


    private static void groupStudentsByDepartment(List<Student> students) {
        Map<String, Long> groupedByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
        System.out.println("\nStudents grouped by department: \n");
        groupedByDepartment.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + ", " + entry.getValue()));

    }

}
