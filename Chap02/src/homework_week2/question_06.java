package homework_week2;

import java.util.Scanner;

public class question_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하세요 : ");
		double num = sc.nextDouble();
		double answer = (num - 32) * 5/9;
		System.out.println("계산된 섭씨 온도 : " + answer);
	}

}
