/**
 * 프로그램 작성일자: 2019.05.08
 * 프로그램 설명: 은행 계좌정보를 메서드에 저장하고 예금, 출금을 반복하는 프로그램 
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.05.09 AM 11:40
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 
public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account1 ac1 = new Account1(); // Account1 클래스를 ac1의 이름으로 사용 
		Account1 ac2 = new Account1(); // Account1 클래스를 ac2의 이름으로 사용 
		int ipMoney; // 첫 번째 계좌에 예금할 금액을 위한 변수 
		int opMoney; // 첫 번째 계좌에서 출금할 금액을 위한 변수 
		int ipMoney2; // 두 번째 계좌에 예금할 금액을 위한 변수 
		int opMoney2; // 두 번째 계좌에서 출금할 금액을 위한 변수 
		
		for(int lp = 0; lp < 100; lp++) { // 예금과 출금과정을 100번 반복 
			ac1.setAccountNo("1002-111-111111 "); // 첫 번째 계좌의 계좌번호 
			ac1.setOwner("김준호 "); // 첫 번째 계좌의 예금주 
			ac2.setAccountNo("352-1111-1111-11 "); // 두 번째 계좌의 계좌번호 
			ac2.setOwner("김준호 "); // 두 번째 계좌의 예금주 
			System.out.println("종료하시려면 -7을 입력하세요\n"); // 반복을 종료하는 방법을 출력
			System.out.println(ac1.toString()); // ac1의 toString 메서드를 출력
			System.out.println(ac2.toString()); // ac2의 toString 메서드를 출력
			System.out.println("첫 번째 계좌에 예금할 금액을 입력하세요 : ");  
			ipMoney = input.nextInt(); // 첫 번째 계좌에 예금할 금액을 입력받음
			if(ipMoney == -7) { // 입력받은 금액이 -7이면 
				System.out.println("종료되었습니다."); // 프로그램이 종료됨을 출력 
				break; // 반복문을 종료함 
			}
			System.out.println("두 번째 계좌에 예금할 금액을 입력하세요 : ");
			ipMoney2 = input.nextInt(); // 두 번째 계좌에 예금할 금액을 입력받음
			System.out.println("첫 번째 계좌에서 출금할 금액을 입력하세요 : ");
			opMoney = input.nextInt(); // 첫 번째 계좌에서 출금할 금액을 입력받음 
			System.out.println("두 번째 계좌에서 출금할 금액을 입력하세요 : ");
			opMoney2 = input.nextInt(); // 두 번째 계좌에서 출금할 금액을 입력받음 
			ac1.deposit(ipMoney); // ac1의 deposit 메서드에 ipMoney 값을 전달 
			ac1.withdraw(opMoney); // ac1의 withdraw 메서드에 opMoney 값을 전달 
			ac2.deposit(ipMoney2); // ac2의 deposit 메서드에 ipMoney 값을 전달
			ac2.withdraw(opMoney2); // ac2의 withdraw 메서드에 opMoney 값을 전달 
		}
	}
}

class Account1 { // 계좌 정보를 저장하는 클래스 
	private String accountNo; // 메서드를 통해서만 계좌번호를 받는 변수 
	private String owner; // 메서드를 통해서만 계좌 소유주를 받는 변수 
	private int balance; // 메서드를 통해서만 계좌 잔액을 받는 변수 
	
	public String getAccountNo() { // 계좌번호를 리턴하는 메서드 
		return accountNo; // 계좌번호를 리턴함 
	}
	public void setAccountNo(String AccountNo) { // 계좌번호를 받아 저장하는 메서드
		this.accountNo = AccountNo; // 받은 계좌번호를 Account1 클래스의 accountNo에 저장함 
	}
	public String getOwner() { // 계좌 소유주를 리턴하는 메서드 
		return owner; // 계좌 소유주를 리턴함
	}
	public void setOwner(String Owner) { // 계좌 소유주를 받아 저장하는 메서드
		this.owner = Owner; // 받은 계좌 소유주를 Account1 클래스의 accountNo에 저장함 
	}
	public int getBalance() { // 계좌 잔액을 리턴하는 메서드
		return balance; // 계좌 잔액을 리턴함 
	}
	public void setBalance(int balance) { // 계좌 잔액을 받아 저장하는 메서드
		this.balance = balance; // 받은 계좌 잔액을 Account1 클래스의 accountNo에 저장함
	}
	public String toString() { // Account1의 정보를 리턴하는 메서드
		return "계좌 정보\n예금주 : " + owner + "계좌번호 : " + accountNo + "금액 : " + balance;
		// Account1의 정보를 리턴함
	}
	public void deposit(int balance) { // 입금 받은 금액을 잔액에 누적하는 메서드
		if(balance < 0) { // 
			System.out.println("마이너스 금액은 입금하실 수 없습니다.\n");
		} else {
			this.balance += balance; // 입금받은 금액을 기존 잔액에 누적함 
			System.out.println("입금 후 잔액은" + this.balance + "입니다.\n"); // 입금 후 잔액을 출력함
		}
	}
	public void withdraw(int balance) { // 출금하려는 금액을 잔액에서 빼는 메서드
		if(balance > this.balance) { // 기존 잔액보다 많은 금액을 출금하려하면
			System.out.println("계좌 잔액보다 많은 금액은 출금하실 수 없습니다.\n"); // 출금을 정지함
		} else if (balance < 0) { // 마이너스 금액을 출금하려하면 
			System.out.println("마이너스 금액은 출금하실 수 없습니다.\n"); // 출금을 정지함
		} else if (balance <= this.balance) { // 출금 금액이 기존 잔액과 같거나 그보다 적으면
			this.balance -= balance; // 기존잔액에서 출금함
			System.out.println("출금 후 잔액은" + this.balance + "입니다.\n");
			// 출금 후 잔액을 출력함 
		}
	}
}