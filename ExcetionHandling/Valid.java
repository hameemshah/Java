import java.util.Scanner;
public class Valid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        boolean valid = false;
        int age = 0;
        do {
            System.out.println("Enter your year of birth");
            try {
                age = sc.nextInt();
                valid = isValidYear(age);
            } catch (Exception e) {
                System.out.println("Invalid format.");
                sc.nextLine();
            }
        } while(!valid);
        sc.close();
        System.out.println(name + " is " +(2023 - age) + " years old.");
    }

    public static boolean isValidYear(int year) {
        return ((year <=2023) && (year > 2023-125));
    }
}
