package override.quiz;

public class Quiz3 {

	public static void main(String[] args) {
	
		Computer computer1 = new Computer();
		computer1.on();
		computer1.off();
		
		Computer computer2 = new Notebook();
		computer2.on();
		computer2.off();
		
		Computer computer3 = new DeskTop();
		computer3.on();
		computer3.off();
		
	}

}


class Computer {
	
	public void on() {
		System.out.println("컴퓨터를 켠다");
	}
	
	public void off() {
		System.out.println("컴퓨터를 끈다");
	}
}

class Notebook extends Computer {

	@Override
	public void on() {
		System.out.println("노트북을 켠다");
	}

	@Override
	public void off() {
		System.out.println("노트북을 끈다");
	}
}

class DeskTop extends Computer {

	@Override
	public void on() {
		System.out.println("데스크탑을 킨다");
	}

	@Override
	public void off() {
		System.out.println("데스크탑을 끈다");
	
	}
	
}