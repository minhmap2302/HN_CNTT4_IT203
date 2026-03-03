public class ElectronicProduct extends Product {
    private  int warrantyMonths;
    public  ElectronicProduct(String id, String name, double price, int warrantyMonths){
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice(){
        if (warrantyMonths > 12){
            return price + 1000000;
        }
        return price;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Warranty: " + warrantyMonths + "months");
    }
}
//import java.util.*;
//
//public class ProductRepository implements IRepository<Product> {
//    private List<Product> products = new ArrayList<>();
//    private Map<String, Product> productMap = new HashMap<>();
//
//    @Override
//    public boolean add(Product item) {
//        if (item == null) return false;
//        products.add(item);
//        productMap.put(item.getId(), item);
//        return true;
//    }
//
//    @Override
//    public boolean removeById(String id) {
//        Product p = productMap.remove(id);
//        if (p != null) {
//            products.remove(p);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public Product findById(String id) {
//        return productMap.get(id);
//    }
//
//    @Override
//    public List<Product> findAll() {
//        return products;
//    }
//
//    // Thống kê số lượng theo loại
//    public Map<String, Integer> statistics() {
//        Map<String, Integer> stats = new HashMap<>();
//        for (Product p : products) {
//            String type = p instanceof ElectronicProduct ? "Electronic" : "Food";
//            stats.put(type, stats.getOrDefault(type, 0) + 1);
//        }
//        return stats;
//    }
//}

