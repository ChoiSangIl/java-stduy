package study.java.hash.equals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashEqualsTest {

	public static void main(String[] args) {
		Foo foo1 = new Foo(1);
		Foo foo2 = new Foo(1);
		
		// == �ּ� �˻�
		System.out.println("[�����Ǹ� ���ϰ� �� ���� ���] equals ��:" +foo1.equals(foo2) + " foo1 hash:" + foo1.hashCode() + " foo2 hash:" + foo2.hashCode());		//equals -> return (this == obj);
		System.out.println("[�����Ǹ� ���ϰ� �� ���� ���] == ��:" + (foo1 == foo2));
		
		//Bar equlas�� �������̵� id���� ������ ���� ��ü��� �Ǵ�.
		Bar bar1 = new Bar(1);
		Bar bar2 = new Bar(1);
		
		//�ּҰ� �ٸ����� �������� id���� ������ ���� �Ŷ�� �Ǵ�.
		System.out.println("[equals�� ������] equals ��: " + bar1.equals(bar2) + " bar1 hash:" + bar1.hashCode() + " bar2 hash:" + bar2.hashCode());		//equals -> return (this == obj);
		System.out.println("[equals�� ������] == �� : "+(bar1 == bar2) + " bar1 �ּ�:" + bar1 + " bar2 �ּ�:" + bar2);
		
		//equals�� �������̵� ���� �� ������ ������.
		List<Bar> bars = new ArrayList<>();
		bars.add(bar1);
		bars.add(bar2);
		System.out.println("[equals�� �������̵� ���� �� ������ ������] bars list size : "+bars.size());
		
		Set<Bar> setBars = new HashSet<>();
		setBars.add(bar1);
		setBars.add(bar2);		
		System.out.println("[equals�� �������̵� ���� �� ������ ������] bars HashSet size : "+setBars.size());
		
		//set�� �־��µ� �ٸ� ��ü�� �Ǵ��Ѵ�. why? 
		//hash���� ����ϴ� Collection�� hashCode�� equals���� ���ƾ� ���� ��ü�� �Ǵ��Ѵ�.
		Baz baz1 = new Baz(1);
		Baz baz2 = new Baz(1);
		
		List<Baz> bazs = new ArrayList<>();
		bazs.add(baz1);
		bazs.add(baz2);
		System.out.println("[equals, hashCode ������] setBazs list size : "+bars.size());
		
		Set<Baz> setBazs = new HashSet<>();
		setBazs.add(baz1);
		setBazs.add(baz2);		
		System.out.println("[equals, hashCode ������] setBazs HashSet size : "+setBazs.size());
	}

}
