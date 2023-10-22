package Basics;
import java.util.Scanner;

public class Cigar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount.");
        try {
            int amount = sc.nextInt();
            sc.close();
            if(amount < 6) {
                System.out.println("Invalid Amount");
            } else if (amount < 50) {
                int cigar = amount / 6;
                int remains = amount % 6;
                System.out.println("You'll get " + cigar + " cigreets and " +  remains + " rupees back");
            } else if (amount == 50) {
                System.out.println("You'll get 9 cigreets");
            } else if (amount == 55) {
                System.out.println("You'll get one packet.");
            } else if (amount < 55 && amount > 50){
                int remains = amount - 50;
                System.out.println("you'll get 9 cigreets and " + remains + " back");
            } else {
                System.out.println("Can`t handle this amount.");
            }
        } catch (Exception e) {
            System.out.println("Please enter numeric value.");
        }
    }
}
