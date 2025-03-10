import java.util.*;

public class SubarrayWithGivenSum {
    public static void findSubarray(int[] arr, int target) {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end]; 
            
           
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }
            
            
            if (sum == target) {
                System.out.print("Subarray with sum " + target + " is {");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + (i == end ? "" : ", "));
                }
                System.out.println("}");
                return;
            }
        }
        System.out.println("No subarray found with sum " + target);
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;

        findSubarray(arr, target);
    }
}
