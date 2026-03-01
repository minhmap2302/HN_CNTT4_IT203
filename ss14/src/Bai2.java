import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        HashMap<String,String> danhMucThuoc=new HashMap<>();
        danhMucThuoc.put("T01", "Paracetamol");
        danhMucThuoc.put("T02", "Ibuprofen");
        danhMucThuoc.put("T03", "Aspirin");
        danhMucThuoc.put("T04", "Amoxicillin");
        danhMucThuoc.put("T05", "Vitamin C");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String maThuoc = sc.nextLine();

        if (danhMucThuoc.containsKey(maThuoc)) {
            System.out.println("Tên thuốc: " + danhMucThuoc.get(maThuoc));
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT");
        }
    }
}
