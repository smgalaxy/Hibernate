import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptops {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lapId;
    private String lapName;
    //One laptop for many students
    @ManyToOne
    private Students students;

//    public List<Students> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Students> students) {
//        this.students = students;
//    }
//
    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public int getLapId() {
        return lapId;
    }

    public void setLapId(int lapId) {
        this.lapId = lapId;
    }

    public String getLapName() {
        return lapName;
    }

    public void setLapName(String lapName) {
        this.lapName = lapName;
    }
}
