package basics.Arrays.Basics;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0, end = arr.length - 1, temp = 0;
        while(start < end){
            if(arr[start] < arr[end]) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            start++;
            end--;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
