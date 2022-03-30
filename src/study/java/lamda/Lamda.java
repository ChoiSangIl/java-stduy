package study.java.lamda;

public class Lamda {
	public static void main(String[] args) {
		
		new LamdaTest(new Runnable() {
			@Override
			public void run() {
				System.out.println("lamda");
			}
		}).run();
		
		new LamdaTest(()->{
			System.out.println("lamda");
		}).run();
		
	}
	
	public static class LamdaTest implements Runnable{
	    private Runnable target;
	    
		LamdaTest(Runnable target){
			this.target = target;
		}
		
		@Override
		public void run() {
			target.run();
		}
	}
}


