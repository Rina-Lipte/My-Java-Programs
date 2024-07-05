//x^n 2^5
public class RecursionPower {
	public static int calPower(int x,int n)
	{
		if(n==0) {
			return 1;
		}
		
		if(x==0) {
			return 0;
		}
		
		//for stack height is logn
		if(n%2==0) //n is even
		{
			return calPower(x,n/2)*calPower(x,n/2);
		}
		else  //n is odd
		{
			return calPower(x,n/2)*calPower(x,n/2)*x;
		}
		
		
		
		/*int xPowm=calPower(x,n-1);
		int xpown=x*xPowm;						for stack height =n
		return xpown;
		*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2,n=5;
		int ans= calPower(x,n);
		System.out.println(ans);

	}

}
