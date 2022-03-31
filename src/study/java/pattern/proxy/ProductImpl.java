package study.java.pattern.proxy;

public class ProductImpl implements Product{

	@Override
	public void ship() {
		System.out.println("ship...");
	}

}
