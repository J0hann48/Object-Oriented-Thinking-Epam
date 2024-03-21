import java.util.Date;
import java.util.Objects;

public abstract class User {
    private int id;
    private String lastName;
    private String firstName;
    private Date birthday;
    private String genre;

    public User(int id, String lastName, String firstName, Date birthday, String genre) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.genre = genre;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(lastName, user.lastName) && Objects.equals(firstName, user.firstName) && Objects.equals(birthday, user.birthday) && Objects.equals(genre, user.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, birthday, genre);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthday=" + birthday +
                ", genre='" + genre + '\'' +
                '}';
    }
    public boolean remove(){
        return true;
    }
}
