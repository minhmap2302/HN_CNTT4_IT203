import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bai1 {
    public static void main(String[] args) {
        Set<String> name=new HashSet<>();
        name.add("Nguyễn Văn A – Yên Bái");
        name.add("Trần Thị B – Thái Bình");
        name.add("Nguyễn Văn A – Yên Bái");
        name.add("Lê Văn C – Hưng Yên");
        Iterator<String> iterator=name.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.print(s+" ");
        }
    }
}