package homework_week3;

import java.util.Scanner;

public class Page122_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("등수를 입력하세요 : ");
		int grade = sc.nextInt();
		
		switch(grade) {
		case 1:
			System.out.println("아주 잘했습니다.");
			break;
		case 2, 3:
			System.out.println("잘했습니다.");
			break;
		
		case 4, 5, 6:
			System.out.println("보통입니다.");

			break;
		default:
			System.out.println("노력해야겠습니다.");
		}
	}

}
