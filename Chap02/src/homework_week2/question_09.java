package homework_week2;

import java.util.Scanner;

public class question_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int jungong = sc.nextInt();
		System.out.print("교양 이수 학점 : ");
		int guang = sc.nextInt();
		System.out.print("일반 이수 학점 : ");
		int ilban = sc.nextInt();
		if(jungong >= 70) {
			if((guang>=30 && ilban >= 30) || ((guang + ilban) >= 80)) {
				System.out.println("졸업 가능");
			}
			else {
				System.out.println("졸업 불가능");
			}
		} else {
			System.out.println("졸업 불가능");
		}
	}

}
