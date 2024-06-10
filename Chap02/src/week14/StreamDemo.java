package week14;

import java.util.*;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		
		for (int i = 0; i < 10; i++)
			list.add(r.nextInt(30));
		
		List<Integer> gt10 = new ArrayList<>();
		for (int i : list)
			gt10.add(i);
		
		Collections.sort(gt10);
		System.out.println(gt10);
		
		list.stream()
		.filter(i -> i > 10)
		.sorted()
		.forEach(x -> System.out.print(x + " "));
	}

}
