public class Assign2 {
	static  int[] twoSum(int[] nums, int target) {
		int[] r = new int[2];
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target-nums[i]) {
	            	r[0]=i;
	            	r[1]=j;
	                return r;
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int t=9;    
		 a=(twoSum(a,t));	
		 System.out.println(a[0]+" "+a[1]);
	}
}