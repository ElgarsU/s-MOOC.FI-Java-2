
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    
    private List<Person> employees;
    
    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> employees.add(person));
    }
    
//    public void print() {
//        employees.stream().forEach(employee -> System.out.println(employee));
//    }
//    
//    public void print(Education education) {
//        employees.stream()
//                .filter(employee -> employee.getEducation() == education)
//                .forEach(employee -> System.out.println(employee));
//    }
    
    public void print() {
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            Person employee = iterator.next();
            if (employee.getEducation().equals(education)) {
                System.out.println(employee);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            Person employee = iterator.next();
            if (employee.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}