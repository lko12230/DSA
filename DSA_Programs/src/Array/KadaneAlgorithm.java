package Array;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        // Input array
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        
        // Find and print the maximum sum of contiguous subarray
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum sum of contiguous subarray: " + maxSum);
    }

    /**
     * Function to find the maximum sum of contiguous subarray using Kadane's Algorithm.
     *
     * @param arr Input array of integers
     * @return Maximum sum of contiguous subarray
     */
    public static int maxSubArraySum(int[] arr) {
        // Initialize variables
        int maxSoFar = Integer.MIN_VALUE; // To keep track of the maximum sum found so far
        int maxEndingHere = 0; // To track the sum of the current subarray

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to maxEndingHere
            maxEndingHere = maxEndingHere + arr[i];

//            // Update maxSoFar if maxEndingHere is greater
//            if (maxEndingHere > maxSoFar) {
//                maxSoFar = maxEndingHere;
//            }
             maxSoFar= Math.max(maxSoFar,maxEndingHere);

            // If maxEndingHere becomes negative, reset it to 0 (start a new subarray)
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        // Return the maximum sum found
        return maxSoFar;
    }
}
