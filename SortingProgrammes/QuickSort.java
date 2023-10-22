package SortingProgrammes;
public class QuickSort {    
    public static void main(String[] args) {
    int [] arr = {10, 26, 82, 92, 53, 29, 49, 11, 54, 3, 13, 44, 62, 7};
    quickSort(arr, 0, arr.length-1);
    display(arr);
}

public static void quickSort(int[] A, int low, int high) {
    if(low < high) {
        int pidx = partition(A, low, high);
        quickSort(A, low, pidx-1);
        quickSort(A, pidx+1, high);
    }
}

public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for(int j = low; j < high; j++) {
        if(arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    i++;
    int temp = arr[i];
    arr[i] = pivot;
    arr[high] = temp;
    return i;
}

public static void display(int[] A) {
    for (int i : A)
        System.out.print(i + "  ");
}
}
