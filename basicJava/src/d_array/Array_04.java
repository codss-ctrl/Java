package d_array;



public class Array_04 {
	public static void main(String[] args) {

		/*
		 * 1.다차원 배열 - 자바에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열도 허용한다. - 
		 -2차원 배열의 선언방법
		  -선언방법 선언예 
		  -변수타입[][] 변수명; int[][] arr; 
		  -변수타입[] 변수명[]; int[] arr[]; 
		  -변수타입 변수명[][]; int arr[][];
		 */
		// int[][] arr = new int[2][3];
		// arr [0][0]~arr[1][0]
		// [0][1] [1][1]
		// [0][2] [1][2] 시작 0 끝 1 증감 1 // 시작 0 끝 2 증감 1
		// for (int i = 0; i < 2; i++) {
		// for (int j = 0; j < 3; j++) {
		// System.out.print(arr[i][j]);
		// }
		// System.out.println();
		// }
		//
		//
		// 1.
		// int[][] apt = new int[3][]; //층수만 구분. 방은 아직
		// for (int i = 0; i < apt.length; i++) {
		// for (int j = 0; j < apt[i].length; j++) {
		// System.out.print(apt[i][j]);
		// }
		// System.out.println();
		// }
		/*
		 * { null, null, null }
		 */
		// apt[0]= new int[3]; //주소 안에 주소
		// System.out.println(apt[0][0]);
		// System.out.println(apt[0][1]);
		// System.out.println(apt[0][2]);
		//
		// apt[1]= new int[4];
		// System.out.println(apt[1][0]);
		// System.out.println(apt[1][1]);
		// System.out.println(apt[1][2]);
		// System.out.println(apt[1][3]);
		//
		// apt[2]= new int[2];
//		3. 우리반에서 아는 6명의 친구이름을 저장하세요.
		String[] names = new String[]{
					"조유진", "이학재", "김대호", "길민선","구나은","정예진"
		}; 
//		System.out.println(Arrays.toString(names));	
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
//		4. 7과목  저장
		String[] subject = new String[]{
				"국어","영어","수학","사회","과학","Java","Oracle"
		};
		
//		for (int i = 0; i < subject.length; i++) {
//			System.out.print("\t"+subject[i]);
//		}System.out.println(); //과목 가로 출력
//		
	
			
		
			
		// 1. 6명의 7과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성하여라.
		int[][] score = new int[6][7];
		// 2. score의 각방의 값을 0~100 사이의 임의의 값으로 초기화 하여라.
		// score[0][0] = (int)(Math.random()*101);
		// 0 1
		// 0 2
		// ..6 시작 0 끝 6 증가 1
		for (int floor = 0; floor < score.length; floor++) {// 0층~6층
			for (int room = 0; room < score[floor].length; room++) { // 7개의 방
				score[floor][room] = (int) (Math.random() * 101);// 안에 100까지 랜덤
			}
		}

		// 0. 출력
		// System.out.println(score[]+" ");

//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.print("\t"+ score[i][j]);
//			}
//			
//		}
		
//	출력
		
		
		
//			
		//합계
		int[] nameSum = new int[6];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];
			}
		}
		//평균
		float[] nameAvg = new float[6];
		for (int i = 0; i < names.length; i++) {
			nameAvg[i]=(int)(((float)nameSum[i]/names.length)*100+0.5)/100F;
		}
		
//		//과목별 합계
//		System.out.print("합계");
//		int[] subSum = new int[7];
//		
//		for (int i = 0; i < subSum.length; i++) {//subSum 6번 찍음
//			for (int j = 0; j < score.length; j++) {//score 행
//				
//					subSum[i]+=score[j][i];
//			}System.out.print("\t"+subSum[i]);
//		}System.out.println();
//		
//		//과목별 평균
//		System.out.print("과목평균");
//		float[] subAvg = new float[7];
//		for (int i = 0; i < subSum.length; i++) {
//			subAvg[i]= (int)(((float)subSum[i]/names.length)*100+0.5)/100F;
//			System.out.print("\t"+subAvg[i]);
//		}System.out.println();
		
	
//		8.석차
		int[] rank = new int[]{1,1,1,1,1,1};
		
		for (int i = 0; i < nameSum.length; i++) {
			for (int k = 0; k < nameSum.length; k++) {
				if(nameSum[i]<nameSum[k]){
					rank[i]++;
					
				}
			}
		}
//		9.버블
//		for (int i = 0; i < nameSum.length; i++) {
//			for (int j = 0; j < nameSum.length-1; j++) {
//				if (nameSum[j]>nameSum[j+1]) {
//					int temp = nameSum[j];
//					nameSum[j]=nameSum[j+1];
//					nameSum[j+1]=temp;
//				}
//				for (int i1 = 0; i1 < nameSum.length; i1++) {
//				}
//			}
//			System.out.println(nameSum[i]+"\t");
//		}System.out.println();
//		
		
		 

		
		
//		for (int count = 0; count < sortNum.length-1; count++) {//회전
//			System.out.print(count+1+"회전");
//			for (int j = 0; j < sortNum.length-1-count; j++) {//버블
//				if (sortNum[j]>sortNum[j+1]) {//-count:확정개념
//					int temp = sortNum[j];//5
//					sortNum[j]=sortNum[j+1];//22314
//					sortNum[j+1]=temp;		//25314	
//							
//				}
//				for (int i = 0; i < sortNum.length; i++) {
//					System.out.print(sortNum[i]+" ");
//			}	
//				System.out.println();
//		}
//출력		
		for (int i = 0; i < subject.length; i++) {
			System.out.print("\t"+subject[i]);
		}System.out.println("\t합계"+"\t평균"+"\t석차"); //과목 가로 출력
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i]);
			for (int j = 0; j < score[i].length; j++) {
				System.out.print("\t"+ score[i][j]);
				nameSum[i] += score[i][j];
				nameAvg[i]=(int)(((float)nameSum[i]/names.length)*100+0.5)/100F;
			}
			System.out.println("\t"+nameSum[i]+"\t"+nameAvg[i]+"\t"+rank[i]);
		}
		//과목별 합계
		System.out.print("합계");
		int[] subSum = new int[score.length];
		for (int i = 0; i < subSum.length; i++) {//subSum 6번 찍음
			for (int j = 0; j < score.length; j++) {//score 행
				subSum[i]+=score[j][i];
			}System.out.print("\t"+subSum[i]);
		}System.out.println();
		
		//과목별 평균
		System.out.print("과목평균");
		float[] subAvg = new float[subSum.length];
		for (int i = 0; i < subSum.length; i++) {
			subAvg[i]= (int)(((float)subSum[i]/names.length)*100+0.5)/100F;
			System.out.print("\t"+subAvg[i]);
		}System.out.println();
		
		
		
		
		
	}
}
