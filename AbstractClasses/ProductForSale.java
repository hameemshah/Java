package AbstractClasses;
public abstract class ProductForSale {
    
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description){
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrince(int quantity) {
        return quantity * price;
    }

    public void printPricedLine(int quantity){
        System.out.println("Type        Quantity        Price");
        System.out.println(type + "     " + quantity + "    " + getSalesPrince(quantity));
    }

    public abstract void showDetails(); //Shows product type price cost
}
