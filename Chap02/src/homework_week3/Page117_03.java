package homework_week3;

public class Page117_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;

		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	static int factorial(int x) {
		int r = 1;
		while(x > 0) {
			r *= x;
			x--;
		}
		
		return r;
	}

	static int factorial(int x, int y) {
		int r = 1;
		while(x <= y) {
			r *= x;
			x++;
		}
		return r;
	}
}
