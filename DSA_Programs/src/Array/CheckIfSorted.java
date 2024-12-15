package Array;

public class CheckIfSorted {
public static void main(String[] args) {
	int[] arr=new int[] {1, 2, 3, 4, 5, 8, 7};
	boolean result= true;
	for(int i=0; i<arr.length-1; i++)
	{
		if(arr[i]>arr[i+1])
		{
			result = false;
		}
	}
	if(result)
	{
		System.out.println(result);
	}
	else
	{
		System.out.println(result);
	}
}
}
