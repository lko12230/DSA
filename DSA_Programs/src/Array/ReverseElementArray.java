package Array;

import java.util.Arrays;

public class ReverseElementArray {
public static void main(String[] args) {
	int[] arr= new int[] {1, 2, 3, 4, 5};
	int temp;
	System.out.println(Arrays.toString(arr));
	int start= 0 ,  end=arr.length-1;
	while(start < end)
	{
		temp= arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		start++;
		end--;
	}
	System.out.println(Arrays.toString(arr));
}
}
