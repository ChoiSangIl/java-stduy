package study.java.pattern.proxy;

public class PaymentImpl implements Payment{

	@Override
	public void pay() {
		System.out.println("pay...");
	}

}
