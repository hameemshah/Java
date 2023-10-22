package SortingProgrammes;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {15, 5, 24, 8, 1, 3, 16, 10, 20};
        mergeSort(arr, 0, arr.length - 1);
        display(arr);
    }

    public static void mergeSort(int[] A, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(A, lb, mid);
            mergeSort(A, mid + 1, ub);
            merge(A, lb, mid, ub);
        }
    }

    public static void merge(int[] A, int lb, int mid, int ub) {
        int i = lb, j = mid + 1, k = lb;
        int[] B = new int[A.length];

        while (i <= mid && j <= ub) {
            if (A[i] <= A[j]) {
                B[k] = A[i];
                i++;
            } else {
                B[k] = A[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            B[k] = A[i];
            i++;
            k++;
        }

        while (j <= ub) {
            B[k] = A[j];
            j++;
            k++;
        }

        for (k = lb; k <= ub; k++) {
            A[k] = B[k];
        }
    }

    public static void display(int[] A) {
        for (int i : A)
            System.out.print(i + "  ");
    }
}
