package study.java.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import study.java.pattern.proxy.common.PaymentService;
import study.java.pattern.proxy.common.PaymentServiceImpl;
import study.java.pattern.proxy.common.ProductService;
import study.java.pattern.proxy.common.ProductServiceImpl;

/**
 * 동적 프록시는 어떻게 생성할 수 있을까?
 * @author Choi Sang Il
 *
 */
public class DynamicProxy {
	public static void main(String[] args) {
    	PaymentService paymentProxy = (PaymentService) Proxy.newProxyInstance(PaymentService.class.getClassLoader(), new Class[] {PaymentService.class}, new TimeHandler(new PaymentServiceImpl()));
    	paymentProxy.pay();
    	paymentProxy.cancle();
    	
    	ProductService productProxy = (ProductService) Proxy.newProxyInstance(ProductService.class.getClassLoader(), new Class[] {ProductService.class}, new InvocationHandler() {
    		ProductService productService = new ProductServiceImpl();
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("dynamic proxy method start...");
				Object ret = method.invoke(productService, args);
				System.out.println("dynamic proxy method end...");
				return ret;
			}
		});
    	
    	productProxy.ship();
    	
	}
}
