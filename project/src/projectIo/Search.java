package projectIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		FileOutputStream fout =null;

		File file = new File("src/projectIo/bookstore.txt");

		try {
			fout=new FileOutputStream(file);
			System.out.println("책 제목 검색");
			String title= scan.next();

			System.out.println("부제목 검색");
			String sub_Title= scan.next();

			System.out.println("작가 검색");
			String writer= scan.next();

			System.out.println("가격 검색");
			int price= scan.nextInt();
			
			
		

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}





}
