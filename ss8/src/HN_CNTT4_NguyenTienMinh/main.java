package HN_CNTT4_NguyenTienMinh;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        System.out.println("------------- MENU -----------------");
        System.out.println("1 . Nhap danh sach sinh vien.");
        System.out.println("2 . Hien thi danh sach sinh vien .");
        System.out.println("3 . Tim kiem sinh vien theo Hoc luc.");
        System.out.println("4 . Sap xep theo hoc luc giam dan.");
        System.out.println("5 . Thoat.");
        System.out.println("--------------------------------------");
    }
    public static void main(String[] args) {
        int choice;
        do {
            menu();
            System.out.println("Lua chon cua ban : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 :
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3 :
                    search();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }while (choice!=5);
    }

    static void add() {
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));

            Student st = new Student();

            System.out.print("Ma SV: ");
            st.setId(sc.nextLine());

            System.out.print("Ho ten: ");
            st.setName(sc.nextLine());

            System.out.print("Diem TB: ");
            st.setScore(Double.parseDouble(sc.nextLine()));

            list.add(st);
        }
    }

    static void show() {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (Student st : list) {
            System.out.println(st);
        }
    }

    static void search() {
        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh/Yeu): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (Student st : list) {
            if (st.getRank().equalsIgnoreCase(rank)) {
                System.out.println(st);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien nao!");
        }
    }
}
