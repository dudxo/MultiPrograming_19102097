package homework_week3;

import java.util.Scanner;

public class Page117_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("계산하고 싶은 팩토리얼 정수를 입력하세요 : ");
		n = in.nextInt();
		
		result = (factorial(n));
		System.out.println(result);
	}

	static int factorial(int x) {
		int r = 1;
		while(x > 0) {
			r *= x;
			x--;
		}
		
		return r;
	}
}
