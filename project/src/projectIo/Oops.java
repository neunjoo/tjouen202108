package projectIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Oops {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name=scan.next();
		
		System.out.println("출생년도를 입력하세요  예시)1999-08-04");
		String birthDate=scan.next();
				
		System.out.println("주소를 입력하세요");
		String address=scan.next();
		
		System.out.println("가입 날짜를 입력하세요 예시)1999-08-04");
		String membership_start=scan.next();
		
		Membership member1= new Membership(0, membership_start, null, membership_start, null);
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("이름을 입력하세요");
		name=scan.next();
		
		System.out.println("출생년도를 입력하세요  예시)1999-08-04");
		birthDate=scan.next();
				
		System.out.println("주소를 입력하세요");
		address=scan.next();
		
		System.out.println("가입 날짜를 입력하세요 예시)1999-08-04");
		membership_start=scan.next();
		
		Membership member2= new Membership(0, membership_start, null, membership_start, null);
		
		System.out.println("---------------------------------------------------------------");
		
		
		ArrayList<Membership> memberList =new ArrayList<Membership>();
		Iterator iterator = memberList.iterator();
		while(iterator.hasNext()){
			memberList.add(0,member1);
			memberList.add(1, member2);
			
		}
		
		
		
		
		
		File file =new File("src/projectIo/membersOnly.txt");
		
		try(ObjectOutputStream oout=
				new ObjectOutputStream(new FileOutputStream(file))) {
			
			oout.writeObject(member1);
			oout.writeObject(member2);
			
		
			System.out.println(" 완료.");
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
