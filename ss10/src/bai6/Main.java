package bai6;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Laptop", 1500);
        products[1] = new Product("Mouse", 20);
        products[2] = new Product("Keyboard", 50);
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("Theo giá tăng dần:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

        // 🔹 Dùng Comparator (Lambda) – sắp xếp theo TÊN A-Z
        Arrays.sort(products, (p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("\nTheo tên A-Z:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}
