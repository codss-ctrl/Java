package practice;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Prac_05 {
	public static void main(String[] args) {
		

	// 1. 정수 5개를 저장할 수 있는 변수 score를 선언 및 생성
//		int []score = new int[5]	
				// 는 변수 score를 선언 및 생성	
	
//		String[] names = new String[]{"김씨","이씨","박씨","한씨"};
//		System.out.println("변경전:"+Arrays.toString(names));
		
	//2. "이씨"와 "박씨"의 위치를 변경
//		String temp = names[1]; 
//		names[1]=names[2];
//		names[2]=temp;
//		
//		System.out.println("변경후:"+Arrays.toString(names));
	
	//1. 5개의 숫자 5,2,3,1,4를 오름차순으로 정렬하는 코드를 작성하여라. 
	// 단. 선택정렬을 이용하여라. 12345 순
//		int[] arr = new int[]{5,2,3,1,4};
//		int temp;
//		int min;
//		for (int i = 0; i < arr.length-1; i++) {
//			min = i;
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[j]<arr[min]) {
//					min = j;
//				}	
//			}// 4. swap(arr[indexMin], arr[i])
//			temp = arr[min];
//			arr[min] = arr[i];
//			arr[i] = temp;
//
//
//		}System.out.println(Arrays.toString(arr));

	//1. 학생 4명의 3가지 과목의 점수를 위와 같이 획득 하였다. 
	// 데이터를 저장할 수 있는 2차원 배열의 생성 및 초기화
//
//		int score[][]	= new int[][]{
//								{100,70,30},
//								{45,76,88},
//								{37,45,28},
//								{47,89,100},//마지막 ,는 영향을 주지 않는다.
//								};
	//2. 1번에서 생성된 배열을 이용하여 위의 모양과 같이 출력		
		
//		System.out.println(("\t국어\t영어\t수학"));				
//		for (int hang = 0; hang < score.length; hang++) {
//			System.out.print(hang+1);//왼쪽 번호 1234 출력후 이어서 출력
//			for (int yeol = 0; yeol < score[hang].length; yeol++) {
//				System.out.print("\t"+score[hang][yeol]);//과목들 출력
//			}System.out.println();//한명의 점수를 출력 후 줄 바꿈
//		}


//		System.out.println("\t국어\t영어\t수학"); // 상단의 과목을 출력
//		 for(int hang = 0; hang < score.length; hang++){
//			 System.out.print(hang+1); // 번호를 출력 후 이어서 출력하기 위해 print()사용
//		 for(int yeol = 0; yeol < score[hang].length; yeol++){
//			 System.out.print("\t"+score[hang][yeol]); // 학생의 과목들을 출력
//		 } System.out.println(); // 한명의 점수를 출력 후 줄 바꿈을 위해 println()사용
//		 }

	//1. 6명의 학생이름을 저장할 수 있는 변수 names를 선언 및 생성하고 주변 친구들의
	 // 이름으로 초기화 하여라.		
//		String[] names = new String[]{
//				"이","김","박","수","방","고"
//				};
//				
//		System.out.println(Arrays.toString(names));
		
	//2. 7과목의 점수(정수)를 저장할 수 있는 변수 subjects를 선언 및 생성하고 국어, 
		// 영어, 수학, 사회, 과학, Java, Oracle로 초기화 하여라.
		int[] subjects = new int[7];
	
		System.out.println(("\t국어\t영어\t수학\t사회\t과학\tJava\tOracle\t합계\t평균\t석차"));
		for(int hang = 0; hang < subjects.length; hang++){
			 System.out.println(hang+1+"번"); 
		}	 
	}
}