package j_collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
//		for (int i = 0; i < 10; i++) {
//			boolean re =set.add((int)Math.random()*5);//오토박싱
//			System.out.println(re);
//		}
//		System.out.println(set);
	
		//1. 로또번호 6개 저장하기 1~45
		
		//2. 정렬해주세요
		
//		while (set.size()<6) {
//			int rnd = (int)(Math.random()*45+1);
//			set.add(rnd);
//		}
		while (true) {
			int rnd = (int)(Math.random()*45+1);
			set.add(rnd);
			if(set.size()==6){
				break;
			}
		}
		System.out.println(set);
		
//		Set<Integer> set = new HashSet<>(); set은 Hashset 타입 - > 리스트형식으로 바꿔야
		
		List<Integer> list1 = new ArrayList<>(set);
		Collections.sort(list1);
		System.out.println(list1);
		
	}
}
