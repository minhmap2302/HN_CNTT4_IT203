package bai4;

public class Main {
    public static void main(String[] args) {
        RemoteControl smartLight=new RemoteControl() {
            @Override
            public void poweron() {
                System.out.println("Đèn đã bật");
            }
        };
        smartLight.checkBattery();
        smartLight.poweron();
    }
}
