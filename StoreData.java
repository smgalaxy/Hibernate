

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

public class StoreData {
    public static void main(String[] args) throws Exception{

        //creating configuration object
        //Configuration cfg=new Configuration().configure("META-INF/hibernate.cfg.xml")
          //      .addAnnotatedClass(Employee.class);
        Configuration cfg=new Configuration().configure("META-INF/hibernate.cfg.xml")
              .addAnnotatedClass(Students.class).addAnnotatedClass(Laptops.class);

        //ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
          //      .applySettings(cfg.getProperties()).build().getParentServiceRegistry();
                        //creating session factory object
        SessionFactory factory=cfg.buildSessionFactory();
        //creating session object
        Session session=factory.openSession();
        //creating transaction object
        Transaction t=session.beginTransaction();

        Laptops lap1 = new Laptops();
        lap1.setLapName("Lenovo");

        Laptops lap2 = new Laptops();
        lap2.setLapName("HP");

        List<Laptops> laptopList = new ArrayList<>();

        laptopList.add(lap1);
        laptopList.add(lap2);

        Students student1 = new Students();
        student1.setRollNo(111);
        student1.setName("Peter");
        student1.setLaptops(laptopList);

        lap1.setStudents(student1);

//        Students student2 = new Students();
//        student2.setRollNo(222);
//        student2.setName("Priya");
//        student2.setLaptops(laptopList);

        lap2.setStudents(student1);

//        session.save(lap1);
//        session.save(lap2);
        session.save(student1);
//        session.save(student2);

        t.commit();//transaction is commited
        session.close();

        System.out.println("successfully saved");

    }
}
