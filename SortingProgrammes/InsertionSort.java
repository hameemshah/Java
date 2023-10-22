package SortingProgrammes;
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {10, 26, 82, 92, 53, 29, 49, 11, 54, 3, 13, 44, 62, 7};

        display(insertionSort(arr));
    }

    public static int[] insertionSort(int[] A) {
        for(int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while(i >= 0 && key < A[i]) {
                A[i + 1] = A[i];
                i -= 1;
            }
            A[i + 1] = key;
        }
        return A;
    }

    public static void display(int[] A) {
        for (int i : A)
            System.out.print(i + "  ");
    }
}