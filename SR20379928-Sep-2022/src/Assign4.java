import java.util.Scanner;
import java.util.Stack;

public class Assign4 {
	public static boolean output(String input1) {
			boolean res=true;
			for(int i=0;i<input1.length();i=i+2) {
				if(input1.charAt(i)=='('&&input1.charAt(i+1)==')')res=true;
				else if(input1.charAt(i)=='['&&input1.charAt(i+1)==']')res=true;
				else if(input1.charAt(i)=='{'&&input1.charAt(i+1)=='}')res=true;
				else return false;
			}
			return res; 
	        
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(output(sc.next()));

	}
}