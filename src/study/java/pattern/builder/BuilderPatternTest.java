package study.java.pattern.builder;

public class BuilderPatternTest {
	public static void main(String[] args) {
		Product product = new Product.Builder(1L)
							.name("상품")
							.build();
		
		System.out.println(product.toString());
		
		Product product2 = new Product.Builder(2L)
				.name("상품2")
				.price(1000)
				.desc("test상품")
				.build();
		
		System.out.println(product2);
	}
}
