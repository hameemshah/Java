package Basics;
import java.util.Scanner;
 
public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    // Write your code here
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
            while(sc.hasNextInt()) {
                int number = sc.nextInt();
                sum += number;
                count++;
            } 
        sc.close();
        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        } else {
            System.out.println("No numbers entered.");
        }
    }
}