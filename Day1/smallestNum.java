// 
import java.util.*;

public class smallestNum{

public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5};
		int smallest = arr[0];
		for(int i = 1; i<arr.length;i++){
		if(smallest  > arr[i])
		smallest = arr[i];
		}	
		System.out.println(smallest);
		}
}