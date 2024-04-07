package homework_week5;

public class Page208_07 {

	static void sameArrays(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			System.out.println("다릅니다.");
			return;
		}
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				System.out.println("다릅니다.");
				return;
			}
		}
		System.out.println("같습니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 2, 4, 1, 5};
        int b[] = {3, 2, 4, 1};
        int c[] = {3, 2, 4, 1, 5};
        int d[] = {2, 7, 1, 8, 2};
        sameArrays(a, b);
        sameArrays(a, c);
        sameArrays(a, d);
        sameArrays(b, c);
        sameArrays(b, d);
        sameArrays(c, d);
	}

}
