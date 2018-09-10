import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        //arraylist
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Courses> courses = new ArrayList<>();

        //courses
        Courses Danish = new Courses("Danish", students);
        Courses Mathematics = new Courses("Mathematics", students);
        courses.add(Danish);
        courses.add(Mathematics);

        //Students
        Student student1 = new Student("Lone", "0112806430", 1);
        Student student2 = new Student("Karen", "1234959790", 2);
        Student student3 = new Student("Linda", "1234903394", 3);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        //Teacher
        Teacher teacher1 = new Teacher("Smeagol","Gollum", "1234017899", courses);
        Teacher teacher2 = new Teacher("Albus","Dumbledore", "1234457790", courses);
        System.out.println(teacher1);
        System.out.println();
        System.out.println(teacher2);
        System.out.println();

        //Check equals between two students studentNumber... should be true
        System.out.println();
        System.out.println(student1.equals(student3));
        System.out.println();

        //print average grade for student01
        student1.setAverageGrade(10);
        student1.setAverageGrade(7);
        student1.setAverageGrade(12);

        student2.setAverageGrade(10);
        student2.setAverageGrade(12);
        student2.setAverageGrade(12);

        student3.setAverageGrade(7);
        student3.setAverageGrade(7);
        student3.setAverageGrade(12);

        System.out.println("Student 1 is " + student1.getAge(student1.getCpr()) + " years old");
        System.out.println("Student 1 average grade is " + student1.getAverageGrade());
        System.out.println();
        System.out.println("Student 2 is " + student2.getAge(student2.getCpr()) + " years old");
        System.out.println("Student 2 average grade is " +student2.getAverageGrade());
        System.out.println();
        System.out.println("Student 3 is " + student3.getAge(student3.getCpr()) + " years old");
        System.out.println("Student 3 average grade is " +student3.getAverageGrade());
        System.out.println();
    }
}
