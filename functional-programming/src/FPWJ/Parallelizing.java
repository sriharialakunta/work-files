package FPWJ;

import java.util.stream.LongStream;

public class Parallelizing {
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		//0, 1000000000 869
		//System.out.println(LongStream.range(0,1000000000).sum());//499999999500000000
		
		//601
		System.out.println(LongStream.range(0,100000000)
				.parallel()
				.sum());
		
		System.out.println(System.currentTimeMillis() - time);
	}
}

