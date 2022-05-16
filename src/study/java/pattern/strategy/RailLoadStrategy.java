package study.java.pattern.strategy;

public class RailLoadStrategy implements MovableStrategy{

	@Override
	public void move() {
		System.out.println("레일을 사용한다");
	}

}
