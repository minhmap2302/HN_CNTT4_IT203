import java.util.*;

public class main {
    static void main(String[] args) {
        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("E01", "Ai phon 20", 15000000, 24));
        repo.add(new ElectronicProduct("E02", "Zi phau 14", 10000000, 12));
        repo.add(new FoodProduct("F01", "Sua chua hi lap", 30000, 10));
        repo.add(new FoodProduct("F02", "Mo na de la", 20000, 5));

        System.out.println(" Danh sach");
        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Thanh tien: " + p.calculateFinalPrice());
        }

        System.out.println("Tim san pham theo ID");
        Product found = repo.findById("E01");
        if (found != null) {
            found.displayInfo();
        }

        System.out.println("Sap xep theo gia tang dan");
        List<Product> sorted = new ArrayList<>(repo.findAll());
        sorted.sort(Comparator.comparingDouble(Product::calculateFinalPrice));
        for (Product p : sorted) {
            System.out.println(p.getId() + " - " + p.calculateFinalPrice());
        }

        System.out.println("Thong ke so luong theo loai");
        Map<String, Integer> stats = new HashMap<>();
        for (Product p : repo.findAll()) {
            String type = (p instanceof ElectronicProduct) ? "Electronic" : "Food";
            stats.put(type, stats.getOrDefault(type, 0) + 1);
        }
        System.out.println(stats);
    }
}

