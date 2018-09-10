import java.util.Calendar;

public class Person {
    private String name;
    private String cpr;

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public int getAge(String cpr){

        Calendar cal = Calendar.getInstance();
        //calender year starts from 1900
        int currentYear = cal.get(Calendar.YEAR);

        String birthYear = cpr.substring(4,6);

        int result1 = Integer.parseInt(birthYear);
        int result = result1 + 1900;

        int age = currentYear-result;

        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " +  "CPR: " + cpr;
    }
}
