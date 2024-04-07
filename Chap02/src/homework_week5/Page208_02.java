package homework_week5;

public class Page208_02 {

	private static int sumExceptFirst(int a, int... b) {
		int sum = 0;
        
		for (int i : b) { 
			sum += i;
		}
		return sum;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumExceptFirst(1, 2, 3, 4));
		int arr[] = { 2, 3 };
		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
	}
}
