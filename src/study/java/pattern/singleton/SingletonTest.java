package study.java.pattern.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		Land land = Land.getInstance();
		land.whoami();
		
		Land land2 = Land.getInstance();
		land2.whoami();
		
		/*
		 * �̱��� ������ �� ��Ƽ ���� �ϱ�?
		 *  1. ����� �Ұ���
		 *  2. ���¸� ���� ��ü�� �̱������� ����� �ȵȴ�.(Thread�� ���¸� ����)
		 */
	}
	
}
