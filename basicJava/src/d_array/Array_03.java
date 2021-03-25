package d_array;

public class Array_03 {
	public static void main(String[] args) {
/*	
	1. 정렬(sort)
	 - 여러 데이터를 빠르고 쉽게 찾기 위해 일정한 순서대로 데이터를 가지런히 나열하는 작업이다.
	 - 버블정렬, 삽입정렬, 선택정렬
	 
	2. 버블정렬 (bubble sort)
	 - 인접한 데이터 간에 교환이 계속해서 일어나면서 정렬이 이루어 진다.
	 - 가장 큰 값이 맨 뒤에 위치한다.  
	*/ 
	//1. 5개의 정수 5,2,3,1,4 변수 sortNum에 저장해주세요
		int[] sortNum = {5,2,3,1,4};
	 //2. 버블 정렬을 이용하여 정렬 
//		if (sortNum[0]>sortNum[1]) {
//			int temp = sortNum[0];
//			sortNum[0]=sortNum[1];
//			sortNum[1]= temp;
//			
//		}System.out.print(sortNum[0]);
//		
//		if (sortNum[1]>sortNum[2]) {
//			int temp = sortNum[1];
//			sortNum[1]=sortNum[2];
//			sortNum[2]=temp;
//		}System.out.print(sortNum[1]);
//		
//		if (sortNum[2]>sortNum[3]) {
//			int temp = sortNum[2];
//			sortNum[2]=sortNum[3];
//			sortNum[3]=temp;
//		}System.out.print(sortNum[2]);
//		
//		if (sortNum[3]>sortNum[4]) {
//			int temp = sortNum[3];
//			sortNum[3]=sortNum[4];
//			sortNum[4]=temp;
//		}System.out.print(sortNum[3]);
//		
//		System.out.print(sortNum[4]);
// 시작 0 끝 3
/*		for (int count = 0; count < sortNum.length-1; count++) {//회전
			System.out.print(count+1+"회전");
			for (int j = 0; j < sortNum.length-1-count; j++) {//버블
				if (sortNum[j]>sortNum[j+1]) {//-count:확정개념
					int temp = sortNum[j];//5
					sortNum[j]=sortNum[j+1];//22314
					sortNum[j+1]=temp;		//25314	
							
				}
				for (int i = 0; i < sortNum.length; i++) {
					System.out.print(sortNum[i]+" ");
				}	
				System.out.println();
	
			}
		}
*/		
	/*
	  3. 선택정렬(select sort)
	   - 
	  	int min =score[0]; //최솟값 저장
		  for (int i = 1; i < score.length; i++) {
			if (score[i]<min) {
				min=score[i];
	 */
	int[] sort = {5,2,3,1,4};//-> 3번방 찾기	
/*		int min = sort[0];
		int bang = 0;
	 	for (int i = 1; i < sort.length; i++) {
			if (min > sort[i]) {	
				min =sort[i];
						bang = i;
			}System.out.println();
		}
		
	
//2. 기준방과 최솟값 방 바꾸기
	 	int temp = sort[0];
	 	sort[0] = sort[bang];
	 	sort[bang]=temp;
	 	
	 	for (int i = 0; i < sortNum.length; i++) {
			System.out.println(sort[i]+" ");
		}System.out.println();
		
	//2회	
		int min1 = sort[1];
		int bang1 = 1;
	 	for (int i = 1+1; i < sort.length; i++) {
			if (min > sort[i]) {	
				min =sort[i];
				bang = i;
			}System.out.println();
		}
	 	int temp1 = sort[1];
	 	sort[1] = sort[bang1];
	 	sort[bang1]=temp1;
	 	
	 	for (int i = 0; i < sortNum.length; i++) {
			System.out.println(sort[i]+" ");
		}System.out.println();
		
		//3회	
		int min2 = sort[2];
		int bang2 = 2;
	 	for (int i = 1+2; i < sort.length; i++) {
			if (min > sort[i]) {	
				min =sort[i];
				bang = i;
			}System.out.println();
		}
	 	int temp2 = sort[2];
	 	sort[2] = sort[bang2];
	 	sort[bang2]=temp2;
	 	
	 	for (int i = 0; i < sortNum.length; i++) {
			System.out.println(sort[i]+" ");
		}System.out.println();	
		*/
		//3회전
		
		//시작 0 끝 3 증가량 1
		// 반복
		for (int j = 0; j < sort.length-1; j++) {//sort.length-1:회전수
			int min = sort[j];
			int bang = j;
		 	for (int i = 1+2; i < sort.length; i++) {
				if (min > sort[i]) {	
					min =sort[i];
					bang = i;
				}System.out.println();
			}
		 	int temp3 = sort[j];
		 	sort[j] = sort[bang];
		 	sort[bang]=temp3;
		 	
		 	for (int i1 = 0; i1 < sortNum.length; i1++) {
				System.out.println(sort[i1]+" ");
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
