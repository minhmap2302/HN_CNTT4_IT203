import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        List<String> benh=new ArrayList<>();
        benh.add("Cúm A");
        benh.add("Sốt xuất huyết");
        benh.add("Cúm A");
        benh.add("Covid-19");
        benh.add("Cúm A");
        benh.add("Sốt xuất huyết");
        Map<String,Integer> thongke=new HashMap<>();
        for (String T:benh){
            thongke.put(T,thongke.getOrDefault(T,0)+1);
        }
        Map<String,Integer>baocao=new TreeMap<>(thongke);
        for (Map.Entry<String,Integer> B:baocao.entrySet()){
            System.out.println(B.getKey()+":"+B.getValue());
        }
    }
}
