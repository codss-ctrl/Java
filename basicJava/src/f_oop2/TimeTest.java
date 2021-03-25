package f_oop2;

public class TimeTest {
	public static void main(String[] args) {
		TimeVO vo  = new TimeVO();//인스턴스
		//13시 40분 50초
//		vo.hour = 13;
//		vo.minute = 40;
//		vo.seconds = 50;//객체
		
		
		//시간 6
		//분 356 => 11시 56분
		//초 7200+60+53 => 7313초 => 13:57:53
		
		vo.setHour(6);
		vo.setMinute(356);
		vo.setSeconds(7313);
	
		System.out.println(vo.getHour() + ":"+vo.getMinute()+":"+vo.getSeconds());
		//시간 22
		//분 1434 => 21시 54분
		//초 10800 + 600 + 23 => 11423 => 1: 4: 23 
		TimeVO vo1  = new TimeVO();
		
		vo1.setHour(22);//22시
		vo1.setMinute(1434);//23시간(시로) ->54분 -> 64분 ->4분
		vo1.setSeconds(11423);//2시간(시로) 10분(분으로) ->23초
		System.out.println(vo1.getHour() + ":"+vo1.getMinute()+":"+vo1.getSeconds());
	}
}

class TimeVO{
	private int hour;
	private int minute;//10
	private int seconds;
	
//	void setHour(int hour){//setter
//		if (hour > 23) {
//		this.hour =hour % 24;
//		}else{
//			this.hour = hour;
//		}
//	}
	void setHour(int hour){//setter
		this.hour =hour % 24;
	}
	int getHour(){//getter
		return hour;
	}
//	
//	void setMinute(int minute){
//		
//		if(minute>59){
//			this.hour += minute / 60;//시간 
//			this.minute = minute % 60;//분
//
//		}else{
//			this.minute = minute;
//		}
//			setHour(this.hour);
//	}

	void setMinute(int minute){
		setHour(hour +minute / 60);
		this.minute = minute % 60;//분
//		this.hour += minute / 60;//시간 
//		setHour(this.hour);
	}
	
	int getMinute(){
		return minute;
	}
	
//	void setSeconds(int seconds){
//		if (seconds>59) {
//			this.hour += seconds / 3600; //시
//			this.minute += (seconds % 3600) /60; //분
//			this.seconds = (seconds % 3600) % 60; // 초
//		}else{
//			this.seconds = seconds;
//		}
//		setHour(this.hour);
//		setMinute(this.minute);
//	}
	
	void setSeconds(int seconds){
		
//		this.hour += seconds / 3600; //시
//		this.minute += (seconds % 3600) /60; //분
		setMinute(minute+seconds/60);
		this.seconds = seconds % 60; // 초
	}
	
	int getSeconds(){
		return seconds;
	}

	
}