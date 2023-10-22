package AbstractClasses;

public class Laptop extends ProductForSale {
    private String model;
    public Laptop(String type, double price, String description, String model) {
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
