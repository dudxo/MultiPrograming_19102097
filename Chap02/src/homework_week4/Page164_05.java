package homework_week4;

class Line{
	int len;
	
	Line(){}
	Line(int len){ this.len = len;}
	
	boolean isSameLine(Line l) {
		return this.len == l.len;
	}
}

public class Page164_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a == b);
	}

}
