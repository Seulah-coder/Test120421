package day14;

import java.util.List;
import java.util.Scanner;

// Service클래스 : 처리를 담당하는 클래스(비즈니스 클래스)
public class BankService {
	Scanner scan = new Scanner(System.in);
	//입금 처리를 위한 메소드 선언
	/*
	 * 메소드이름 : deposit
	 * 매개변수 : clientList (customerlist)
	 * 리턴 :  clientList(customerlist)
	 * (Main Class가 가장 최신의 데이터를 가져야 하기 때문에)
	 */
	
	List<BankDTO> deposit(List<BankDTO> customerlist){
		
		//List<BankDTO> -> 리턴하고자 하는 데이터의 타입
		//매개변수는 타입과 변수이름 = (List<BankDTO> customerlist)
		System.out.println("계좌번호: ");
		String accountNum = scan.next();
		System.out.println("입금액: ");
		int deposit = scan.nextInt();
		
		for (int i = 0; i <customerlist.size(); i++) {
			
		
			if (accountNum.equals(customerlist.get(i).getAccountNumber())) {
		
				int balance = customerlist.get(i).getBalance() + deposit; 
				customerlist.get(i).setBalance(balance);
				// customerlist.get(i).setBalance(customerlist.get(i).getBalance() + deposit); 도 가능함 위 두줄을 한줄로 줄인것
				System.out.println("잔액: "+ balance);
				
			} else {
				System.out.println("없는 계좌 입니다.");
				
			}
		
		}
		return customerlist;
				
	}
	//출금처리를 위한 메소드 선언
	/*
	 * 메소드이름: withdraw
	 * 매개변수 : clientList
	 * 리턴 : clientList
	 */
	List<BankDTO> withdraw(List<BankDTO> customerlist){
		System.out.println("계좌번호: ");
		String accountNum = scan.next();
		System.out.println("출금액: ");
		int withdraw = scan.nextInt();
		
		for (int i = 0; i <customerlist.size(); i++) {
			
			if (accountNum.equals(customerlist.get(i).getAccountNumber())) {
		
								
				if(withdraw < customerlist.get(i).getBalance()) {
				int balance = customerlist.get(i).getBalance() - withdraw;
				customerlist.get(i).setBalance(balance);
				// customerlist.get(i).setBalance(customerlist.get(i).getBalance() - withdraw);
				System.out.println("잔액 : "+ balance);
				} else {
					
				System.out.println("잔고가 부족합니다.");
				}
				
			
			} else {
			System.out.println("없는 계좌 입니다.");
			
			}
		} 				
		
		
		return customerlist;
		
	}
	
		
	}


