package study.java.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 동적 프록시는 어떻게 생성할 수 있을까?
 * @author Choi Sang Il
 *
 */
public class DynamicProxy {
	public static void main(String[] args) {
    	Payment paymentProxy = (Payment) Proxy.newProxyInstance(Payment.class.getClassLoader(), new Class[] {Payment.class}, new TimeHandler(new PaymentImpl()));
    	paymentProxy.pay();
    	paymentProxy.cancle();
    	
    	Product productProxy = (Product) Proxy.newProxyInstance(Product.class.getClassLoader(), new Class[] {Product.class}, new InvocationHandler() {
    		Product product = new ProductImpl();
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("dynamic proxy method start...");
				Object ret = method.invoke(product, args);
				System.out.println("dynamic proxy method end...");
				return ret;
			}
		});
    	
    	productProxy.ship();
    	
	}
}
