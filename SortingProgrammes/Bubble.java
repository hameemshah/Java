package SortingProgrammes;
public class Bubble {
    public static void main(String [] args) {
        int [] arr = {10, 26, 82, 92, 53, 29, 49, 11, 54, 3, 13, 44, 62, 7};
        bubble(arr);
        display(arr);
    }

    public static void bubble(int[] A) {
        for(int i = 0; i < A.length - 1; i++) {
            for(int j = 1; j < A.length - i; j++) {
                if(A[j - 1] > A[j]) {
                    int temp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    public static void display(int[] A) {
        for (int i : A)
            System.out.print(i + "  ");
    }
}
