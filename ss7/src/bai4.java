class classRoom {
    private String studentName;
    private static double classFund=0;
    public classRoom(String Name){
        this.studentName=Name;
    }
    public void donate(double done){
        if(done>0){
            classFund+=done;
            System.out.println(studentName+" da dong "+done+" vao quy ");
        }else{
            System.out.println("so tien khong hop le");
        }
    }
    public static void display(){
        System.out.println("so tien hien tai:"+classFund);
    }
}

public class bai4 {
    public static void main(String[] args) {
        classRoom s1=new classRoom("An");
        classRoom s2=new classRoom("duong");
        s1.donate(2000000);
        s2.donate(50000);
        classRoom.display();
    }
}