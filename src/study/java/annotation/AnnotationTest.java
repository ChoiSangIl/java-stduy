package study.java.annotation;

import java.lang.reflect.Method;

public class AnnotationTest {
	public static void main(String[] args) {
		Human human = new Human();
		human.introduce();

		try {
			Method method = human.getClass().getDeclaredMethod("introduce");
			if(method.isAnnotationPresent(PrintHello.class)) {
				System.out.println("annotation hello");
				human.introduce();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static class Human {
		@PrintHello
		private void introduce() {
			System.out.println("my name is...");
		}
	}
}
