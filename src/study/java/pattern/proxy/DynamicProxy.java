package study.java.pattern.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxy {
	public static void main(String[] args) {
    	Payment paymentProxy = (Payment) Proxy.newProxyInstance(Payment.class.getClassLoader(), new Class[] {Payment.class}, new TimeHandler(new PaymentImpl()));
    	paymentProxy.pay();
	}
}
