package Array;

public class AlternatePositions {
public static void main(String[] args) {
	int[] arr=new int[] {1, 2, 3, 4, 5};
	int sum=0;
	System.out.print("[ ");
	for(int i=0;i<arr.length;i=i+2)
	{
		System.out.print(+arr[i]+" ");
		sum=sum+arr[i];
	}
	System.out.print("]");
	System.out.println(" SUM "+sum);
}
}
