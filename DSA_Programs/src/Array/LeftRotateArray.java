package Array;

import java.util.Arrays;

public class LeftRotateArray {
public static void main(String[] args) {
	int[] arr=new int[]{1, 2, 3, 4, 5};
	System.out.println("LeftRotateArray "+LeftRotateArrayMethod(arr));
	System.out.println(Arrays.toString(arr));
}

public static int[] LeftRotateArrayMethod(int[] arr)
{
	int temp=arr[0];
	int n=arr.length;
	for(int i=1; i<arr.length; i++)
	{
	arr[i-1] = arr[i];
	}
	arr[n-1]=temp;
	return arr;
}
}
