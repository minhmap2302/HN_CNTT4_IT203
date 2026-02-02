public class Bai6 {
    private int id;
    private String username;
    private String password;
    private String email;

    public Bai6(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setEmail(email);
        setPassword(password);
    }

    public void setEmail(String Email) {
        if (Email.isEmpty()) {
            System.out.println("email khong duoc bo trong");
            this.email=null;
            return;
        } else if (!Email.matches("^[a-zA-Z][a-zA-Z0-9._]*@(?:gmail|edu)\\.com$")) {
            System.out.println("Email khong hop le");
            this.email=null;
            return;
        }
        this.email = Email;
        System.out.println("Email hop le");
    }

    public void setPassword(String Password) {
        if (Password.isEmpty()) {
            System.out.println("Password khong duoc bo trong");
            this.password=null;
            return;
        }
        this.password = Password;
        System.out.println("doi mat khau thnah cong");
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        if (password == null) {
            System.out.println("Password: ******");
        } else {
            System.out.println("Password: " + "*".repeat(password.length()));
        }
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Bai6 u1 = new Bai6(1, "an123", "123456", "an@gmail.com");
        u1.display();

        Bai6 u2 = new Bai6(2, "binh456", "abcdef", "binhgmail.com");
        u2.display();

        Bai6 u3 = new Bai6(3, "cuong789", "", "cuong@yahoo.com");
        u3.display();

        Bai6 u4 = new Bai6(4, "duy999", "   ", "duy@");
        u4.display();
    }
}