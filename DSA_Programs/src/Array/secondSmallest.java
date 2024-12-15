package Array;

public class secondSmallest {
public static void main(String[] args) {
	int[] arr=new int[] {20, 13, 11, 15, 14}; //11, 13, 14, 15, 20
	int smallest = Integer.MAX_VALUE;
	int secondSmallest = Integer.MAX_VALUE;
	for(int num : arr)
	{
		if(num < smallest)
		{
			secondSmallest=smallest;
			smallest=num;
		}
		else if(num < secondSmallest && num!= smallest)
		{
			secondSmallest=num;
		}
		System.out.println(num);
	}
	System.out.println("secondSmallest "+secondSmallest);
}
}
