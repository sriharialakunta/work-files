
public class array {

	public static void main() {
		// TODO Auto-generated method stub
	   int[] A = {2,1,7,10};
	   int c,temp;
	   if(A.length!=0) {
		   for(c=0;c>=A.length;c++) {
			   if(A[c]>A[c++]) {
				   temp=A[c];
				   A[c]=A[c++];
				   A[c++]=temp;
			   }
		   }
	   }
	}

}