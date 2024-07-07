//Print all the subsequences of a string.
public class RecursionSubsequences {
	public static void printSubseq(String str, int idx, String newString) {
		if(idx == str.length()) {
		System.out.println(newString);
		return;
		}
		char currChar=str.charAt(idx);
		//choose
		printSubseq(str, idx+1, newString+currChar);
		//don't choose
		printSubseq(str, idx+1, newString);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		
		printSubseq(str, 0, "");

	}

}
