class ScoreUtils{
    public static boolean checkPass(double score){
        return score>=5;
    }
    public static int calculateAverage(double[] scores){
        int sum=0;
        for (double s:scores){
            sum+=s;
        }
        return sum/scores.length;
    }
}

public class bai3 {
    public static void main(String[] args) {
        double [] score={8,2,1,9,2};
        System.out.println("diem trung binh:"+ScoreUtils.calculateAverage(score));
        for (double s:score){
            if(ScoreUtils.checkPass(s)){
                System.out.println(s+": dat");
            }else {
                System.out.println(s+": khong dat");
            }
        }
    }
}