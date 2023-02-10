import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private long id ;
    private String title ;
    private Float unitCoast;

    public Book(long id) {
        this.id = id;
    }


    public Book() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getUnitCoast() {
        return unitCoast;
    }

    public void setUnitCoast(Float unitCoast) {
        this.unitCoast = unitCoast;
    }
}
