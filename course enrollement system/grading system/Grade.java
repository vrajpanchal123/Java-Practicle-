public class Grade {
    private int student_ID;
    private int course_ID;
    private char grade;

    public Grade(int student_ID, int course_ID, char grade) {
        this.student_ID = student_ID;
        this.course_ID = course_ID;
        this.grade = grade;
    }

    public int getStudentID() {
        return student_ID;
    }

    public int getCourseID() {
        return course_ID;
    }

    public char getGrade() {
        return grade;
    }
}