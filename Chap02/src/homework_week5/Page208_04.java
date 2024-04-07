package homework_week5;

import java.util.Scanner;

public class Page208_04 {

	static void verifyCom(String url) {
		if(url.endsWith("com")) {
			System.out.printf("%s은 'com'으로 끝납니다.", url);
		}
		else {
			System.out.printf("%s은 'com'으로 끝나지 않습니다.", url);			
		}
	}
	
	static void verifyJava(String url) {
		if(url.contains("java")) {
			System.out.printf("%s은 'java'를 포함합니다.", url);
		}
		else {
			System.out.printf("%s은 'java'를 포함하지 않습니다.", url);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("URL을 입력하세요 : ");
			String url = sc.nextLine();
			if("bye".equals(url)) {
				break;
			}
			verifyCom(url);
			System.out.println();
			verifyJava(url);
			System.out.println();
		}
		
	}

}
