package basics.Arrays.Basics;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 15, 13, 2, 90};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Max element: " + max);
    }
}
