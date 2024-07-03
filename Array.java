import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int size=sc.nextInt();
		int num[]=new int[size];//Defination of an array
		//input
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<size;i++) {
	
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the search number:");
		int x=sc.nextInt();
		for(int i=0;i<num.length;i++) {
			if(num[i]==x)
			{
				System.out.println("number is found at index:"+i);
			}
			
		}
		

	}

}
