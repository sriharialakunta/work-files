package FPWJ;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Filecall {
	public static void main(String[] args) throws IOException{
		
		 Files.lines(Paths.get("docman.txt"))
		 	.forEach(System.out::println);
		 /*	.map(str -> str.split(" "))
		 	.flatMap(Arrays::stream)
		 	.distinct()
		 	.sorted()
		 	
		
	/*Files.list(Paths.get("."))
		.filter(Files::isDirectory)
		.forEach(System.out::println);*/
	}

}
