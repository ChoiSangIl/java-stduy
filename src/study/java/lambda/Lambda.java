package study.java.lambda;

import java.util.Comparator;

public class Lambda {
	public static void main(String[] args) {

		new LambdaTest(new Runnable() {
			@Override
			public void run() {
				System.out.println("lamda");
			}
		}).run();

		new LambdaTest(() -> {
			System.out.println("lamda");
		}).run();

		System.out.println(new MyLambdaTest(() -> {
			return "abcdefg";
		}).caculate());

		// 인터페이스만 작성해두고 구현은 익명함수로 처리하겠다
		MyFunction myfun = (a, b) -> a > b ? a : b;
		System.out.println(myfun.max(1, 3));

		Comparator<Integer> comp = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println(comp.compare(2, 1));

		Comparator<Integer> comp2 = (o1, o2) -> (o1.compareTo(o2));
		System.out.println(comp2.compare(2, 1));

	}

	public static class LambdaTest implements Runnable {
		private Runnable target;

		LambdaTest(Runnable target) {
			this.target = target;
		}

		@Override
		public void run() {
			target.run();
		}
	}

	public static class MyLambdaTest {

		private MyLambda myLambda;

		public MyLambdaTest(MyLambda myLambda) {
			this.myLambda = myLambda;
		}

		public String caculate() {
			return myLambda.caculate();
		}

	}

	@FunctionalInterface
	public static interface MyFunction {
		public abstract int max(int a, int b);
		
		public abstract boolean equals(Object obj);
	}
}
