public class Student {
    private int student_ID;
    private String name;
    private int age;
    private String department;

    public Student(int student_ID, String name, int age, String department) {
        this.student_ID = student_ID;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getStudentID() {
        return student_ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student ID: " + student_ID + ", Name: " + name + ", Age: " + age + ", Department: " + department;
    }
}
