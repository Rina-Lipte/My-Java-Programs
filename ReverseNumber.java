import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int reverse=0;
		while(n!=0) {
			int rem=n%10;
			reverse=reverse*10+rem;
			n/=10;
		}
		System.out.println("The Reverse nu :"+reverse);

	}

}
