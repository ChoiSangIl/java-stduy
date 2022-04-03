package study.java.pattern.proxy.cglib;

import java.util.ArrayList;
import java.util.List;

import net.sf.cglib.proxy.Enhancer;
import study.java.pattern.proxy.common.PaymentServiceImpl;

/**
 * 
 * @author Choi Sang Il
 * vm-argument --add-opens=java.base/java.lang=ALL-UNNAMED 추가 (추가안하면 오류가..)
 *
 */
public class CglibProxy {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PaymentServiceImpl.class);
        enhancer.setCallback(new TimeInterceptor());
        
        PaymentServiceImpl paymentService = (PaymentServiceImpl) enhancer.create();
        paymentService.pay();
        
        List<String> aa = new ArrayList<String>();
	}
}
