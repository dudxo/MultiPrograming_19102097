package homework_week3;

import java.util.Scanner;

public class Page122_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = input("철수");
		String y = input("영희");
		
		whosWin(c,y);
	}
	
	static String input(String str) {
		System.out.printf("%s님의 s,r,p를 입력하세요 : ", str);
		Scanner sc = new Scanner(System.in);

		return sc.next();
	}
	
	static void whosWin(String str1, String str2) {
		if(str1.equals(str2)) {
			System.out.println("무승부");
		}
		
		if("s".equals(str1)) {
			if("p".equals(str2)) {
				System.out.println("철수, 승!");
			} else {
				System.out.println("영희, 승");
			}
		}
		if("r".equals(str1)) {
			if("s".equals(str2)) {
				System.out.println("철수, 승!");
			} else {
				System.out.println("영희, 승");
			}
		}
		if("p".equals(str1)) {
			if("r".equals(str2)) {
				System.out.println("철수, 승!");
			} else {
				System.out.println("영희, 승");
			}
		}
	}

}
