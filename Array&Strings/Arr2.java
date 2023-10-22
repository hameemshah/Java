import java.util.Scanner;
public class Arr2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int [] arr = init(size);
        display(arr);
        System.out.println("Sum = " + sum(arr));
        System.out.println("Largest = " + large(arr));
        System.out.println("Smallest = " + small(arr));
        // display(selectionSort(arr));
        display(uniqueElements(arr));
        matmul();
        sc.close();
    }
    public static int[] init(int size) {
        int[] arr = new int[size];
        System.out.println("Enter the value one by one : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void display (int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static int sum(int A[]) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum+= A[i];
        }    
        return sum;
    }
    public static int large(int A[]) {
        int large = A[0];
        for (int i = 1; i < A.length; i++) {
            if(large < A[i])
                large = A[i];
        }    
        return large;
    }
    public static int small(int A[]) {
        int small = A[0];
        for (int i = 1; i < A.length; i++) {
            if(small > A[i])
                small = A[i];
        }    
        return small;
    }
    public static int[] reverse(int A[]) {
        int[] arr = new int[A.length];
        int j = 0;
        for(int i = A.length - 1; i >= 0; i--) {
            arr[j] = A[i];
            j++;
        }
        return arr;
    }
    public static int[] selectionSort(int A[]) {
        for(int i = 0; i < A.length - 1; i++) {
            int smallest = i;
            for(int j = i + 1; j < A.length; j++){
                if(A[j] < A[smallest])
                    smallest = j;
            }
            int temp = A[i];
            A[i] = A[smallest];
            A[smallest] = temp;
        }
        return A;
    }

    public static int[] uniqueElements(int A[]) {
        int k = 0;
        int[] uA = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            boolean flag = false;
            for(int j = i - 1; j >= 0; j--) {
                if(A[j] == A[i]){
                    flag = true;
                    break;
                }
            }
            if(!flag) {
            uA[k] = A[i];
            k++;
            }
        } 
    // Create a new array with only the unique elements
    int[] result = new int[k];
    System.arraycopy(uA, 0, result, 0, k);

    return result;
    }
    public static void matmul() {
        int A[][] =  {{1, 2, 3, 4},{ 5, 6,7,8},{9,10,11, 12}};
        int B[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int C[][] = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for(int k = 0; k <= 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Matrix :");
        for (int i = 0; i <3; i++){
            for(int j=0;j<3;j++)
            System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}