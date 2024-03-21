import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Request {
    private int id;
    private String description;
    private Date dateCreated;
    private Date dateDone;

    public Request() {
    }

    public Request(int id, String description, Date dateCreated, Date dateDone) {
        this.id = id;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateDone = dateDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateDone() {
        return dateDone;
    }

    public void setDateDone(Date dateDone) {
        this.dateDone = dateDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return id == request.id && Objects.equals(description, request.description) && Objects.equals(dateCreated, request.dateCreated) && Objects.equals(dateDone, request.dateDone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, dateCreated, dateDone);
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateDone=" + dateDone +
                '}';
    }

    public void create() {}
    public List<Request> getAll(){
        return new ArrayList<>();
    }
}
