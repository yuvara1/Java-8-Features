/**
 * The type Student.
 */
public class Student {


    private int id;
    private String name;
    private int age;
    private String department;
    private String email;
    private String grade;

    public Student(int id, String name, int age, String department, String email, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.email = email;
        this.grade = grade;
    }

    public Student(int id, String name) {
        this(id, name, 18, "Undeclared", name.toLowerCase() + "@example.com", "NA");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
