
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1; i<=n; i++) {
			//space
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			//print row no,row no times
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
