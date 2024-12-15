package Array;

public class CountOddEvenNumbers {
public static void main(String[] args) {
	int[] arr=new int[] {1, 2, 3, 4, 5};
	int  oddCount=0, evenCount=0;
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
