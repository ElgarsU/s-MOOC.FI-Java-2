
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        System.out.println("Debugging");
        Employees t = new Employees(); 
        Person h = new Person("Arto", Education.PHD); 
        t.add(h);
        System.out.println("Print all employees");
        t.print();
        System.out.println("Print searching by educaton");
        t.print(Education.PHD); 
    }
}
