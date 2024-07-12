package inheritance.quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		Monster monster = new Monster();	// 몬스터 생성
		monster.power = 10;	
		monster.hp = 100;
		monster.showinfo();
		monster.attack();
		System.out.println();
		
		Slime slime = new Slime();	// 슬라임 생성
		slime.power = 30;	// 부모 클래스에서 상속받은 속성
		slime.hp = 200;	// 부모 클래스에서 상속받은 속성
		slime.showinfo();	// 부모 클래스에서 상속받은 속성
		slime.attack();	// 부모 클래스에서 상속받은 속성
		slime.skillCast();
		

	}

}

class Monster {
	int power ;
	int hp;
	
	public void attack () {
		System.out.println("몬스터가 " + power + " 만큼 공격했다! ");
	}
	
	public void showinfo() {
		System.out.println("몬스터의 공격력은 " + power + " 체력은 " + hp + " 이다.");
	}
	
}

class Slime extends Monster{
	String skill;
	
	public Slime () {
		skill = "마비";
	}

	public void skillCast () {
		System.out.println("슬라임이 " + skill + " 을 시전했다!");
	}
	
}






