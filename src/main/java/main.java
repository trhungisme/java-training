import org.hibernate.Session;
import pojo.Employee;

public class main {

    public static void main(String[] args) {

        try (Session session = HibernateUtil.getSessionFatory().openSession()){
            session.getTransaction().begin();
            Employee employee = new Employee();
            employee.setFirst_name("Truong");
            employee.setLast_name("Hung");
            employee.setDepartment_id(1);
            employee.setId(1);
            employee.setSalary(10000000);

            session.save(employee);
            session.getTransaction().commit();

        }


    }

}
