package SortingAlgorithms;

public class bubbSort {
	public static void main(String[] args) {
		int[] intarray = { 12, 45, 34 , 4, 5, 56, 45};
		for(int unsort = intarray.length-1; unsort > 0; unsort--) {
			for(int i = 0; i < unsort; i++) {
				if(intarray[i] > intarray[i + 1]) {
					swap(intarray, i, i+1);
				}
			}
			
		}
		for (int i = 0; i < intarray.length; i++) {
            System.out.println(intarray[i]);
        }
		
	}

	public static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		if(i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
		
	}
}
