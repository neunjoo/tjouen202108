package projectIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Oips {
	public static void main(String[] args) {
		
		File file = new File("src/projectIo/membersOnly.txt");
		
		try(ObjectInputStream oin=
				new ObjectInputStream(new FileInputStream(file))){
			
			Membership member1=(Membership)oin.readObject();
			Membership member2=(Membership)oin.readObject();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
