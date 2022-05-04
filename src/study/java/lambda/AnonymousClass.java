package study.java.lambda;

public class AnonymousClass {
	public static void main(String[] args) {
		
		//�͸� Ŭ���� (abstract)
		Person person = new Person() {
			int age = 10;
			@Override
			void speak() {
				System.out.println("���� �Ҹ� ĥ �� �ִ�!");
			}
			
			@Override
			void age() {
				System.out.println(age +"�� �Դϴ�.");
				this.sex();
			}
			
			void sex() {
				System.out.println("���� �����Դϴ�.");
			}
		};
		
		person.speak();
		person.age();
		//person.sex(); error �߻�
		
		//�͸� Ŭ���� (interface)
		Animal animal = new Animal() {
			@Override
			public void speak() {
				System.out.println("�۸�");
			}
			
			@Override
			public void age() {
				System.out.println("10�� �̿���");
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
