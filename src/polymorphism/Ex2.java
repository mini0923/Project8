package polymorphism;

public class Ex2 {

	public static void main(String[] args) {

		Customer customer1 = new Customer("둘리");
		customer1.calcPrice(10000);
		customer1.showInfo();
		
		Customer customer2 = new VIPCustomer("둘리");
		customer2.calcPrice(10000);
		customer2.showInfo();
		
		// 다형성을 활용하면 부모클래스 하나로 여러개의 자식 클래스를 사용할 수 있다.
		
	}

}
class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio; // 적립률 (0.01 => 1%)
		// 고정값은 생성자에서 초기화
		public Customer(String customerName) {
			super();
			this.customerName = customerName;
			customerGrade = "SILVER";
			bonusRatio = 0.01;
			
//			System.out.println("Customer() 생성자 호출");
		}
	
		// 보너스 포인트 적립하고, 지불 가격을 계산하는 메소드
		public void calcPrice(int price) {
			bonusPoint = bonusPoint + (price * bonusRatio);
			System.out.println(customerName+"님이 " + price + "원을 결제했습니다."); // 정가를 그대로 지불함
		}
	
		public void showInfo() {
			System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
		}

}


//골드회원 생성
class GoldCustomer extends Customer {
	double saleRatio;

	// 고정값은 생성자에서 초기화
	public GoldCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + " 님이 " + salePrice + " 원을 결재했습니다. ");
	}
	
	
}



class VIPCustomer extends Customer {
		double saleRatio;			// 할인률
		
		// 고정값은 생성자에서 초기화
		public VIPCustomer (String customerName) {
			super(customerName);			
			customerGrade = "VIP";
			bonusRatio = 0.05; // 적립률 5%
			saleRatio = 0.1; // 할인률 10%
			
//			System.out.println("VIPCustomer() 생성자 호출");
		}

		// 재정의 규칙 : 선언부 그대로, 구현부만 변경
		@Override
		public void calcPrice(int price) {
			bonusPoint = bonusPoint + (price * bonusRatio);
			int salePrice = price - (int) (price * saleRatio);
			System.out.println(customerName + " 님이 " + salePrice + " 원을 결재했습니다. ");
			
		}

}


