package study.java.pattern.builder;

public class BuilderPatternTest {
	public static void main(String[] args) {
		Product product = new Product.Builder(1L)
							.name("��ǰ")
							.build();
		
		System.out.println(product.toString());
		
		Product product2 = new Product.Builder(2L)
				.name("��ǰ2")
				.price(1000)
				.desc("test��ǰ")
				.build();
		
		System.out.println(product2);
	}
}
