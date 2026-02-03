
public class bai1 {
    private String MaSV;
    private String TenSV;
    public static int totalStudent=0;
    public bai1(String studentId, String studentName) {
        this.MaSV = studentId;
        this.TenSV = studentName;
        totalStudent++;
    }
    public void display() {
        System.out.println("Mã SV: " + MaSV);
        System.out.println("Tên SV: " + TenSV);
    }


    public static void showTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }
    public static void main(String[] args) {
        bai1 s1 = new bai1("SV01", "An");
        bai1 s2 = new bai1("SV02", "Bình");
        bai1 s3 = new bai1("SV03", "Chi");

        s1.display();
        System.out.println();

        s2.display();
        System.out.println();

        s3.display();
        System.out.println();

        bai1.showTotalStudent();
    }
}