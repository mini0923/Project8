package inheritance.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.leg = 4; //부모클래스에서 물려받은 속성
		tiger.tail = 1;
		
		Eagle eagle = new Eagle();
		eagle.leg = 2; //부모클래스에서 물려받은 속성
		eagle.wing = 2;
	}

}
//동물클래스
class Animal {
	int leg; //다리
}
//호랑이클래스
class Tiger extends Animal {
	int tail; //꼬리
}
//독수리클래스
class Eagle extends Animal {
	int wing; //날개
}