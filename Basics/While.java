package Basics;
public class While {
    public static void main(String[] args) {
        int start = 5, end = 20, count = 0;
        while(start <= end) {
            if(isEvenNumber(start)) {
                System.out.println(start);
                count++;
            }
            start++;
        }
        System.out.println(count);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
