import java.util.Scanner;

public class Bai2 {
    private String user;
    private String password;
    private String Email;
    public Bai2(String user,String password,String Email){
        this.Email=Email;
        this.password=password;
        this.user=user;
    }
    public void setPassword(String password){
        this.password=password;
        System.out.println("doi mat khau thanh cong");
    }
    public void display(){
        System.out.println("email:"+Email);
        System.out.println("user:"+user);
        System.out.println("password:"+"*".repeat(password.length()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai2 user1=new Bai2("Nguyen Van A","A12345678","Nguyenvana@gmail.com");
        user1.display();
        System.out.print("Moi ban nhap mat khau moi:");
        String newpass=sc.nextLine();
        user1.setPassword(newpass);
        user1.display();
    }
}