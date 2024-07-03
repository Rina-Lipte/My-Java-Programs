import java.util.*;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of rows= ");
		int rows=sc.nextInt();
		System.out.println("Enter the value of column= ");
		int col=sc.nextInt();
		int[][]num=new int[rows][col];
		//input
		//rows
		for(int i=0;i<rows;i++){
			//columns
			for(int j=0;j<col;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the search number= ");
		int x=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(num[i][j]==x) {
					System.out.println("x found at location("+i+","+j+")");
				}
			}
		}
		

	}

}
