import java.util.List;

public class main {
    static void main(String[] args) {
        ProductRepository repository = new ProductRepository();

        repository.add(new ElectronicProduct("SP001", "Dien thoai Iphone 100", 100000000, 10));
        repository.add(new ElectronicProduct("SP002", "Blu-ray player Buffalo", 6000000, 15));
        repository.add(new FoodProduct("SP003", "My cay cap do 200", 150000, 0));
        repository.add(new FoodProduct("SP004", "Bun ca hai phong", 35000, 50));

        System.out.println("Danh sach san pham");

    }
}
