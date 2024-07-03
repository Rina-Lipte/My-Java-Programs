import java.util.*;
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Row size:");
		int R=obj.nextInt();
		System.out.println("Enter the Column size:");
		int  C=obj.nextInt();
		for(int i=1; i<=R; i++) {
			for(int j=1; j<=C; j++) {
				//if(i==1 || j==1 || i==R || j==C) {
					System.out.print("*");
			}
				//else {
					//System.out.print(" ");
				//}
			
		System.out.println();
		}

	}

}

