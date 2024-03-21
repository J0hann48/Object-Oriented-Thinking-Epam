import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Dormitory {
    private int id;
    private String space;
    private String location;
    private Date dateUsing;
    private List<Student> students;

    public Dormitory() {
    }

    public Dormitory(int id, String space, String location, Date dateUsing, List<Student> students) {
        this.id = id;
        this.space = space;
        this.location = location;
        this.dateUsing = dateUsing;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateUsing() {
        return dateUsing;
    }

    public void setDateUsing(Date dateUsing) {
        this.dateUsing = dateUsing;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dormitory dormitory = (Dormitory) o;
        return id == dormitory.id && Objects.equals(space, dormitory.space) && Objects.equals(location, dormitory.location) && Objects.equals(dateUsing, dormitory.dateUsing) && Objects.equals(students, dormitory.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, space, location, dateUsing, students);
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "id=" + id +
                ", space='" + space + '\'' +
                ", location='" + location + '\'' +
                ", dateUsing=" + dateUsing +
                ", students=" + students +
                '}';
    }

    public boolean remove(){
        return false;
    }
    public boolean update(int idDormitory){
        return false;
    }

    public int availability() {
        return 0;
    }

    public List<Dormitory> getAll() {
        return new ArrayList<>();
    }

    public boolean assignDormitory(int idDormitory, Student student) {
        return false;
    }

}
