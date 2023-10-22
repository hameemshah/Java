package Basics;
public class Sum15 {

    public static void main(String[] args) {

        int sum = 0 , count = 0;

            for (int i = 1; i <= 1000; i++) {

                if (i % 15 == 0) {
                    System.out.println(i);
                    sum += i;
                    count++;
                }
                   if (count == 5) {
                        System.out.println("Sum of above numbers is:" + sum);
                        break;
                    }
            }
    }
}
