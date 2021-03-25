package j_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		
		Map<String, Integer> params = new HashMap<>();
		
		System.out.println(params.put("이종찬", new Integer(100)));//이전에 없었던 연관 -> null나옴
		params.put("길정우", 30);//오토박싱
		params.put("이미라", 200);
		
		//Update
		System.out.println(params.put("이종찬", 500));//이전의 value가 나옴
		
		int jung = params.get("길정우");
		System.out.println(jung);
		
		params.remove("이종찬");
		
		System.out.println(params);
		
		
		
		
		
		
		
		
	}
}
