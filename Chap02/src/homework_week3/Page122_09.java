package homework_week3;

public class Page122_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}
	
	static void foo(String str) {
		System.out.printf("%s", str);
		System.out.println();
	}
	
	static void foo(String str, int a) {
		System.out.printf("%s %d", str, a);
		System.out.println();
	}
	
	static void foo(String str, int a, int b) {
		System.out.printf("%s %d %d", str, a, b);
		System.out.println();
	}
	

}
