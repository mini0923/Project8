package inheritance.quiz;

public class Quiz3 {

	public static void main(String[] args) {

		BallPen ballPen = new BallPen();
		
		ballPen.penThickness = 2;
		ballPen.amount_left = "100%";
		ballPen.color = "파란색";
		ballPen.showInfo();
		
		System.out.println();
		
		FountainPen fountainPen = new FountainPen();
		
		fountainPen.penThickness = 3;
		fountainPen.amount_left = "80%";
		fountainPen.brand = "몽블랑";
		fountainPen.showInfo();
		
	}

}

class Pen {
		int penThickness ;		// 펜의 굵기
		String  amount_left; 	// 남은 양

}

class BallPen extends Pen {
		String color;		// 색상
		
		public void showInfo() {
			System.out.println("볼펜의 굵기는 : " + penThickness);
			System.out.println("남은 양 : " + amount_left);
			System.out.println("볼펜의 색상은 : " + color);
		}
		
	
}

class FountainPen extends Pen {
		String brand; 	// 브랜드
		
		public void showInfo() {
			System.out.println("볼펜의 굵기는 : " + penThickness);
			System.out.println("남은 양 : " + amount_left);
			System.out.println("브랜드는 : " + brand);
		}
		
}
