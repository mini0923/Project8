package inheritance;

public class Ex1 {

	public static void main(String[] args) {

		Child child = new Child();
		child.nationality = "한국";		// 부모클래스에서 물려받은 속성
		child.lastName = "고";				// 부모클래스에서 물려받은 속성
		child.firstName = "길동";

	}

}
class Parents {
		String nationality; // 국적
		String lastName; // 성
}


class Child extends Parents {
		String firstName; // 이름
}
