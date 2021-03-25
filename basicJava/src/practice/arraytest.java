package practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class arraytest {
//	public static void main(String[] args) {
//		
//		
//		String[] arr= {"aaa","aaa","bbb","ccc","ddd","ccc","eee"};
//			
//		Map<String, Object> map = new HashMap<>();
//			for(String key : arr) {
//				map.put(key, map.getOrDefault(key, 0)+1);
//			}
//		System.out.println(map);
//	}
}

//출력결과-----------------------------
//{aaa=2, ccc=2, bbb=1, eee=1, ddd=1}

//class test{
//	
//	Integer[] arr = {1,1,1,3,2,1,2,3,1,2,1,2,4,3,3,3};
//	
//	Arrays.sort(arr);
//	List<List<Integer>> rtnList = new ArrayList<List<Integer>>();
//	List<Integer> tempList = new ArrayList<Integer>();
//	for(int i= 0 ; i<arr.length-1;i++) {
//		tempList.add(arr[i]);
//		if(arr[i]!=arr[i+1]) {
//			rtnList.add(tempList);
//			tempList = new ArrayList<Integer>();
//		}
//	}
//	if(arr[arr.length-1] == arr[arr.length-2]) {
//		tempList.add(arr[arr.length-1]);
//	}else {
//		tempList = new ArrayList<Integer>();
//		tempList.add(arr[arr.length-1]);
//	}
//	rtnList.add(tempList);
//	
//	//-----출력부-----
//	for(List<Integer> list : rtnList) {
//		System.out.println();
//		for(Integer i : list) {
//			System.out.print(i+ " ");
//		}
//	}
//}
