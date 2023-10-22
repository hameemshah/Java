import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrListChallange {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        boolean flag = true;

        do {
            printActions();
            switch ( Integer.parseInt(sc.nextLine())) {
                case 0 -> flag = false;
                case 1 -> addItems(list);
                case 2 -> removeItems(list);
                default -> System.out.println("Please select valid option: ");
             }
            System.out.println(list);
        } while(flag);
       sc.close();
    }
    public static void printActions() {
        String textblock = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comman delimited list)
                2 - to remove any items (comman delimited list)\n
                Enter a number for which action you want to do:""";
        System.out.print(textblock + " ");
    }
    public static void addItems(ArrayList<String> groceries) {
        System.out.println("Enter the item name: ");
        String[] item = sc.nextLine().split(",");
        groceries.addAll(List.of(item));
    }

    public static void removeItems(ArrayList<String> groceries) {
        System.out.println("Enter the item to delete: ");
        String item[] = sc.nextLine().split(",");
        groceries.removeAll(List.of(item));
    }
}
