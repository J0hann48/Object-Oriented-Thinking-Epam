import java.util.Date;
import java.util.List;

public class Admin extends User {

    private List<Dormitory> dormitories;

    public Admin(int id, String lastName, String firstName, Date birthday, String genre, List<Dormitory> dormitories) {
        super(id, lastName, firstName, birthday, genre);
        this.dormitories = dormitories;
    }

    public Admin() {
    }

    @Override
    public boolean remove() {
        return false;
    }

    public void setSetings() {

    }
}
