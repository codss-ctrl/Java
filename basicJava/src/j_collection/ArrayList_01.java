package j_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList_01 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();		
		list1.add(new Integer(5));
		list1.add(new Integer(2));
		list1.add(new Integer(3));
		list1.add(1);
		list1.add(4);//오토박싱
		
		List<Integer> list2 = new ArrayList<>(list1.subList(1, 3));
		
		System.out.println(list1);//toString 오버라이드
		System.out.println(list2);
		
		System.out.println(list1.containsAll(list2));//요소를 포함하고 있느냐		
		System.out.println(list2.contains(list1));//객체를 포함하고 있느냐		
		
		//5,50,2,3,1,4
		list1.add(1,50);
		System.out.println(list1);
		
		list1.add(6,90);
		System.out.println(list1);//객체 인덱스 번호 보고 넣어야함
		
//		list1.remove(new Integer(2));//인덱스가 아니라 2라는 숫자를 지우고 싶을땐 객체를 넣어줘야함
		Integer i1 = list1.remove(2);//인덱스 2 삭제
		System.out.println(i1);
		System.out.println(list1);
		
		System.out.println(list1.set(2,900));//업데이트 기능
		System.out.println(list1);
		
		//collection에서는 정렬(sort)를 지원한다.
		
		Collections.sort(list1);
		System.out.println(list1);
		Integer i2 = list1.get(2);
		System.out.println(i2);
		
		
	}
}
