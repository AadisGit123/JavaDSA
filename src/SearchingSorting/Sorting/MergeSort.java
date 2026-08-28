package SearchingSorting.Sorting;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right){
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        int[] arrayRight = new int[sizeRight];
        int[] arrayLeft = new int[sizeLeft];

        for (int i = 0; i < sizeLeft; i++){
            arrayLeft[i] = arr[left + i];
        }

        for (int j = 0; j < sizeRight; j++){
            arrayRight[j] = arr[mid + j + 1];
        }

        int i = 0, j = 0, k = left;

        while (i < sizeLeft && j < sizeRight) {
            if(arrayLeft[i] <= arrayRight[j]) {
                arr[k] = arrayLeft[i];
                i++;
            } else {
                arr[k] = arrayRight[j];
                j++;
            }
            k++;
        }

        while(i < sizeLeft){
            arr[k] = arrayLeft[i];
            i++;
            k++;
        }

        while(j < sizeRight){
            arr[k] = arrayRight[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 8, 2, 11};

        System.out.print("Array before sorting: ");
        for (int i : arr) System.out.print(i + " ");

        mergeSort(arr, 0, arr.length-1);

        System.out.print("\nArray after sorting: ");
        for(int j : arr) System.out.print(j + " ");
    }
}
