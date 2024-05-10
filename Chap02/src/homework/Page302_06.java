package homework;

public class Page302_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human.echo();

        Student s = new Student(20);
        s.print();
        s.eat();

        Human p = new Worker();
        p.print();
        p.eat();
	}

}

class Worker implements Human{
    @Override
    public void eat() {
        System.out.println("빵을 먹습니다.");
    }
}

class Student extends Worker implements Human{
    int age;
    Student (int age){
        this.age = age;
    }
    public void print(){
        System.out.println(age + "세의 학생입니다.");
    }

    @Override
    public void eat(){
        System.out.println("도시락을 먹습니다.");
    }
}

interface Human {
    static void echo() {
        System.out.println("야호!!!");
    }

    default void print() {
        System.out.println("인간입니다.");
    }
    void eat();
}

