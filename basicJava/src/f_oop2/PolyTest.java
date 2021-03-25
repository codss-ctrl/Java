package f_oop2;

public class PolyTest {
	public static void main(String[] args) {
		//1. SmartTv 2대 저장
		SmartTv sm1 = new SmartTv();
		SmartTv sm2 = new SmartTv();
		
		
		SmartTv[] sm = new SmartTv[2];
		sm[0] = sm1;
		sm[1] = sm2;
		//2. AfreecaTv 3대 저장
		AfreecaTv af1 = new AfreecaTv();
		AfreecaTv af2 = new AfreecaTv();
		AfreecaTv af3 = new AfreecaTv();
		
		AfreecaTv[] af = new AfreecaTv[3];
		af[0] = af1;
		af[1] = af2;
		af[2] = af3;
		//3. ThreeDTv 4대 저장
		ThreeDTv td1 = new ThreeDTv();
		ThreeDTv td2 = new ThreeDTv();
		ThreeDTv td3 = new ThreeDTv();
		ThreeDTv td4 = new ThreeDTv();
		
		ThreeDTv[] td = new ThreeDTv[]{td1,td2,td3,td4};
		
		Tv[] t = new Tv[9];
		t[0] =(Tv)sm1;
		t[1] =sm2;
		
		t[2] =af1;
		t[3] =af2;
		t[4] =af3;
		
		t[5] =td1;
		t[6] =td2;
		t[7] =td3;
		t[8] =td4;
		
		AfreecaTv a=(AfreecaTv)t[3];
		
		
		
		
		
	}
}

class Tv{
	boolean power;
	int channel;
	
	//파워 조정
	void Power(){
		power = !power;
	}
	//채널 올리기
	void channelUp(){
		channel++;
	}
	
	//채널 내리기
	void channelDown(){
		channel--;
	}
	
}
class  SmartTv extends Tv{
	void interNet(){
		
	}
}

class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
	
}

class ThreeDTv extends Tv{
	void auziruwo(){
		
	}
	
}











