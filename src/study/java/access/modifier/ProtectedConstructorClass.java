package study.java.access.modifier;

public class ProtectedConstructorClass {
	
	String hello;
	
	protected ProtectedConstructorClass(String hello) {
		this.hello = hello;
	}
	
	public void printHello() {
		System.out.println(this.hello);
	}
}
