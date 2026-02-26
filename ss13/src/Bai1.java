import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Double>temps=new ArrayList<>();
        temps.add(36.5);
        temps.add(40.2);
        temps.add(37.0);
        temps.add(12.5);
        temps.add(39.8);
        temps.add(99.9);
        temps.add(36.8);
        Iterator<Double>iterator=temps.iterator();
        while (iterator.hasNext()){
            double temp=iterator.next();
            if(temp<34 || temp >42){
                iterator.remove();
            }
        }
        iterator=temps.iterator();
        double sum=0;
        while (iterator.hasNext()){
            double temp=iterator.next();
            System.out.print(temp+" ");
            sum+=temp;
        }
        System.out.println();
        System.out.println(sum/temps.size());
    }
}