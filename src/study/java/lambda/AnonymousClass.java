package study.java.lambda;

public class AnonymousClass {
	public static void main(String[] args) {

		Person person = new Person() {
			int age = 10;
			@Override
			void speak() {
				System.out.println("나는 사람이다!");
			}
			
			@Override
			void age() {
				System.out.println(age +"살이다");
				this.sex();
			}
			
			void sex() {
				System.out.println("남자이다!");
			}
		};
		
		person.speak();
		person.age();
		//person.sex(); error 발생 왜? 익명클래스를 만들때 생성된 함수이므로 접근 불가!

		Animal animal = new Animal() {
			@Override
			public void speak() {
				System.out.println("음매");
			}
			
			@Override
			public void age() {
				System.out.println("10살 입니다");
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
