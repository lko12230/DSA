package Array;

public class MinElementArray {
public static void main(String[] args) {
	int[] arr= new int[] {4, 2, 7, 1, 9};
	int min= arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min= arr[i];
		}
	}
	System.out.println("Min Element Array "+min);
}
}
