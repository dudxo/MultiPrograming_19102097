package homework_week4;

class Member{
	private String name;
	private String id;
	private String pw;
	private String age;
	
	Member(){}
	Member(String name, String id, String pw, String age){
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}

public class Page164_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("권영태", "test", "1234", "25");
	}

}
