public class AccDriver {
    public static void main(String[] args) {
        Acc a1 = new Acc();
        a1.brand = "Samsung";
        a1.price = 40000;
        a1.model = 100;
        a1.type = "Domestic";
        a1.ton = 1.5;
        a1.star = 4;
        a1.ambient = 20;
        a1.maxTemp = 25;
        a1.minTemp = 16;

        a1.showMaxTemp();
        a1.displayAcc();
        a1.showAmbientTemp();
    }
}
