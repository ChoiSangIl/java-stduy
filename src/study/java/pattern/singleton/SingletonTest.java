package study.java.pattern.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		Land land = Land.getInstance();
		land.whoami();
		
		Land land2 = Land.getInstance();
		land2.whoami();
		
		/*
		 * 싱글톤 패턴은 왜 안티 패턴 일까?
		 *  1. 상속이 불가능
		 *  2. 상태를 가진 객체를 싱글톤으로 만들면 안된다.(Thread가 상태를 공유)
		 */
	}
	
}
