
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Bai2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Paracetamol");
        list.add("Ibuprofen");
        list.add("Panadol");
        list.add("Paracetamol");
        list.add("Aspirin");
        list.add("Ibuprofen");

        for (int i = 0; i <list.size() ; i++) {
            Iterator<String>iterator=list.listIterator(i+1);
            while (iterator.hasNext()){
                if(list.get(i).equals(iterator.next())){
                    iterator.remove();
                }
            }
        }
        list.sort((a,b)->a.compareTo(b));
        Iterator<String>iterator=list.listIterator();
        while (iterator.hasNext()){
            String temp=iterator.next();
            System.out.println(temp);
        }

    }
}
