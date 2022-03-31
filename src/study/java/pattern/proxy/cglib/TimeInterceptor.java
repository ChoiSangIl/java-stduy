package study.java.pattern.proxy.cglib;

import java.lang.reflect.Method;
import java.util.Date;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Cglib�� ���� ���� maven���� dependency�� �߰��ϰų� jar������ �߰��������
 * @author ChoiSangIl
 *
 */
public class TimeInterceptor implements MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("cglib method call start [" + new  Date() + "]");
		Object rtn = proxy.invokeSuper(obj, args);
		System.out.println("cglib method call end[" + new  Date() + "]");
		return rtn;
	}
}
