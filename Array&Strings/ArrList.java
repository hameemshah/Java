import java.util.ArrayList;

public class ArrList {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    cars.set(0, "Opel");
    cars.remove(0);
    //cars.clear();
    System.out.println(cars);
    System.out.println(cars.size());
    for (var ele : cars) {
        System.out.println(ele);
    }
    System.out.println(cars.getClass());
  }
}