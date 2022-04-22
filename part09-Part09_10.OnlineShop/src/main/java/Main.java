
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ShoppingCart cart = new ShoppingCart(); 
//        System.out.println("Debugging");
//        cart.add("milk",3); 
//        System.out.println("Added milk 3, print cart contents");
//        cart.print();
//        System.out.println("Print cart price");
//        System.out.println(cart.price());
//        cart.add("milk",3);
//        System.out.println("Added another milk 3, print cart contents");
//        cart.print();
//        System.out.println("Print cart price");
//        System.out.println(cart.price());
        
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }
}
