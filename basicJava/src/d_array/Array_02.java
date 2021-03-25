package d_array;

public class Array_02 {
public static void main(String[] args) {
	//1. 정수 7개를 저장할 수 있는 변수 score를 선언 및 생성하여라.
		int[] score = new int[7];//0000000
		
/*		int[] score;
		score= new int[7];*/
		
	 //2. 변수 score의 각 요소를 0이상 100이하인 임의의 정수를 저장하여라.
		 //7개 수 저장
		
		for (int i = 0; i < score.length; i++) {
			// 배열의 길이 (7)만큼 반복문 실행
		score[i] =(int)(Math.random()*101);//100까지 랜덤 돌려서 차례로 저장
		   
			}
		 
//			 score[0]index = random1;i
//			 score[1] = random2;
//			 score[2] = random;
//			 score[3] = random1;
//			 score[4] = random1;..score[6]까지
		
//			score={random};
			
		
	
	//3. 변수 score에 저장된 요소들의 합계를 구하여라.
//	int score = {ran1 2 3 4 5 6 7};
		  int hab = 0;//0으로 초기화, 끝엔 ran1+2...+ran7
		  
		  for (int index = 0; index < score.length; index++) {
			  //index 0부터 6까지 
			hab += score[index]; //ran1+2...+ran7
			System.out.println("총첨 : "+hab);
		}
		  
	 //4. 변수 score에 저장된 요소들의 평균을 구하여라.
	// hab /7
		  float  average = 0; //평균을 저장하기 위한 변수
		  average = (int)(float)(hab/score.length*100f+0.5)/100f; 
	
		  System.out.println("평균 : "+ average);
	 // 단 소수점 세 번째 자리에서 반올림하여 두 번째 자리까지 표현하여라.
		  
	 //5. 변수 score에 저장된 요소에서 최댓값을 구하여라.
		  int max =score[0];//최댓값 저장할 변수 
		  for (int i = 1; i < score.length; i++) {
			if (score[i]> max) {
				max=score[i];
			}
		}
	 //6. 변수 score에 저장된 요소에서 최솟값을 구하여라.
		  int min =score[0]; //최솟값 저장
		  for (int i = 1; i < score.length; i++) {
			if (score[i]<min) {
				min=score[i];
			}
		}
	 //7. 1~6번의 결과를 이용하여 결과와 같이 출력하여라. 
		  // 단. 임의의 정수값들의 연산임으로 결과는 다를 수 있음.

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
}
