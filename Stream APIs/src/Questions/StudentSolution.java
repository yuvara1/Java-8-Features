package Questions;

import java.util.*;
import java.util.stream.Collectors;

public class StudentSolution {
    /**
     * <h3>Student Stream Operations</h3>
     * <p>1. Create a StudentStream class that generates a stream of Student objects with random data. Each Student object should have the following attributes: id, firstName, lastName, age, gender, department, joinedYear, grade, isActive, email, and city. Use Java's Stream API to generate a list of 100 Student objects with random values for each attribute.</p>
     * <p>2. Find the students whose First Name starts with "A". Print their full names and email addresses.</p>
     * <p>3. Find the students who are above 20 years old and are in the "Computer Science" department. Print their full names, ages, and departments.</p>
     * <p>4. Group the students by their department and count how many students are in each department. Print the department names along with the student counts.</p>
     * <p>5. Group the student by maximum grades by their department</p>
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

        System.out.println("\n1) Students whose First Name starts with 'A' and are in the 'Computer Science' department: \n");
        System.out.println("-".repeat(Integer.parseInt("54")));
        System.out.printf("| %-23s | %-25s|%n", "Full Name", "Email");
        System.out.println("-".repeat(Integer.parseInt("54")));
        for (Student student : findStudentFirstNameStartsWithA(studentStream.students))
            System.out.printf("| %-23s | %-25s|%n".formatted(student.getFirstName() + " " + student.getLastName(), student.getEmail()));
        System.out.println("-".repeat(Integer.parseInt("54")));

        // 3. Find the students who are above 20 years old and are in the "Computer Science" department. Print their full names, ages, and departments.
        System.out.println("\n2) Students who are above 20 years old and are in the 'Computer Science' department: \n");
        System.out.println("-".repeat(Integer.parseInt("60")));
        System.out.printf("| %-23s | %-5s | %-20s   |%n", "Full Name", "Age", "Department");
        System.out.println("-".repeat(Integer.parseInt("60")));
        for (Student student : findStudentAgeAbove20AndDepartmentComputerScience(studentStream.students))
            System.out.printf("| %-23s | %-5d | %-20s   |%n".formatted(student.getFirstName() + " " + student.getLastName(), student.getAge(), student.getDepartment()));
        System.out.println("-".repeat(Integer.parseInt("60")));

        // 4. Group the students by their department and count how many students are in each department. Print the department names along with the student counts.
        groupStudentsByDepartment(studentStream.students);

        // 5. Group the student by maximum grades by their department
        groupStudentsByMaxGradeByDepartment(studentStream.students);

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

        System.out.println("\n3) Students grouped by department: \n");

        System.out.println("-".repeat(Integer.parseInt("37")));
        System.out.println("| %-23s | %-7s |".formatted("Department", "Count"));
        System.out.println("-".repeat(Integer.parseInt("37")));

        groupedByDepartment.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.printf("%-25s | %-2s      |%n".formatted(entry.getKey(), entry.getValue())));
        System.out.println("-".repeat(Integer.parseInt("37")));

    }

    private static void groupStudentsByMaxGradeByDepartment(List<Student> students) {
        Map<String, Student> groupedMyMaxGradeByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(Student::getGrade)),
                        Optional::get
                )));

        System.out.println("\n4) Students grouped by max grade by department: \n");
        System.out.println("-".repeat(Integer.parseInt("36")));
        System.out.printf("| %-20s | %-7s |%n", "Department", "Max Grade");
        System.out.println("-".repeat(Integer.parseInt("36")));
        groupedMyMaxGradeByDepartment.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Student::getGrade).reversed()))
                .forEach(entry -> System.out.printf("%-23s|%5.2f %6s %n", entry.getValue().getDepartment(), entry.getValue().getGrade(), "|"));

        System.out.println("-".repeat(Integer.parseInt("36")));
    }
}



