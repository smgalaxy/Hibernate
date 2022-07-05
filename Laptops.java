import javax.persistence.*;

@Entity
public class Laptops {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lapId;
    private String lapName;
    //One laptop for many students
    @ManyToOne
    @JoinColumn(name = "student_rollno")
    private Students student;

//    public List<Students> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Students> students) {
//        this.students = students;
//    }
//
    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
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
