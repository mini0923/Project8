package downcasting;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Student("둘리"));
		list.add(new Employee("또치"));
		
		for (Person per : list) {
			per.eat();
			
			if(per instanceof Student) {
				Student s = (Student) per;
				s.study();
			}else if (per instanceof Employee) {
				Employee e = (Employee) per;
				e.work();
			}
					
		}
		
	}

}
class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void eat () {
		System.out.println(name +"가 밥을 먹는다.");
	}
}

class Student extends Person {

	public Student(String name) {
		super(name);
	}

	public void study() {
		System.out.println(name + " 학생이 공부를 한다.");
	}
}

class Employee extends Person {

	public Employee(String name) {
		super(name);
	}
	
	public void work() {
		System.out.println(name + " 회사원이 일을 한다");
	}
}