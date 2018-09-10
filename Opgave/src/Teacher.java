import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person
{

    private String title;
    private List courses = new ArrayList();

    public Teacher(String title, String name, String cpr, List courses){
        super(name, cpr);
        this.courses = courses;
        this.title = title;
    }

    public Teacher() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List getCourses() {
        return courses;
    }

    public void setCourses(List courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher = " + super.toString() + ", " + "Title = " + title + ", " + "\n" +  "Courses = " + courses + "\n";
    }
}
