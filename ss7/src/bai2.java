public class bai2 {
    private String StudentName;

    public static void main(String[] args) {
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        bai2 s1 = new bai2();
        s1.StudentName = "AnSpider";
        bai2 s2 = s1;
        s2.StudentName = "DuongGioTai";
        System.out.println("s1:" + s1.StudentName);
        System.out.println("s2:" + s2.StudentName);
    }
}
