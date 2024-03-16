package homework_week2;

public class question_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = (char) (Math.random() * 26 + 'a');
		System.out.println("초기화 된 임의의 소문자 : " + c);
		int sub = (int) c - (int)'a';
		System.out.println("대문자로 변경된 문자 : " + (char) (65 + sub));
	}

}
