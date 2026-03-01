package Bai6;

import java.util.*;

public class Mian {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 30, "Tim mạch"),
                new Patient("Hùng", 45, "Nội tiết"),
                new Patient("Mai", 25, "Tim mạch")
        );
        Map<String,List<Patient>> map = new HashMap<>();
        for(Patient T:patients){
            if(!map.containsKey(T.Khoa)){
                map.put(T.Khoa,new ArrayList<>());
            }
            map.get(T.Khoa).add(T);
        }
        for (Map.Entry<String,List<Patient>> E: map.entrySet()){
            System.out.println("Khoa "+E.getKey()+" - "+E.getValue().toString());
        }
        String maxDept = null;
        int maxCount = 0;
        for (Map.Entry<String,List<Patient>> E: map.entrySet()){
            if(E.getValue().size()>maxCount){
                maxDept=E.getKey();
                maxCount=E.getValue().size();
            }
        }
        System.out.println("Khoa " + maxDept + " đang đông nhất (" + maxCount + " bệnh nhân)");
    }
}
