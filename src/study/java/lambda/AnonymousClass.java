package study.java.lambda;

public class AnonymousClass {
	public static void main(String[] args) {
		
		//익명 클래스 (abstract)
		Person person = new Person() {
			int age = 10;
			@Override
			void speak() {
				System.out.println("나는 소리 칠 수 있다!");
			}
			
			@Override
			void age() {
				System.out.println(age +"살 입니다.");
				this.sex();
			}
			
			void sex() {
				System.out.println("저는 남자입니다.");
			}
		};
		
		person.speak();
		person.age();
		//person.sex(); error 발생
		
		//익명 클래스 (interface)
		Animal animal = new Animal() {
			@Override
			public void speak() {
				System.out.println("멍멍");
			}
			
			@Override
			public void age() {
				System.out.println("10살 이에요");
			}
		};
		
		animal.speak();
		animal.age();
		
		/*
		 * 왜 Lamda함수는 인터페이스 안에 1개만 있어야 할까? 
		 * Animal이란 클래스를 람다함수로 한다고하면 아래처럼 해야하나?
		 * sepak, age함수를 람다적인 방법으로 처리 할 방법이 없다.
		 * 그러므로 한개의 function만 존재해야하는듯..!
		Animal anima2 = ()->{
			System.out.println("멍멍");
		}, ()->{
			System.out.println("10살 이에요");
		}
		*/
		
		MyLambda myLambda = ()->{
			return "a";
		};
		System.out.println(myLambda.caculate());
	}
}
