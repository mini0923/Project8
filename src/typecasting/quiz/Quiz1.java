package typecasting.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		Parent pc = new Child("한국", '고', "길동");
		
		
		Child child = new Child("한국", '고', "길동");
		child.showInfo();
		
	}

}

class Parent {
	// 국적, 성
	String nation ;
	char lastName;
	
	public Parent(String nation, char lastName) {
		super();
		this.nation = nation;
		this.lastName = lastName;
	}

	
}

class Child extends Parent {
	// 이름
	String firstName ;

	public Child(String nation, char lastName, String firstName) {
		super(nation, lastName);
		this.firstName = firstName;
	}
	
	public void showInfo() {
		System.out.println("국적 : " + nation);
		System.out.println("성 : " + lastName);
		System.out.println("이름 : " + firstName);
	}

}