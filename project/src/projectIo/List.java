package projectIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class List {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Membership> membershipList = new ArrayList<Membership>();
		
		for(int i=0; i<100; i++) {
			
		System.out.println("이름을 입력하세요");
		String name=scan.next();
		
		System.out.println("출생년도를 입력하세요  예시)1999-08-04");
		String birthDate=scan.next();
				
		System.out.println("주소를 입력하세요");
		String address=scan.next();
		
		System.out.println("가입 날짜를 입력하세요 예시)1999-08-04");
		String membership_start=scan.next();
		
		membershipList.add(new Membership(i, membership_start, null, membership_start, null));
		
		System.out.println("회원가입이 정상적으로 진행 되었습니다.");
		}
		File file = new File("src/projectIo/membersOnly.txt");
		try(ObjectOutputStream oout
				=new ObjectOutputStream(new FileOutputStream(file))){
			
			oout.writeObject(membershipList);
			System.out.println("리스트에 회원정보 넣기 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
