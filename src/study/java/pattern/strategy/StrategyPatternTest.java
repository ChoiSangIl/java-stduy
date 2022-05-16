package study.java.pattern.strategy;

public class StrategyPatternTest {
	public static void main(String[] args) {
		Train train = new Train();
		Bus bus = new Bus();
		
		train.setMovableStrategy(new LoadStrategy());
		bus.setMovableStrategy(new RailLoadStrategy());
		
		train.move();
		bus.move();
	}
}
