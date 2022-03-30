package study.java.access.modifier;

public class Protected {

	public static void main(String[] args) {
		ProtectedConstructorClass protectedClass = new ProtectedConstructorClass("hello");
		protectedClass.printHello();
	}
}
