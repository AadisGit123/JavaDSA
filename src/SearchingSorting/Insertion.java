package SearchingSorting;

public class Insertion {
    public void insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.print("\nSorted array: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.print("Given Array: ");
        for(int i: arr) System.out.print(i + " ");
        Insertion i = new Insertion();
        i.insertionSort(arr);
    }
}
