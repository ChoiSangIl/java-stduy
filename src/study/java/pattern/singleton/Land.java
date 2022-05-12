package study.java.pattern.singleton;

public class Land {
	
	private static Land land = new Land();
	
	private Land() {
	}
	
	public static Land getInstance() {
		return land;
	}
	
	public void whoami() {
		System.out.println(this.getClass().hashCode());
	}
}
