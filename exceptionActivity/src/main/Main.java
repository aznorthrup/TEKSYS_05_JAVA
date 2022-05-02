package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws CustomExceptionFile{
		try {
			int num[] = {1,2,3,4};
			System.out.println(num[2]);
			
			File myFile = new File("text.txt");
			FileReader fr = new FileReader(myFile);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException ea) {
			ea.printStackTrace();
		}finally {
			System.out.println("Done!");
		}
		
	}

}