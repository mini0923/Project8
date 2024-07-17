package override;


public class Ex1 {

	public static void main(String[] args) {

		// 일반 등급은 정가 그대로 지불
		Customer customer = new Customer("둘리");
		customer.calcPrice(10000);
		customer.showInfo();
		
		// VIP 등급은 10% 할인받아서 9000원 지불
		VIPCustomer vipCustomer = new VIPCustomer("또치");
		vipCustomer.calcPrice(10000);
		vipCustomer.showInfo();
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
			
			System.out.println("Customer() 생성자 호출");
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

class VIPCustomer extends Customer {
		double saleRatio;			// 할인률
		
		// 고정값은 생성자에서 초기화
		public VIPCustomer (String customerName) {
			super(customerName);			
			customerGrade = "VIP";
			bonusRatio = 0.05; // 적립률 5%
			saleRatio = 0.1; // 할인률 10%
			
			System.out.println("VIPCustomer() 생성자 호출");
		}

		// 재정의 규칙 : 선언부 그대로, 구현부만 변경
		@Override
		public void calcPrice(int price) {
			bonusPoint = bonusPoint + (price * bonusRatio);
			int salePrice = price - (int) (price * saleRatio);
			System.out.println(customerName + " 님이 " + salePrice + " 원을 결재했습니다. ");
			
		}

}