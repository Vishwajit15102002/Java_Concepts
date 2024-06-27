public class Acc {
    String brand;
    int model;
    double price;
    double ton;
    String type;
    double maxTemp;
    double minTemp;
    double ambient;
    int star;

    public void displayAcc() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Type : " + type);
        System.out.println("Star : " + star);
        System.out.println("Ton : " + ton);
    }

    public void showMaxTemp() {
        System.out.println("Max Temp : " + maxTemp);
    }

    public void showAmbientTemp() {
        System.out.println("Ambient Temp: " + ambient);
    }

}
