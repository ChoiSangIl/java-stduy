package study.java.pattern.strategy;

public class LoadStrategy implements MovableStrategy{

	@Override
	public void move() {
		System.out.println("도로를 사용한다");
	}

}
