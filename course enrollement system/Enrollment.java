
public class Enrollment {
    private int[][] student_Courses;
    private int[] count;

    public Enrollment(int numStudents, int maxCoursesPerStudent) {
        student_Courses = new int[numStudents][maxCoursesPerStudent];
        count = new int[numStudents];
    }

    public void enroll(int student_ID, int course_ID) {
        if (count[student_ID] < student_Courses[student_ID].length) {
            student_Courses[student_ID][count[student_ID]] = course_ID;
            count[student_ID]++;
            System.out.println("Student " + student_ID + " enrolled in course " + course_ID);
        } else {
            System.out.println("Student " + student_ID + " cannot enroll in more courses.");
        }
    }

    public void drop(int student_ID, int course_ID) {
        boolean found = false;
        for (int i = 0; i < count[student_ID]; i++) {
            if (student_Courses[student_ID][i] == course_ID) {
                student_Courses[student_ID][i] = student_Courses[student_ID][count[student_ID] - 1];
                count[student_ID]--;
                found = true;
                System.out.println("Student " + student_ID + " dropped course " + course_ID);
                break;
            }
        }
        if (!found) {
            System.out.println("Student " + student_ID + " is not enrolled in course " + course_ID);
        }
    }

    public void getEnrolledCourses(int student_ID, Course[] courseCatalog) {
        System.out.println("Courses enrolled by student " + student_ID + ":");
        for (int i = 0; i < count[student_ID]; i++) {
            for (Course course : courseCatalog) {
                if (course.getCourseID() == student_Courses[student_ID][i]) {
                    System.out.println(course);
                    break;
                }
            }
        }
    }
}

