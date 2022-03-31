package study.java.pattern.proxy.common;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public void pay() {
		System.out.println("pay...");
	}

	@Override
	public void cancle() {
		System.out.println("cancle...");
	}

}
