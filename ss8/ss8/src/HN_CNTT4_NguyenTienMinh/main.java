package HN_CNTT4_NguyenTienMinh;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    static Student[] ds = new Student[100];
    static int count = 0;
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
            System.out.println("Sinh vien thu " + (count + 1));
            Student st = new Student();
            String id;
            do {
                System.out.print("Ma SV (SV001): ");
                id = sc.nextLine();
                if (!id.matches("^SV\\d{3}$")) {
                    System.out.println("Ma sinh vien khong hop le! Nhap lai.");
                }
            } while (!id.matches("^SV\\d{3}$"));
            st.setId(id);
            System.out.print("Ho ten: ");
            st.setName(sc.nextLine());
            double score;
            do {
                System.out.print("Diem TB (0 - 10): ");
                score = Double.parseDouble(sc.nextLine());
                if (score < 0 || score > 10) {
                    System.out.println("Diem khong hop le! Nhap lai.");
                }
            } while (score < 0 || score > 10);
            st.setScore(score);
            ds[count] = st;
            count++;
        }
    }


    static void show() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(ds[i]);
        }
    }

    static void search() {
        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh/Yeu): ");
        String rank = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (ds[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(ds[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien nao!");
        }
    }
}
