package week14;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("d2", "a2", "b1", "b3", "c");
		Stream<String> s2 = s1.sorted();
		s2.forEach(Util::print);
		
		System.out.println("\n국가 이름 순서 : ");
		Stream<Nation> n1 = Nation.nations.stream();
		Stream<Nation> n2 = n1.sorted(Comparator.comparing(Nation::getName));
		s3.forEach(Util::printWithParenthesis);
		
		System.out
	}
}
