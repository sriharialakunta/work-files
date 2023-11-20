
public class flowcontrol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=args.length;
		if(v>0) {
			int a=Integer.parseInt(args[0]);
			if (((a%2)==0)) {
				System.out.println("Even");
			}
			else
				System.out.println("Odd");
		}
		else {
			System.out.println("null");
		}
	}

}
