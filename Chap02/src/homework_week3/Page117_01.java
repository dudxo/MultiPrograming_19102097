package homework_week3;

import java.util.Scanner;

public class Page117_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("계산하고 싶은 팩토리얼 정수를 입력하세요 : ");
		n = in.nextInt();
		result = 1;
		while(n > 0) {
//		while(true)
			result *=n;
			n--;
		}
		System.out.println(result);
		
	}

}
