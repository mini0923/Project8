package inheritance.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		BasicTV basicTV = new BasicTV();
		
		basicTV.status = "on";
		basicTV.channel = 7;
		basicTV.volume = 20;
		
		System.out.println("BasicTV 의");
		System.out.println("전원 상태는 : " + basicTV.status);
		System.out.println("채널은  : " + basicTV.channel);
		System.out.println("볼륨은  : " + basicTV.volume);
		System.out.println();
		
		SmartTV smartTV = new SmartTV();
		
		smartTV.status = "on";
		smartTV.channel = 11;
		smartTV.volume= 30;
		smartTV.ip = "192.168.0.111";
		
		System.out.println("SmartTV 의");
		System.out.println("전원 상태는 : " + smartTV.status);
		System.out.println("채널은  : " + smartTV.channel);
		System.out.println("볼륨은  : " + smartTV.volume);
		System.out.println("ip는  : " + smartTV.ip);
		
		
	}

}

class BasicTV {
		String status;
		int channel;
		int volume;
	
}
class SmartTV extends BasicTV {
		String  ip;
}