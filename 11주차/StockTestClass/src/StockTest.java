/**
 * ���α׷� �ۼ�����: 2019.05.09
 * ���α׷� ����: �� ��ǰ�� ������� �����ϰ� �� �� �� ���� ��ǰ�� ����� ��, ����� ��ǰ�� ��� ������ ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.05.09 PM 06:51
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 
public class StockTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choose; // ����� ��ǰ�� ���� ���� ���� 
		Stock stk1 = new Stock(); // stock Ŭ������ stk1�� �̸����� ���
		Stock stk2 = new Stock(); // stock Ŭ������ stk2�� �̸����� ��� 
		
		System.out.println("��ǰ�� �Է��ϼ��� : "); // ù ��° ��ǰ�� �Է¹��� 
		stk1.setProduct(input.next());
		System.out.println("��� �Է��ϼ��� : "); // ù ��° ��ǰ�� �������� �Է¹���
		stk1.setStock(input.nextInt());
		System.out.println("��ǰ�� �Է��ϼ��� : "); // �� ��° ��ǰ�� �Է¹���
		stk2.setProduct(input.next());
		System.out.println("��� �Է��ϼ��� : "); // �� ��° ��ǰ�� �������� �Է¹���
		stk2.setStock(input.nextInt());
		stk1.getStockNumber(); // stk1�� getStockNumber�� �����
		stk2.getStockNumber(); // stk2�� getStockNumber�� �����
		
		if(stk1.getStockNumber() > stk2.getStockNumber()) { // stk1�� ��� stk2���� ���ٸ�
			System.out.println(stk1.toString()); // stk1�� ��ǰ, ��� ������ ���
		} else if (stk1.getStockNumber() < stk2.getStockNumber()) { 
			// stk2�� ��� stk1���� ���ٸ�
			System.out.println(stk2.toString()); // stk2�� ��ǰ, ��� ������ ���
		} else {
			System.out.println("�� ��ǰ�� ��� " + stk1.getStockNumber() + "(��)�� �����մϴ�.");
			// �� ��ǰ�� ��� �����ϸ� �� ��ǰ�� ��� �������� ��� 
		}
		
		
		System.out.println("����� ��ǰ�� �����ϼ���\n1�� \n2��\n�Է� :" ); // ����� ��ǰ�� �Է¹���
		choose = input.nextInt();
		if (choose == 1) { // 1���� �ԷµǸ� 
			System.out.println("����� ������ �Է��ϼ��� : "); // stk1 ��ǰ�� ����� �Է¹��� 
			stk1.releaseStock(input.nextInt());
			System.out.println("���� ��� : " + stk1.getStockNumber()); // ���� ����� �����
		} else if (choose == 2) { // 2���� �ԷµǸ�
			System.out.println("����� ������ �Է��ϼ��� : ");  // stk2 ��ǰ�� ����� �Է¹��� 
			stk2.releaseStock(input.nextInt());
			System.out.println("���� ��� : " + stk2.getStockNumber()); // ���� ����� ����� 
		} else {
			System.out.println("������ �� ���� ��ǰ�Դϴ�."); // �̿��� ��ȣ�� �ԷµǸ� ������ �� ������ ���
		}
	}
}

class Stock { // ��ǰ ������ �����ϴ� Ŭ���� 
	private String product; // �޼��带 ���ؼ��� ��ǰ�� �Է¹޴� ����
	private int stock; // �޼��带 ���ؼ��� ����� �Է¹޴� ���� 
	
	public void setProduct(String product) { // �Է¹��� ��ǰ�� StockŬ������ �����ϴ� �޼���
		this.product = product; // �Է¹��� ��ǰ�� Stock Ŭ������ product�� ������
	}
	public void setStock(int stock) { // �Է¹��� ��� StockŬ������ �����ϴ� �޼��� 
		this.stock = stock; // �Է¹��� ��� StockŬ������ stock�� ������ 
	}
	public int getStockNumber() { // ���� ����� �����ϴ� �޼���
		return stock; // ����� ������
	}
	public String toString() { // ��ǰ ������ �����ϴ� �޼���
		return "���� : " + this.product + "\n��� : " + stock; // ��ǰ, ��� ����
	}
	public void releaseStock(int stock) { // ��� ����ϴ� �޼���
		if(this.stock < stock) { // �Է¹��� ����� ����� ���� ��� 
			System.out.println("����� ���� ���� ����� �� �����ϴ�."); // ��� �Ұ������� �����
		} else { // �Է¹��� ����� ���� ���ų� �׺��� ���� ���
			this.stock -= stock; // ���� ����� ����� ��
		}
	}
}