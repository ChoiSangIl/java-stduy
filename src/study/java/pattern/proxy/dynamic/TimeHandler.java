package study.java.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class TimeHandler implements InvocationHandler{

	Object target;
	
	public TimeHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object ret;
		if(method.getName() == "pay") {
			System.out.println("method cal..[" + new Date() + "]");
			ret = method.invoke(target, args);
			System.out.println("method end..[" + new Date() + "]");
		}else {
			ret = method.invoke(target, args);
		}
		return ret;
	}
}
