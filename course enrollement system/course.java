public class Course {
    private int course_ID;
    private String course_Name;
    private int credits;

    public Course(int course_ID, String course_Name, int credits) {
        this.course_ID = course_ID;
        this.course_Name = course_Name;
        this.credits = credits;
    }

    public int getCourseID() {
        return course_ID;
    }

    public String getCourseName() {
        return course_Name;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course ID: " + course_ID + ", Course Name: " + course_Name + ", Credits: " + credits;
    }
}