package polymorphism;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		//  회원 리스트 생성
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		// 일반회원, 골드회원, VIP회원 생성
		Customer customer1 = new Customer("둘리");	// 일반 회원생성
		Customer customer2 = new GoldCustomer("도우너");	// 골드회원 생성
		Customer customer3 = new VIPCustomer("또치");	// VIP회원 생성
		
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		
		for(Customer customer : list) {
			customer.calcPrice(10000);
			customer.showInfo();
		}
		

	}

}




