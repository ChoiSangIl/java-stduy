package study.java.pattern.proxy.common;

public class ProductServiceImpl implements ProductService{

	@Override
	public void ship() {
		System.out.println("ship...");
	}

}
