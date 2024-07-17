package downcasting;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<Animal>();
		
		Human human = new Human();
		list.add(human);
		list.add(new Tiger());
		list.add(new Eagle());
		
		for (Animal ani : list) {
			if(ani instanceof Human) {
				Human h = (Human) ani;
				h.readBook();
			}	else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			}	else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			}
		}
		
	}

}

