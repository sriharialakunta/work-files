import java.util.Scanner;

public class Assign1 {
	static int Sum(int n)
	{
	    int s = 0;
	    while (n != 0)
	    {
	        s = s + n % 10;
	        n = n / 10;
	    }
	    return s;
	}
	static void smallNumber(int N)
	{
	    for( int i = 1;1!= 0;i++)
	    {
	        if (Sum(i) == N)
	        {
	            System.out.print(i);
	            break;
	        }
	    }
	}
	 
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int N = sc.nextInt();
		smallNumber(N);
	}
}