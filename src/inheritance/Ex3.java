package inheritance;

public class Ex3 {

	public static void main(String[] args) {

		// 일반 회원 생성
		Customer customer  = new Customer();
		customer.customerName = "둘리";
		customer.calcPrice(10000);
		customer.showInfo();
		
		// vip 회원 생성
		VIPCustomer vip = new VIPCustomer();
		vip.customerName = "또치";
		vip.calcPrice(10000);
		vip.showInfo();
		
	}

}

// 일반 회원 클래스
class Customer {
		String customerName;		// 회원 이름
		String customerGrade ;		// 회원 등급
		double bonusPoint;			// 보너스 포인트
		double bonusRatio;			// 적립률 (0.01 => 1%)
		
		//  고정값은 생성자에서 초기화
		public Customer () {
			customerGrade = "SILVER";
			bonusRatio = 0.01;
		}
		
		// 보너스 포인트 적립하고, 지불 가격을 계산하는 메소드
		public void calcPrice(int price) {
			bonusPoint = bonusPoint + (price * bonusRatio); // 보너스 포인트 추가
			System.out.println(customerName + " 님이 " + price + " 원을 결재하였습니다.");
		}
		
		public void showInfo() {
			System.out.println(customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + " 입니다. ");
		}
		
}

class VIPCustomer extends Customer {
		double saleRatio;			// 할인률
		
		public VIPCustomer () {
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
		}
}