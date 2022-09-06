package study.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {

		// List�κ��� ��Ʈ���� ���� 
		List<String> list = Arrays.asList("a", "b", "c", "a", "A"); 
		//Stream<String> listStream = list.stream();

		// �迭�κ��� ��Ʈ���� ���� 
		//Stream<String> arrayStream = Stream.of("a", "b", "c"); 
		//�������� Stream<String> 
		//stream = Stream.of(new String[] {"a", "b", "c"}); 
		//Stream<String> stream = Arrays.stream(new String[] {"a", "b", "c"}); 
		//Stream<String> stream = Arrays.stream(new String[] {"a", "b", "c"}, 0, 3); 

		Stream<String> stream = list.stream().filter(name -> name.contains("a"));
		stream.forEach(System.out::println);
	}

}
