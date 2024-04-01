package homework_week4;

class GolfClub{
	int num;
	String name;
	
	GolfClub(){this.name = "아이언"; this.num = 7;}
	GolfClub(int num){this.name = "아이언"; this.num = num;}
	GolfClub(String name){this.name = name; this.num = 7;}

    void print(){
        if (name.equals("아이언")) {
            System.out.printf("%d번 %s입니다.\n", num, name);
        }
        else System.out.printf("%s입니다.\n", name);
    }

}

public class Page164_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
	}

}
