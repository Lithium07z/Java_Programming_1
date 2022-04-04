/**
 * ���α׷� �ۼ�����: 2019.05.08
 * ���α׷� ����: ���� ���������� �޼��忡 �����ϰ� ����, ����� �ݺ��ϴ� ���α׷� 
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.05.09 AM 11:40
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 
public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account1 ac1 = new Account1(); // Account1 Ŭ������ ac1�� �̸����� ��� 
		Account1 ac2 = new Account1(); // Account1 Ŭ������ ac2�� �̸����� ��� 
		int ipMoney; // ù ��° ���¿� ������ �ݾ��� ���� ���� 
		int opMoney; // ù ��° ���¿��� ����� �ݾ��� ���� ���� 
		int ipMoney2; // �� ��° ���¿� ������ �ݾ��� ���� ���� 
		int opMoney2; // �� ��° ���¿��� ����� �ݾ��� ���� ���� 
		
		for(int lp = 0; lp < 100; lp++) { // ���ݰ� ��ݰ����� 100�� �ݺ� 
			ac1.setAccountNo("1002-111-111111 "); // ù ��° ������ ���¹�ȣ 
			ac1.setOwner("����ȣ "); // ù ��° ������ ������ 
			ac2.setAccountNo("352-1111-1111-11 "); // �� ��° ������ ���¹�ȣ 
			ac2.setOwner("����ȣ "); // �� ��° ������ ������ 
			System.out.println("�����Ͻ÷��� -7�� �Է��ϼ���\n"); // �ݺ��� �����ϴ� ����� ���
			System.out.println(ac1.toString()); // ac1�� toString �޼��带 ���
			System.out.println(ac2.toString()); // ac2�� toString �޼��带 ���
			System.out.println("ù ��° ���¿� ������ �ݾ��� �Է��ϼ��� : ");  
			ipMoney = input.nextInt(); // ù ��° ���¿� ������ �ݾ��� �Է¹���
			if(ipMoney == -7) { // �Է¹��� �ݾ��� -7�̸� 
				System.out.println("����Ǿ����ϴ�."); // ���α׷��� ������� ��� 
				break; // �ݺ����� ������ 
			}
			System.out.println("�� ��° ���¿� ������ �ݾ��� �Է��ϼ��� : ");
			ipMoney2 = input.nextInt(); // �� ��° ���¿� ������ �ݾ��� �Է¹���
			System.out.println("ù ��° ���¿��� ����� �ݾ��� �Է��ϼ��� : ");
			opMoney = input.nextInt(); // ù ��° ���¿��� ����� �ݾ��� �Է¹��� 
			System.out.println("�� ��° ���¿��� ����� �ݾ��� �Է��ϼ��� : ");
			opMoney2 = input.nextInt(); // �� ��° ���¿��� ����� �ݾ��� �Է¹��� 
			ac1.deposit(ipMoney); // ac1�� deposit �޼��忡 ipMoney ���� ���� 
			ac1.withdraw(opMoney); // ac1�� withdraw �޼��忡 opMoney ���� ���� 
			ac2.deposit(ipMoney2); // ac2�� deposit �޼��忡 ipMoney ���� ����
			ac2.withdraw(opMoney2); // ac2�� withdraw �޼��忡 opMoney ���� ���� 
		}
	}
}

class Account1 { // ���� ������ �����ϴ� Ŭ���� 
	private String accountNo; // �޼��带 ���ؼ��� ���¹�ȣ�� �޴� ���� 
	private String owner; // �޼��带 ���ؼ��� ���� �����ָ� �޴� ���� 
	private int balance; // �޼��带 ���ؼ��� ���� �ܾ��� �޴� ���� 
	
	public String getAccountNo() { // ���¹�ȣ�� �����ϴ� �޼��� 
		return accountNo; // ���¹�ȣ�� ������ 
	}
	public void setAccountNo(String AccountNo) { // ���¹�ȣ�� �޾� �����ϴ� �޼���
		this.accountNo = AccountNo; // ���� ���¹�ȣ�� Account1 Ŭ������ accountNo�� ������ 
	}
	public String getOwner() { // ���� �����ָ� �����ϴ� �޼��� 
		return owner; // ���� �����ָ� ������
	}
	public void setOwner(String Owner) { // ���� �����ָ� �޾� �����ϴ� �޼���
		this.owner = Owner; // ���� ���� �����ָ� Account1 Ŭ������ accountNo�� ������ 
	}
	public int getBalance() { // ���� �ܾ��� �����ϴ� �޼���
		return balance; // ���� �ܾ��� ������ 
	}
	public void setBalance(int balance) { // ���� �ܾ��� �޾� �����ϴ� �޼���
		this.balance = balance; // ���� ���� �ܾ��� Account1 Ŭ������ accountNo�� ������
	}
	public String toString() { // Account1�� ������ �����ϴ� �޼���
		return "���� ����\n������ : " + owner + "���¹�ȣ : " + accountNo + "�ݾ� : " + balance;
		// Account1�� ������ ������
	}
	public void deposit(int balance) { // �Ա� ���� �ݾ��� �ܾ׿� �����ϴ� �޼���
		if(balance < 0) { // 
			System.out.println("���̳ʽ� �ݾ��� �Ա��Ͻ� �� �����ϴ�.\n");
		} else {
			this.balance += balance; // �Աݹ��� �ݾ��� ���� �ܾ׿� ������ 
			System.out.println("�Ա� �� �ܾ���" + this.balance + "�Դϴ�.\n"); // �Ա� �� �ܾ��� �����
		}
	}
	public void withdraw(int balance) { // ����Ϸ��� �ݾ��� �ܾ׿��� ���� �޼���
		if(balance > this.balance) { // ���� �ܾ׺��� ���� �ݾ��� ����Ϸ��ϸ�
			System.out.println("���� �ܾ׺��� ���� �ݾ��� ����Ͻ� �� �����ϴ�.\n"); // ����� ������
		} else if (balance < 0) { // ���̳ʽ� �ݾ��� ����Ϸ��ϸ� 
			System.out.println("���̳ʽ� �ݾ��� ����Ͻ� �� �����ϴ�.\n"); // ����� ������
		} else if (balance <= this.balance) { // ��� �ݾ��� ���� �ܾװ� ���ų� �׺��� ������
			this.balance -= balance; // �����ܾ׿��� �����
			System.out.println("��� �� �ܾ���" + this.balance + "�Դϴ�.\n");
			// ��� �� �ܾ��� ����� 
		}
	}
}