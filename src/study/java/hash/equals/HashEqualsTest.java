package study.java.hash.equals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashEqualsTest {

	public static void main(String[] args) {
		Foo foo1 = new Foo(1);
		Foo foo2 = new Foo(1);
		
		// == 주소 검색
		System.out.println("[재정의를 안하고 비교 했을 경우] equals 비교:" +foo1.equals(foo2) + " foo1 hash:" + foo1.hashCode() + " foo2 hash:" + foo2.hashCode());		//equals -> return (this == obj);
		System.out.println("[재정의를 안하고 비교 했을 경우] == 비교:" + (foo1 == foo2));
		
		//Bar equlas만 오버라이딩 id값이 같으면 같은 객체라고 판단.
		Bar bar1 = new Bar(1);
		Bar bar2 = new Bar(1);
		
		//주소가 다르더라도 논리적으로 id값이 같으면 같은 거라고 판단.
		System.out.println("[equals만 재정의] equals 비교: " + bar1.equals(bar2) + " bar1 hash:" + bar1.hashCode() + " bar2 hash:" + bar2.hashCode());		//equals -> return (this == obj);
		System.out.println("[equals만 재정의] == 비교 : "+(bar1 == bar2) + " bar1 주소:" + bar1 + " bar2 주소:" + bar2);
		
		//equals만 오버라이딩 했을 때 나오는 문제점.
		List<Bar> bars = new ArrayList<>();
		bars.add(bar1);
		bars.add(bar2);
		System.out.println("[equals만 오버라이딩 했을 때 나오는 문제점] bars list size : "+bars.size());
		
		Set<Bar> setBars = new HashSet<>();
		setBars.add(bar1);
		setBars.add(bar2);		
		System.out.println("[equals만 오버라이딩 했을 때 나오는 문제점] bars HashSet size : "+setBars.size());
		
		//set에 넣었는데 다른 객체로 판단한다. why? 
		//hash값을 사용하는 Collection은 hashCode와 equals값이 같아야 동등 객체로 판단한다.
		Baz baz1 = new Baz(1);
		Baz baz2 = new Baz(1);
		
		List<Baz> bazs = new ArrayList<>();
		bazs.add(baz1);
		bazs.add(baz2);
		System.out.println("[equals, hashCode 재정의] setBazs list size : "+bars.size());
		
		Set<Baz> setBazs = new HashSet<>();
		setBazs.add(baz1);
		setBazs.add(baz2);		
		System.out.println("[equals, hashCode 재정의] setBazs HashSet size : "+setBazs.size());
	}

}
