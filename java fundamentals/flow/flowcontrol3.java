
public class flowcontrol3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp=("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
		String b=temp.toLowerCase();
		String a=temp.toUpperCase();
		if(a.contains(args[0])) {	
			System.out.println(args[0].toLowerCase());
		}
		else if(b.contains(args[0])) {
			System.out.println(args[0].toUpperCase());
		}
		else {
			System.out.println("Eorr enter valid alphabet ");

		}
			
	}

}
