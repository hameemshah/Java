package Oops;
class Refrigerator
{
    private boolean hasWorkTodo;
    public void orderFood()
    {
        if(hasWorkTodo)
            System.out.println("Refrigerator ordered food.");
        hasWorkTodo = false;
    }
    public void setHasWorkTodo()
    {
        hasWorkTodo = true;
    }
}

class Dishwasher
{
    private boolean hasWorkTodo;
    public void doDishes()
    {
        if(hasWorkTodo)
            System.out.println("Dishwasher is doing the dishes.");
        hasWorkTodo = false;
    }
    public void setHasWorkTodo()
    {
        hasWorkTodo = true;
    }
}

class CoffeeMaker
{
    private boolean hasWorkTodo;
    public void brewCoffee()
    {
        if(hasWorkTodo)
            System.out.println("Coffee Maker is brewing the coffee.");
        hasWorkTodo = false;
    }
    public void setHasWorkTodo()
    {
        hasWorkTodo = true;
    }
}


class SmartKitchen {
    private Refrigerator iceBox;
    private Dishwasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen()
    {
        iceBox = new Refrigerator();
        dishWasher = new Dishwasher();
        brewMaster = new CoffeeMaker();
    }

    public void addWater() {
        brewMaster.setHasWorkTodo();
    }

    public void pourMilk() {
        iceBox.setHasWorkTodo();
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkTodo();
    }

    public void setKitchenState(boolean water, boolean milk, boolean wash)
    {
        if(water){
            addWater();
        }
        if(milk){
            pourMilk();
        }
        if(wash){
            loadDishwasher();
        }
    }
    public void doKitchenWork()
    {
        iceBox.orderFood();
        brewMaster.brewCoffee();
        dishWasher.doDishes();
    }
}

public class Composition
{
    public static void main(String[] args) {
        SmartKitchen k = new SmartKitchen();
        k.setKitchenState(true, true, true);
        k.doKitchenWork();
    }
}