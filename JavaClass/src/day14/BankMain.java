package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<BankDTO> customerlist = new ArrayList<BankDTO>();
		// Bank클래스 타입: 고객번호, 이름, 계좌번호, 잔고를 모두 담고있는 타입.
		
		//bank service객체 선언
		BankService bs = new BankService();
		
		
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("  1. 고객등록(get,set) | 2. 고객등록(생성자) | 3. 입금 | 4. 출금 | 5. 고객리스트 | 6. 종료");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.print("선택>");
			int select = scan.nextInt();
			
			
			int deposit = 0;
			int withdraw = 0;
			int balance = 0;
			
			switch(select) {
			case 1 :
				// 고객등록(get,set)
				
					BankDTO customer = new BankDTO();
					int clientNumber = customerlist.size()+1;
					System.out.println("이름: ");
					String name = scan.next();
		
					System.out.println("계좌번호: ");
					String accountNum = scan.next();
			
					System.out.println("입금액: ");
					balance = scan.nextInt();
				
					// 입력받은 값을 BankDTO 객체 필드값으로 저장
					customer.setClientNumber(clientNumber);
					customer.setName(name);
					customer.setAccountNumber(accountNum);
					customer.setBalance(balance);
					// 한세트가 다 만들어지면(필드값 세팅이 끝나면) ArrayList에 저장
					
					customerlist.add(customer);
			
		
				break;
				
			case 2:
				// 고객등록(생성자)
				
					clientNumber = customerlist.size()+1;
				
					System.out.println("이름: ");
					name = scan.next();
		
					System.out.println("계좌번호: ");
					accountNum = scan.next();
			
					System.out.println("입금액: ");
					balance = scan.nextInt();
					customer = new BankDTO(clientNumber, name, accountNum, balance);
					//이미 위에서 선언했기 때문에 추가로 BankDTO를 앞에 붙일필요 없음
						
					customerlist.add(customer);
					
					
				
				break;
				
			case 3: 
				// 입금
//				System.out.println("계좌번호: ");
//				accountNum = scan.next();
//				System.out.println("입금액: ");
//				deposit = scan.nextInt();
//				
//				for (int i = 0; i <customerlist.size(); i++) {
//					
//				
//					if (accountNum.equals(customerlist.get(i).getAccountNumber())) {
//				
//						balance = customerlist.get(i).getBalance() + deposit; 
//						customerlist.get(i).setBalance(balance);
//						// customerlist.get(i).setBalance(customerlist.get(i).getBalance() + deposit); 도 가능함 위 두줄을 한줄로 줄인것
//						System.out.println("잔액: "+ balance);
//						
//					} else {
//						System.out.println("없는 계좌 입니다.");
//						
//					}
//				
//				}
				/* BankService 클래스에 있는 입금용 메소드를 호출 */
				customerlist = bs.deposit(customerlist);
				/* 리턴이있는 method의 경우 return값을 받아주는 좌변이 필요하다*/
				
			
				break;
				
				
			case 4: 
				// 출금
//				System.out.println("계좌번호: ");
//				accountNum = scan.next();
//				System.out.println("출금액: ");
//				withdraw = scan.nextInt();
//				
//				for (int i = 0; i <customerlist.size(); i++) {
//					
//					if (accountNum.equals(customerlist.get(i).getAccountNumber())) {
//				
//										
//						if(withdraw < customerlist.get(i).getBalance()) {
//						balance = customerlist.get(i).getBalance() - withdraw;
//						customerlist.get(i).setBalance(balance);
//						// customerlist.get(i).setBalance(customerlist.get(i).getBalance() - withdraw);
//						System.out.println("잔액 : "+ balance);
//						} else {
//							
//						System.out.println("잔고가 부족합니다.");
//						}
//						
//					
//					} else {
//					System.out.println("없는 계좌 입니다.");
//					
//					}
//				} 				
				customerlist = bs.withdraw(customerlist);
				
				break;
				
			
			case 5: 
				// 고객리스트
				
				for (int i = 0; i <customerlist.size(); i++) {
					
					System.out.println(customerlist.get(i));
				
					
				} 
			
				
							
				break;
				
			case 6: 
				// 종료
				
				
				System.out.println("종료합니다");
				
				break;
				
			}
		} 
	
	}	
	}	

		


	


