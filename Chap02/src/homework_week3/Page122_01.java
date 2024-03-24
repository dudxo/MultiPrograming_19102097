package homework_week3;

import java.util.Scanner;

public class Page122_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age >= 19) {
			System.out.println("성년");
		} else if(age < 19) {
			System.out.println("미성년");
		} else {
			System.out.println("오류");
		}
	}

}
