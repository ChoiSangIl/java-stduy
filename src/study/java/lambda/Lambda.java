package study.java.lambda;

import java.util.Collections;
import java.util.Comparator;

public class Lambda {
	public static void main(String[] args) {
		
		new LambdaTest(new Runnable() {
			@Override
			public void run() {
				System.out.println("lamda");
			}
		}).run();
		
		new LambdaTest(()->{
			System.out.println("lamda");
		}).run();
		
		System.out.println(
			new MyLambdaTest(()->{
				return "abcdefg";
			}).caculate()
		);
		
		//�������̽��� �ۼ��صΰ� ������ �͸��Լ��� ó���ϰڴ�
		MyFunction myfun = (a,b) -> a > b ? a:b;
		System.out.println(myfun.max(1, 3));
		
	}
	
	public static class LambdaTest implements Runnable{
	    private Runnable target;
	    
		LambdaTest(Runnable target){
			this.target = target;
		}
		
		@Override
		public void run() {
			target.run();
		}
	}
	
	public static class MyLambdaTest{
		
		private MyLambda myLambda;
		
		public MyLambdaTest(MyLambda myLambda) {
			this.myLambda = myLambda;
		}

		public String caculate() {
			return myLambda.caculate();
		}
		
	}
	
	@FunctionalInterface
	public static interface MyFunction{
		public abstract int max(int a, int b);
	}
}


