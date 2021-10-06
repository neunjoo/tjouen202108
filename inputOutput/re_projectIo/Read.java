package re_projectIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Read {
	public static void main(String[] args) {
		
		File file =new File("src/re_projectIo/Review.txt");
		
		try(ObjectInputStream ois=
				new ObjectInputStream(new FileInputStream(file))){
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}


	
