package Basics;
public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(100));
    }

    public static int sumDigits(int number) {
        if(number < 0) {
            return -1;
        }
        int digit, sum = 0;
        while(number != 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
