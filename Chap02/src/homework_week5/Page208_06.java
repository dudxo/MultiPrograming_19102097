package homework_week5;

public class Page208_06 {
	
	public static int[] reverse(int[] org) {
		int[] temp = new int[org.length];
		for(int i = 0; i < org.length; i++) {
			temp[org.length-i-i] = org[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
