import java.util.List;
import java.util.function.BiFunction;

class MyPrinter {
    public static void printStudent(Student student) {
        System.out.println(student);
    }

    public void printStudentInstance(Student student) {
        System.out.println(student);
    }
}

public class Main {
    public static void main(String[] args) {
        // List of students
        List<Student> students = List.of(
                new Student(1, "Yuvaraj", 20, "Computer Science", "yuvarajacb11@gmail.com", "A"),
                new Student(2, "Suresh", 21, "Mechanical Engineering", "suresh@gmail.com", "B"),
                new Student(3, "Priya", 19, "Electrical Engineering", "priya@gmail.com", "A"),
                new Student(4, "Ravi", 22, "Civil Engineering", "ravi@gmail.com", "C"),
                new Student(5, "Anita", 20, "Computer Science", "anita@gmail.com", "B")
        );

        // 1) Instance method of a particular object (System.out is a specific PrintStream instance)
        students.forEach(System.out::println);
        System.out.println("=".repeat(100));

        // 2) Static method reference (ClassName::staticMethod)
        students.forEach(MyPrinter::printStudent);
        System.out.println("=".repeat(100));

        // 3) Instance method reference of a particular object (object::instanceMethod)
        MyPrinter printer = new MyPrinter();
        students.forEach(printer::printStudentInstance);
        System.out.println("=".repeat(100));

        // 4) Instance method of an arbitrary object of a particular type (ClassName::instanceMethod)
        students.stream().map(Student::getEmail).forEach(System.out::println);
        System.out.println("=".repeat(100));

        // 5) Constructor reference (ClassName::new)
        BiFunction<Integer, String, Student> maker = Student::new;
        Student extra = maker.apply(6, "Kiran");
        System.out.println(extra);
    }
}
