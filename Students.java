import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Students {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int rollNo;
    private String name;
    //Many students share one laptop
    @OneToMany(cascade = CascadeType.ALL)
    private List<Laptops> laptops;

    public List<Laptops> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptops> laptops) {
        this.laptops = laptops;
    }
//
//    public void setLaptops(Laptops laptops) {
//        this.laptops = laptops;
//    }
//
//    public Laptops getLaptops() {
//        return laptops;
//    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
