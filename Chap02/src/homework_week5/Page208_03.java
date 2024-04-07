package homework_week5;

public class Page208_03 {

	enum Direction{
		동, 서, 남, 북
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Direction d : Direction.values())
			System.out.print(d + " ");
	}

}
