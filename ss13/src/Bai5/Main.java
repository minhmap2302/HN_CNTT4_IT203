package Bai5;

import com.sun.source.tree.EnhancedForLoopTree;

import javax.management.MBeanNotificationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static ArrayList<Patient>BN=new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void thembenhnhan(){
        System.out.print("moi ban nhap ma benh nhan:");
        String id=sc.nextLine();
        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap chan doan: ");
        String cd = sc.nextLine();
        Patient temp=new Patient(id,tuoi,ten,cd);
        BN.add(temp);
    }
    public static void capnhatbn(){
        System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        for(Patient item:BN){
            if(item.id.equalsIgnoreCase(id)){
                System.out.println("chuan doan moi:");
                String newcd=sc.nextLine();
                item.diagnosis=newcd;
                System.out.println("cap nhat hoan tat");
                return;
            }
        }
        System.out.println("khong tim thay");
    }
    public static void xuatvien(){
        System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        for (int i = 0; i <BN.size() ; i++) {
            Iterator<Patient> iterator=BN.listIterator();
            while (iterator.hasNext()){
                iterator.next();
                if (BN.get(i).id.equalsIgnoreCase(id)){
                    iterator.remove();
                    System.out.println("da xoa benh nhan");
                    return;
                }
            }
        }
        System.out.println("khong tim thay");
    }
    public static void sapxep(){
        BN.sort((a,b)->{
            if(a.age!=b.age){
                return b.age-a.age;
            }
            return a.fullname.compareTo(b.fullname);
        });
    }
    public static void hienthi(){
        for (Patient bn : BN) {
            bn.hienThi();
        }
    }
    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tiep nhan benh nhan");
            System.out.println("2. Cap nhat chan doan");
            System.out.println("3. Xuat vien");
            System.out.println("4. Sap xep danh sach");
            System.out.println("5. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    thembenhnhan();
                    hienthi();
                    break;
                case 2:
                    capnhatbn();
                    hienthi();
                    break;
                case 3:
                    xuatvien();
                    hienthi();
                    break;
                case 4:
                    sapxep();
                    hienthi();
                    break;
                case 5:
                    System.out.println("Da thoat!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (chon != 5);
    }
}
