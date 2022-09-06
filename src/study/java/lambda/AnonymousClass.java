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
		 * �� Lamda�Լ��� �������̽� �ȿ� 1���� �־�� �ұ�?
		 * Animal�̶� Ŭ������ �����Լ��� �Ѵٰ��ϸ� �Ʒ�ó�� �ؾ��ϳ�?
		 * sepak, age�Լ��� �������� ������� ó�� �� ����� ����.
		 * �׷��Ƿ� �Ѱ��� function�� �����ؾ��ϴµ�..!
		Animal anima2 = ()->{
			System.out.println("�۸�");
		}, ()->{
			System.out.println("10�� �̿���");
		}
		*/
		
		MyLambda myLambda = ()->{
			return "a";
		};
		System.out.println(myLambda.caculate());
	}
}
