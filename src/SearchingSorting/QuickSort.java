package SearchingSorting;

public class QuickSort {
    static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);//Elements to the left of the pivot element.
            quickSort(arr, pivotIndex + 1, high);//Elements to the right of the pivot element.
        }
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if (arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 8, 2, 11};

        System.out.print("Array before sorting: ");
        for (int i : arr) System.out.print(i + " ");

        quickSort(arr, 0, arr.length-1);

        System.out.print("\nArray after sorting: ");
        for(int j : arr) System.out.print(j + " ");
    }
}
