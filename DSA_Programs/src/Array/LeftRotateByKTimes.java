package Array;

public class LeftRotateByKTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Original array
        int k = 7; // Number of positions to rotate

        // Normalize k
        k = k % arr.length;

        // Create a new array for the result
        int[] rotated = new int[arr.length];

        // Debug: Print input details
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nk = " + k);

        // Rotate the array
        for (int i = 0; i < arr.length; i++) {
            // Debug: Compute and print values step by step
            int newIndex = (i - k+arr.length) % arr.length; // Calculate new position
            rotated[i] = arr[newIndex]; // Assign value to rotated array

            // Debug: Show each step
            System.out.println("i: " + i + ", (i + k): " + (i + k) +
                               ", New Index: " + newIndex +
                               ", Value: " + arr[newIndex]);
        }

        // Debug: Print the rotated array
        System.out.print("Left Rotated Array: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}
