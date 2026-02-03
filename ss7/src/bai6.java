class User{
    private final int id;
    private String username;
    private String password;
    public User(int id,String username,String password){
        this.id=id;
        this.username=username;
        this.password=password;
    }
    public String getusername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
class UserManager{
    private static User [] user=new User[100];
    private static int count=0;
    public static void adduser(User s){
        if(s!=null){
            user[count]=s;
            count++;
        }
    }
    public static boolean checkpass(String username,String pass){
        for (int i = 0; i <count ; i++) {
            if(user[i].getusername().equals(username) && user[i].getPassword().equals(pass)){
                return true;
            }
        }
        return false;
    }
}
public class bai6 {
    public static void main(String[] args) {
        User u1 = new User(1, "admin", "123");
        User u2 = new User(2, "user", "abc");
        UserManager.adduser(u1);
        UserManager.adduser(u2);
        System.out.println(UserManager.checkpass("admin","123")?"dung tai khoan":"sai tai khoan hoac mat khau");
        System.out.println(UserManager.checkpass("admin","1234")?"dung tai khoan":"sai tai khoan hoac mat khau");
    }
}
