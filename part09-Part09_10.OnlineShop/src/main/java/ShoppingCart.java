
import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    
    private List<Item> cart;
    
    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }
    
    public void add(String product, int price) {
        if (this.cart.contains(new Item(product, price))) {
            int productIndex = -1;
            for (int i = 0; i<this.cart.size(); i++) {
                if (this.cart.get(i).equals(new Item(product, price))) {
                    productIndex = i;
                }
            }
            this.cart.get(productIndex).increaseQuantity();
        } else {
            this.cart.add(new Item(product, price));
        }    
    }
    
    public int price() {
        int totalPrice = 0;
        for (Item product : cart) {
            totalPrice += product.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (Item product : cart) {
            System.out.println(product.toString());
        }
    }
}