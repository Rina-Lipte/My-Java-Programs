import java.util.*;
public class BitManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; //0101
		int pos=1;
		int bitMask=1<<pos; //0010
		
		  
		//Get Bit
		
					/*if((bitMask & n)==0) {
							System.out.println("Bit  was zero");
					}
						else {
								System.out.println("Bit was one");*/
			
			
		//set Bit
		
					/*int newNumber=bitMask |n;
						System.out.println(newNumber);*/
		
		
		
		//Clear bit
							/*int notBitMask=~(bitMask);
		
								int newNumber = notBitMask & n;
										System.out.println((newNumber));*/
		
		
		
		//updateBit
						Scanner sc = new Scanner(System.in);
							int oper = sc.nextInt();
								// oper=1 -> set; oper=0 -> clear
		
								if(oper == 1) {
									//set
									int newNumber = bitMask | n;
									System.out.println(newNumber);
								} else {
									//clear
									int newBitMask = ~(bitMask);//1101
									int newNumber = newBitMask & n; //1101 & 0101
									System.out.println(newNumber);


		}

	}
}


