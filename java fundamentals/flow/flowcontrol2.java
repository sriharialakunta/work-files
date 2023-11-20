
public class flowcontrol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[1]);
		if(args[0].equals("male")){
			if(1<=a&&a<=58) {
				System.out.println("8.4%");
			}
			else if(59<=a&&a<=100) {
				System.out.println("10.5%");
			}
			else {
				System.out.println("Error");
			}
		}
		if(args[0].equals("female")) {
			if(1<=a&&a<=58) {
				System.out.println("8.2%");
			}
			else if(59<=a&&a<=100) {
				System.out.println("9.2%");
			}
			else {
				System.out.println("Error");
			}
		}

	}

}
