package homework_week10;

import java.util.Arrays;

public class Page302_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] b = {new Book(15000), new Book(50000), new Book(20000)};
		
		System.out.println("정렬 전");
		for(Book book : b) {
			System.out.println(book);
		}
		
		Arrays.sort(b);
		
		System.out.println("정렬 후");
		for(Book book : b) {
			System.out.println(book);
		}
		
	}

}

class Book implements Comparable{
	int price;
	
	Book(int price){
		this.price = price;
	}
	
	public String toString() {
		return String.format("Book [price=%d]", price);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Book o2 = (Book) o;
		return this.price > o2.price ? 1 : -1;
	}
	
	
}
