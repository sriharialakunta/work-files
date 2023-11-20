import java.util.Scanner;

public class Assign3 {

	public static void main(String args[]) {
	    int r=0;
	Scanner sc=new Scanner(System.in);
	r=output(sc.nextInt(),sc.next());
	switch(r) {
			  case 13:
			      System.out.println(("Enter vallid number"));
				    break;
			  case 17:
			      System.out.println(("Enter vallid var"));
				           break;
			  default:
			      System.out.println((r));
	}
	}
         private static int output(int input1, String input2) {
             
	         if(input1>1 && input1<5) {
    		if(input2.equalsIgnoreCase("one"))return input1*1;
    		else if(input2.equalsIgnoreCase("two"))return input1*2;
    		else if(input2.equalsIgnoreCase("three"))return input1*3;
    		else if(input2.equalsIgnoreCase("four"))return input1*4;
    		else if(input2.equalsIgnoreCase("five"))return input1*5;
    		else 
    		    return 17;
    	    }
    	   return 13;
	}
		}	