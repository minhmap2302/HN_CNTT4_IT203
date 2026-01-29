import java.util.Scanner;
import java.util.regex.Pattern;

public class HN_KS24_CNTT4_Nguyen_Tien_Minh {
    static final int MAX = 100;
    static String[] mssvList = new String[MAX];
    static int size = 0;
    static final String MSSV_REGEX = "^B\\d{7}$";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hien thi");
            System.out.println("2. Them");
            System.out.println("3. Cap nhat");
            System.out.println("4. Xoa");
            System.out.println("5. Tim kiem");
            System.out.println("6. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    renderr();
                    break;
                case 2:
                    add(sc);
                    break;
                case 3:
                    update(sc);
                case 4:
                    delete(sc);
                case 5:
                    break;
                case 6 :
                    System.out.println("Da thoat chuong trinh");
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 6);
    }

    static void renderr() {
        if (size == 0) {
            System.out.println("Danh sach rong");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + mssvList[i]);
        }
    }

    static void add(Scanner sc) {
        if (size >= MAX) {
            System.out.println("Danh sach da day");
            return;
        }
        String mssv;
        do {
            System.out.print("Nhap MSSV moi: ");
            mssv = sc.nextLine();
        } while (!CheckRegex(mssv));
        mssvList[size++] = mssv;
        System.out.println("Them thanh cong!");
    }

    static void update(Scanner sc) {
        System.out.print("Nhap index can sua: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index < 0 || index >= size) {
            System.out.println("Index khong hop le!");
            return;
        }
        String newMSSV;
        do {
            System.out.print("Nhap MSSV moi: ");
            newMSSV = sc.nextLine();
        } while (!CheckRegex(newMSSV));
        mssvList[index] = newMSSV;
        System.out.println("Cap nhat thanh cong!");
    }

    static void delete(Scanner sc) {
        System.out.print("Nhap MSSV can xoa: ");
        String mssv = sc.nextLine();
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (mssvList[i].equalsIgnoreCase(mssv)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Khong tim thay MSSV!");
            return;
        }
        for (int i = pos; i < size - 1; i++) {
            mssvList[i] = mssvList[i + 1];
        }
        mssvList[--size] = null;
        System.out.println("Xoa thanh cong!");
    }

//    static void search (Scanner sc){
//        System.out.print("Nhap chuoi can tim");
//        String key = sc.nextline();
//        boolean found = false;
//
//    }

    static boolean CheckRegex(String mssv) {
        if (!mssv.matches(MSSV_REGEX)) {
            System.out.println("Sai dinh dang! VD: B2101234");
            return false;
        }
        return true;
    }
}
