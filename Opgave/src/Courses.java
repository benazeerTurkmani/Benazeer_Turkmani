import java.util.List;
import java.util.ArrayList;

public class Courses {
    private String course;
    private ArrayList studentsAttending = new ArrayList();

    public Courses(String course, ArrayList studentsAttending) {
        this.course = course;
        this.studentsAttending = studentsAttending;
    }

    public Courses(String course) {
        this.course = course;
    }

    public String getCourseTitle() {
        return course;
    }

    public void setCourseTitle(String course) {
        this.course = course;
    }

    public List getStudents() {
        return studentsAttending;
    }

    public void setStudents(ArrayList studentsAttending) {
        this.studentsAttending = studentsAttending;
    }

    @Override
    public String toString() {
        return "Course title: " + course + "\n" + "Attending this class = " + "\n" + studentsAttending + "\n";
    }
}