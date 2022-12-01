import java.util.*;

public class ProductMenu {
    public static void main(String args[]){

        ArrayList <Product> l = new ArrayList<>();

        Product p1 = new Product(101, "Biscuit", "ParleG", 10, 1000);
        Product p2 = new Product(102, "Tea Powder", "Red Label", 50, 2000); 
        Product p3 = new Product(103, "Rice", "Geera Rice", 150, 3000);

        l.add(p1);
        l.add(p2);
        l.add(p3);

        Product product = l.get(2);
        product.printProduct();
    }
      
}
