
public class Recursion {
	
	//print number from 5 to 1
	
	
	/*    public  void printNum(int n) //n=5,n=4
			{
			if(n==0) {
				return;
			}
			System.out.println(n);
			Recursion obj=new Recursion();
			obj.printNum(n-1);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=5;
			Recursion obj=new Recursion();
			obj.printNum(n);

		}

	}*/
	
	//print number from 1 to 5
			
	public  void printNum(int n) //n=1,n=2
	{
	if(n>5) {
		return;
	}
	System.out.println(n);
	Recursion obj=new Recursion();
	obj.printNum(n+1);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n=1;
	Recursion obj=new Recursion();
	obj.printNum(n);

}

}