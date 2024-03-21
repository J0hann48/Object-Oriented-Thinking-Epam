import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Student extends User{
    private int age;
    private String courseName;
    private List<Request> requests;

    public Student() {
    }

    public Student(int id, String lastName, String firstName, Date birthday, String genre, int age, String courseName, List<Request> requests) {
        super(id, lastName, firstName, birthday, genre);
        this.age = age;
        this.courseName = courseName;
        this.requests = requests;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(courseName, student.courseName) && Objects.equals(requests, student.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age, courseName, requests);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", courseName='" + courseName + '\'' +
                ", requests=" + requests +
                "} " + super.toString();
    }

}
