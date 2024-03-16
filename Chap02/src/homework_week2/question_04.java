package homework_week2;

import java.util.Scanner;

public class question_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int num = sc.nextInt();
		int hour = num/3600;
		int min = (num%3600)/60;
		int sec = (num%3600)%60;
		System.out.printf("%d시간 %d분 %d초", hour, min, sec);
	}

}
