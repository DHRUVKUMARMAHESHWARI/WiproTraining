import java.util.*;
public class largestElement
{
	public static void main(String args[])
	{
   	int arr[] = new int[5];
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	for(int i = 0; i<arr.length;i++){
   		arr[i] = sc.nextInt();
		}
	int largestElem = arr[0];
		for(int i = 1; i<arr.length;i++){
   		if(largestElem < arr[i] )
		largestElem = arr[i];
		}

	System.out.println("Largest elem = "  + largestElem);
	}

}