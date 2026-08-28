package SearchingSorting;

public class BubbleeeeSort {
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {2, 5, 3, 66, 33, 55, 22};
        bubbleSort(arr);
    }
}
