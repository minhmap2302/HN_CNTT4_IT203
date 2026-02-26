package Bai6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Main {
    static List<Medicine> medicineList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static void addMedicine() {
        System.out.print("Nhap ma thuoc: ");
        String id = sc.nextLine();

        for (Medicine m : medicineList) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Nhap so luong them: ");
                int qty = sc.nextInt();
                m.setQuantity(m.getQuantity() + qty);
                System.out.println("Da cap nhat so luong!");
                return;
            }
        }

        System.out.print("Nhap ten thuoc: ");
        String name = sc.nextLine();
        System.out.print("Nhap don gia: ");
        double price = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int quantity = sc.nextInt();

        medicineList.add(new Medicine(id, name, price, quantity));
        System.out.println("Them thuoc thanh cong!");
    }
    static void updateQuantity() {
        System.out.print("Nhap ma thuoc: ");
        String id = sc.nextLine();

        Iterator<Medicine> it = medicineList.iterator();
        while (it.hasNext()) {
            Medicine m = it.next();
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Nhap so luong moi: ");
                int qty = sc.nextInt();
                if (qty == 0) {
                    it.remove();
                    System.out.println("Thuoc da bi xoa!");
                } else {
                    m.setQuantity(qty);
                    System.out.println("Cap nhat thanh cong!");
                }
                return;
            }
        }
        System.out.println("Khong tim thay thuoc!");
    }

    static void removeMedicine() {
        System.out.print("Nhap ma thuoc can xoa: ");
        String id = sc.nextLine();

        Iterator<Medicine> it = medicineList.iterator();
        while (it.hasNext()) {
            if (it.next().getDrugId().equalsIgnoreCase(id)) {
                it.remove();
                System.out.println("Xoa thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay thuoc!");
    }

    static void printInvoice() {
        if (medicineList.isEmpty()) {
            System.out.println("Don thuoc rong!");
            return;
        }

        double total = 0;
        System.out.println("\n----- HOA DON -----");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s%n",
                "Ma", "Ten", "DonGia", "SoLuong", "ThanhTien");

        for (Medicine m : medicineList) {
            double money = m.getTotalPrice();
            total += money;
            System.out.printf("%-10s %-15s %-10.0f %-10d %-10.0f%n",
                    m.getDrugId(), m.getDrugName(),
                    m.getUnitPrice(), m.getQuantity(), money);
        }

        System.out.println("----------------------------");
        System.out.printf("Tong tien: %.0f VND%n", total);

        // Xóa danh sách sau khi in
        medicineList.clear();
        System.out.println("Da xoa don thuoc cho lan ke tiep!");
    }
    static void findCheapMedicine() {
        boolean found = false;
        System.out.println("Thuoc co gia < 50.000:");

        for (Medicine m : medicineList) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m.getDrugId() + " - " + m.getDrugName()
                        + " - " + m.getUnitPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong co thuoc nao phu hop!");
        }
    }
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== MENU KE DON THUOC =====");
            System.out.println("1. Them thuoc vao don");
            System.out.println("2. Dieu chinh so luong thuoc");
            System.out.println("3. Xoa thuoc");
            System.out.println("4. In hoa don");
            System.out.println("5. Tim thuoc gia re (< 50.000)");
            System.out.println("6. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addMedicine();
                case 2 -> updateQuantity();
                case 3 -> removeMedicine();
                case 4 -> printInvoice();
                case 5 -> findCheapMedicine();
                case 6 -> System.out.println("Ket thuc chuong trinh!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 6);
    }

}
