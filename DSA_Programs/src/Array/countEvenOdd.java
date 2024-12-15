package Array;

public class countEvenOdd {
public static void main(String[] args) {
	int[] arr= new int[] {1, 2, 3, 4, 5};
	int evenCount= 0;
	int oddCount= 0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			evenCount++;
		}
		else
		{
			oddCount++;
		}
	}
	System.out.println("EVEN COUNT "+evenCount);
	System.out.println("ODD COUNT "+oddCount);
}
}
