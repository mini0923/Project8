package inheritance;

public class Ex2 {

	public static void main(String[] args) {
			
		Student student = new Student();
		
		student.eat();
		student.sound();
		student.study();
		
		Professor professor = new Professor();
		professor.eat();
		professor.sound();
		professor.work();
		
		
		
	}

}

class Person {
		public void sound() {
			System.out.println("대화를 한다.");
		}
		
		public void eat() {
			System.out.println("밥을 먹는다.");
		}
}

// 학생 클래스
class Student  extends Person {
		public void study() {
			System.out.println("공부를 한다.");
		}
}

// 교수 클래스
class Professor extends Student {
		public void work () {
			System.out.println("일을 한다."); 
		}
}

