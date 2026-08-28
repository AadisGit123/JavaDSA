package SearchingSorting;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 34, 55, 2, 3, 77};

        System.out.print("Array before sorting: ");
        for (int i : arr) System.out.print(i + " ");

        selectionSort(arr);

        System.out.print("\nArray after sorting: ");
        for(int i : arr) System.out.print(i + " ");
    }
}
