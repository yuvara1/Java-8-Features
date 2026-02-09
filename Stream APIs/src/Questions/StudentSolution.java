package Questions;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentSolution {
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
            System.out.printf("| %-23s | %-25s|%n".formatted(student.getFirstName() + " " + student.getLastName(), student.getEmail()));
        System.out.println("-".repeat(Integer.parseInt("54")));

        // 3. Find the students who are above 20 years old and are in the "Computer Science" department. Print their full names, ages, and departments.
        System.out.println("\n2) Students who are above 20 years old and are in the 'Computer Science' department: \n");
        System.out.println("-".repeat(Integer.parseInt("60")));
        System.out.printf("| %-23s | %-5s | %-20s   |%n", "Full Name", "Age", "Department");
        System.out.println("-".repeat(Integer.parseInt("60")));
        for (Student student : studentSolution.findStudentAgeAbove20AndDepartmentComputerScience(studentStream.students))
            System.out.printf("| %-23s | %-5d | %-20s   |%n".formatted(student.getFirstName() + " " + student.getLastName(), student.getAge(), student.getDepartment()));
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
            System.out.printf("| %-23s | %-5.2f | %-20s |%n".formatted(student.getFirstName() + " " + student.getLastName(), student.getGrade(), student.getDepartment()));
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

        // OPTIONAL + SAFE HANDLING
        // 16. Safely find the top-grade student in each department using Optional.
        System.out.println("\n 16) Top-grade student in each department: \n");
        studentSolution.topGradeStudentInEachDepartment(studentStream.students);

        // 17. Find a student with grade > 9 and age < 20, handling absence safely.
        System.out.println("\n 17) Student with grade > 9 and age < 20: \n");
        studentSolution.findStudentWithGradeAbove9AndAgeBelow20(studentStream.students);

        // 18. Retrieve the email of the youngest active student while avoiding NullPointerException.
        System.out.println("\n 18) Email of the youngest active student: \n");
        studentSolution.youngestActiveStudentEmail(studentStream.students);

        // SHORT-CIRCUITING OPERATIONS
        // 19. Check if any department has a student with grade < 4.
        System.out.println("\n 19) Check if any department has a student with grade < 4: \n");
        studentSolution.checkAnyDepartmentHasStudentWithGradeBelow4(studentStream.students);

        // 20. Find the first inactive student who joined after 2021.
        System.out.println("\n 20) First inactive student who joined after 2021: \n");
        studentSolution.findFirstInactiveStudentJoinedAfter2021(studentStream.students);

        // 21. Verify whether all departments have at least one active student.
        System.out.println("\n 21) Verify whether all departments have at least one active student: \n");
        studentSolution.verifyAllDepartmentsHaveAtLeastOneActiveStudent(studentStream.students);

        // COLLECTORS – ADVANCED
        // 22. Partition students into active and inactive, then sort each group by grade.
        System.out.println("\n 22) Partition students into active and inactive, then sort each group by grade: \n");
        studentSolution.partitionStudentsByActiveAndSortByGrade(studentStream.students);

        // 23. Group students by department and extract the top 2 students by grade.
        System.out.println("\n 23) Group students by department and extract the top 2 students by grade: \n");
        studentSolution.groupStudentsByDepartmentAndExtractTop2ByGrade(studentStream.students);

        // 24. Group students by city and find the lowest-grade student.
        System.out.println("\n 24) Group students by city and find the lowest-grade student: \n");
        studentSolution.groupStudentsByCityAndFindLowestGradeStudent(studentStream.students);

        // 25. Group students by department and calculate grade variance using manual logic.
        System.out.println("\n 25) Group students by department and calculate grade variance: \n");
        studentSolution.groupStudentsByDepartmentAndCalculateGradeVariance(studentStream.students);


    }


}



