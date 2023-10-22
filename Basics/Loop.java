package Basics;
public class Loop {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; count < 3 && i < 100; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT") + " a prime number.");
            count++;
        }

    }

    public static boolean isPrime(int wholeNumber) {
        if(wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for(int i = 2; i <= Math.sqrt(wholeNumber); i++) {
            if(wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
