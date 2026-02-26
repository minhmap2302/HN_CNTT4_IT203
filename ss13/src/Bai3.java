import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static <T> List<T>findCommonPatients(List <T> Noi,List<T> Ngoai){
        List <T> result=new ArrayList<>();
        for(T item:Noi){
            if(Ngoai.contains(item)){
                result.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> noi = new ArrayList<>();
        noi.add(101);
        noi.add(102);
        noi.add(105);

        List<Integer> ngoai = new ArrayList<>();
        ngoai.add(102);
        ngoai.add(105);
        ngoai.add(108);

        List<Integer> commonID = findCommonPatients(noi, ngoai);
        System.out.println("Bệnh nhân khám cả hai khoa (ID): " + commonID);

        List<String> bhytNoi = new ArrayList<>();
        bhytNoi.add("DN01");
        bhytNoi.add("DN02");
        bhytNoi.add("DN03");

        List<String> bhytNgoai = new ArrayList<>();
        bhytNgoai.add("DN02");
        bhytNgoai.add("DN04");

        List<String> commonBHYT = findCommonPatients(bhytNoi, bhytNgoai);
        System.out.println("Bệnh nhân khám cả hai khoa (BHYT): " + commonBHYT);
    }
}
