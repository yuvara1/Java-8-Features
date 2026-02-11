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
        StudentSolutionImpl studentSolution = new StudentSolutionImpl();
        // 1. Create a StudentStream class that generates a stream of Student objects with random data. Each Student object should have the following attributes: id, firstName, lastName, age, gender, department, joinedYear, grade, isActive, email, and city. Use Java's Stream API to generate a list of 100 Student objects with random values for each attribute.
        StudentStream studentStream = new StudentStream();

        // 2. Find the students whose First Name starts with "A". Print their full names and email addresses.

        System.out.println("\n1) Students whose First Name starts with 'A' and are in the 'Computer Science' department: \n");
        System.out.println("-".repeat(Integer.parseInt("54")));
        System.out.printf("| %-23s | %-25s|%n", "Full Name", "Email");
        System.out.println("-".repeat(Integer.parseInt("54")));
        for (Student student : studentSolution.findStudentFirstNameStartsWithA(studentStream.students))
            System.out.printf("| %-23s | %-25s|%n", student.getFirstName() + " " + student.getLastName(), student.getEmail());
        System.out.println("-".repeat(Integer.parseInt("54")));

        // 3. Find the students who are above 20 years old and are in the "Computer Science" department. Print their full names, ages, and departments.
        System.out.println("\n2) Students who are above 20 years old and are in the 'Computer Science' department: \n");
        System.out.println("-".repeat(Integer.parseInt("60")));
        System.out.printf("| %-23s | %-5s | %-20s   |%n", "Full Name", "Age", "Department");
        System.out.println("-".repeat(Integer.parseInt("60")));
        for (Student student : studentSolution.findStudentAgeAbove20AndDepartmentComputerScience(studentStream.students))
            System.out.printf("| %-23s | %-5d | %-20s   |%n", student.getFirstName() + " " + student.getLastName(), student.getAge(), student.getDepartment());
        System.out.println("-".repeat(Integer.parseInt("60")));

        // 4. Group the students by their department and count how many students are in each department. Print the department names along with the student counts.
        studentSolution.groupStudentsByDepartment(studentStream.students);

        // 5. Group the student by maximum grades by their department
        studentSolution.groupStudentsByMaxGradeByDepartment(studentStream.students);

        // 6. Find all active students whose grade is above their department average.
        List<Student> students = studentSolution.findActiveStudentsAboveDepartmentAverage(studentStream.students);
        System.out.println("\n Active students whose grade is above their department average: \n");
        System.out.println("-".repeat(Integer.parseInt("60")));
        System.out.printf("| %-23s | %-5s | %-20s   |%n", "Full Name", "Grade", "Department");
        System.out.println("-".repeat(Integer.parseInt("60")));
        for (Student student : students)
            System.out.printf("| %-23s | %-5.2f | %-20s |%n", student.getFirstName() + " " + student.getLastName(), student.getGrade(), student.getDepartment());
        System.out.println("-".repeat(Integer.parseInt("60")));

        // 7. List the students who joined before 2022 and sort them by grade, then by age. Print their full names, joined years, grades, and ages.
        System.out.println("\n 7) Students who joined before 2022 sorted by grade and age: \n");
        studentSolution.findStudentsJoinedBefore2022SortedByGradeAndAge(studentStream.students);

        // 8. Find the students whose email domain is "gmail.com" and whose city is not null. Print their full names, email addresses, and cities.
        System.out.println("\n 8) Students whose email domain is 'gmail.com' and whose city is not null: \n");
        studentSolution.findStudentsWithGmailAndCityNotNull(studentStream.students);

        // 9. Retrieve student having unique first names (no duplicates)
        System.out.println("\n 9) Students having unique first names (no duplicates): \n");
        studentSolution.retrieveStudetentsWithUniqueFirstNames(studentStream.students);

        // 10. Group students by city and count only active students.
        System.out.println("\n 10) Group students by city and count only active students: \n");
        studentSolution.groupStudentsByCityAndCountActive(studentStream.students);

        // 11. Group students by joined year and compute the average grade.
        System.out.println("\n 11) Group students by joined year and compute the average grade: \n");
        studentSolution.groupStudentsByJoinedYearAndAverageGrade(studentStream.students);

        // 12. Calculate the total grade of active students per department.
        System.out.println("\n 12) Total grade of active students per department: \n");
        studentSolution.totalGradeOfActiveStudentsPerDepartment(studentStream.students);

        // 13. Find the maximum age among inactive students.
        System.out.println("\n 13) Maximum age among inactive students: \n");
        studentSolution.maximumAgeAmongInactiveStudents(studentStream.students);

        // 14. Find the sum of grades of students from Chennai using reduce().
        System.out.println("\n 14) Sum of grades of students from Chennai: \n");
        studentSolution.sumOfGradesOfStudentsFromChennai(studentStream.students);

        // 15. Compute the overall average grade, excluding inactive students.
        System.out.println("\n 15) Overall average grade, excluding inactive students: \n");
        studentSolution.overallAverageGradeExcludingInactiveStudents(studentStream.students);

        // Optional + SAFE HANDLING
        // 26. Safely find the top-grade student in each department using Optional.
        System.out.println("\n 26) Top-grade student in each department: \n");
        studentSolution.topGradeStudentInEachDepartment(studentStream.students);

        // 27. Find a student with grade > 9 and age < 20, handling absence safely.
        System.out.println("\n 27) Student with grade > 9 and age < 20: \n");
        studentSolution.findStudentWithGradeAbove9AndAgeBelow20(studentStream.students);

        // 28. Retrieve the email of the youngest active student while avoiding NullPointerException.
        System.out.println("\n 28) Email of the youngest active student: \n");
        studentSolution.youngestActiveStudentEmail(studentStream.students);

        // Short-circuiting operations
        // 29. Check if any department has a student with grade < 4.
        System.out.println("\n 29) Check if any department has a student with grade < 4: \n");
        studentSolution.checkAnyDepartmentHasStudentWithGradeBelow4(studentStream.students);

        // 30. Find the first inactive student who joined after 2021.
        System.out.println("\n 30) First inactive student who joined after 2021: \n");
        studentSolution.findFirstInactiveStudentJoinedAfter2021(studentStream.students);

        // 31. Verify whether all departments have at least one active student.
        System.out.println("\n 31) Verify whether all departments have at least one active student: \n");
        studentSolution.verifyAllDepartmentsHaveAtLeastOneActiveStudent(studentStream.students);

        // Collectors – Advanced
        // 32. Partition students into active and inactive, then sort each group by grade.
        System.out.println("\n 32) Partition students into active and inactive, then sort each group by grade: \n");
        studentSolution.partitionStudentsByActiveAndSortByGrade(studentStream.students);

        // 33. Group students by department and extract the top 2 students by grade.
        System.out.println("\n 33) Group students by department and extract the top 2  students by grade: \n");
        studentSolution.groupStudentsByDepartmentAndExtractTop2ByGrade(studentStream.students);

        // 34. Group students by city and find the lowest-grade student.
        System.out.println("\n 34) Group students by city and find the lowest-grade student: \n");
        studentSolution.groupStudentsByCityAndFindLowestGradeStudent(studentStream.students);

        // 35. Group students by department and calculate grade variance using manual logic.
        System.out.println("\n 35) Group students by department and calculate grade variance: \n");
        studentSolution.groupStudentsByDepartmentAndCalculateGradeVariance(studentStream.students);


        // 36. Safely find the top-grade student in each department using Optional.
        System.out.println("\n 36) Top-grade student in each department: \n");
        studentSolution.topGradeStudentInEachDepartment(studentStream.students);

        // 37. Find a student with grade > 9 and age < 20, handling absence safely.
        System.out.println("\n 37) Student with grade > 9 and age < 20: \n");
        studentSolution.findStudentWithGradeAbove9AndAgeBelow20(studentStream.students);

        // 38. Retrieve the email of the youngest active student while avoiding NullPointerException.
        System.out.println("\n 38) Email of the youngest active student: \n");
        studentSolution.youngestActiveStudentEmail(studentStream.students);

        // 39. Check if any department has a student with grade < 4.
        System.out.println("\n 39) Check if any department has a student with grade < 4: \n");
        studentSolution.checkAnyDepartmentHasStudentWithGradeBelow4(studentStream
                .students);

        // 40. Find the first inactive student who joined after 2021.
        System.out.println("\n 40) First inactive student who joined after 2021: \n");
        studentSolution.findFirstInactiveStudentJoinedAfter2021(studentStream.students);

        // 41. Verify whether all departments have at least one active student.
        System.out.println("\n 41) Verify whether all departments have at least one active student: \n");
        studentSolution.verifyAllDepartmentsHaveAtLeastOneActiveStudent(studentStream.students);

        // 42. Partition students into active and inactive, then sort each group by grade.
        System.out.println("\n 42) Partition students into active and inactive, then sort each group by grade: \n");
        studentSolution.partitionStudentsByActiveAndSortByGrade(studentStream.students);

        // 43. Group students by department and extract the top 2 students by grade.
        System.out.println("\n 43) Group students by department and extract the top 2  students by grade: \n");
        studentSolution.groupStudentsByDepartmentAndExtractTop2ByGrade(studentStream.students);

        // 44. Group students by city and find the lowest-grade student.
        System.out.println("\n 44) Group students by city and find the lowest-grade student: \n");
        studentSolution.groupStudentsByCityAndFindLowestGradeStudent(studentStream.students);

        // 45. Group students by department and calculate grade variance using manual logic.
        System.out.println("\n 45) Group students by department and calculate grade variance: \n");
        studentSolution.groupStudentsByDepartmentAndCalculateGradeVariance(studentStream.students);

        // parell stream
        System.out.println("\n 46) identify if parallel stream is faster than sequential stream for finding students with grade above 8: \n");
        studentSolution.identityUnsafeOperationsForParallelStreams();

        // logic heavy problems
        // 47. find student whose grade is aobe both overall average and department average
        System.out.println("\n 47) Find students whose grade is above both overall average and department average: \n");
        studentSolution.findStudentsAboveOverallAndDepartmentAverages(studentStream.students);

        // 48. find the student with the longest full name
        System.out.println("\n 48) Find the student with the longest full name: \n");
        studentSolution.identifyCitiesWhereAllStudentsAreActive(studentStream.students
        );

        // 50. find the departments average grade increases by joined year
        System.out.println("\n 50) Find the departments average grade increases by joined year: \n");
        studentSolution.findDepartmentsWhereAverageGradeIncreasesByJoinedYear(studentStream.students);

        // 51. Each department skiip the top sutdent  and reutnr the bext two
        System.out.println("\n 51) Each department skip the top student and return the next two: \n");
        studentSolution.skipTopStudentAndReturnNextTwoByDepartment(studentStream.students);

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

        System.out.println("-".repeat(37));
        System.out.printf("| %-23s | %-7s |%n", "Department", "Count");
        System.out.println("-".repeat(37));

        groupedByDepartment.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.printf("%-25s | %-2s      |%n", entry.getKey(), entry.getValue()));
        System.out.println("-".repeat(37));

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



