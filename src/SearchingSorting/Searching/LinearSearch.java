package SearchingSorting.Searching;

public class LinearSearch {
    public static int Linear(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]) return i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 54, 5, 6, 7};
        int target = 54;
        int loc = Linear(arr, target);
        if(loc != -1){
            System.out.println("Element found at location: " + loc);
        }
        else{
            System.out.println("Element not found.");
        }
    }
}
