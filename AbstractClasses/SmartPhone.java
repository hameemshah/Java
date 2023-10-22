package AbstractClasses;

public class SmartPhone extends ProductForSale {
    private String model;
    public SmartPhone(String type, double price, String description, String model) {
        super(type, price, description);
        this.model = model;
    }
    @Override
    public void showDetails() {
        System.out.println("Model = " + model +
        " Price = " + price +
        " Type = " + type +
        " Desc: " + description);
    }
}
