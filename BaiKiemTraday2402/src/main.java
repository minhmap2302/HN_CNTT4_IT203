public class main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffee("C001","Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("FJ001","Nước cam",40000,10);

        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] != null) {
                drinks[i].displayInfo();
                System.out.println("Thanh tien: " + drinks[i].calculatePrice());
                if (drinks[i] instanceof IMixable) {
                    ((IMixable) drinks[i]).mix();
                }
                System.out.println("------------------");
            }
        }
    }
}