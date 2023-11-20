
public class flowcontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		if(a==0) {
			System.out.println("Zero");
		}
		else if(a>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negitive number");
		}
		int b=Integer.parseInt(args[1]);
		if((a%10)==(b%10)) {
			System.out.print("True");
		}
		else
			System.out.print("False");

	}

}
