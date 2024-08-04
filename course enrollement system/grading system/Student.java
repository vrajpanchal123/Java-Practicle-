public class Student {
    private int student_ID;
    private String name;

    public Student(int student_ID, String name) {
        this.student_ID = student_ID;
        this.name = name;
    }

    public int getStudentID() {
        return student_ID;
    }

    public String getName() {
        return name;
    }
}