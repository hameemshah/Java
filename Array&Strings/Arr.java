import java.util.Arrays;
import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));
        int returnedMin = findMin(returnedArray);
        System.out.println("Min = " + returnedMin);
        System.out.println("Rev = " + Arrays.toString(reverse(returnedArray)));
    }

    public static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list of integrs seperated by commas : ");
        String input = sc.nextLine();
        sc.close();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for(int i = 0;  i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for(int el : array) {
            if (el < min)
                min = el;
        }
        return min; 
    }
        
    private static int[] reverse(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i -1];
            arr[len - i - 1] = temp;
        }
        return arr;
    }
}
