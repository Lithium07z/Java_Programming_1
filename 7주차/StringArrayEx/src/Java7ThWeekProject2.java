/**
 * ���α׷� ��������: 2019.04.08
 * ���α׷� ����: Ű����κ��� ���ڿ� 5���� �Է¹޾� ���ڿ� �迭�� �����ϰ� ����ϴ� ���α׷�
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.04.11 AM 11:00
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 
public class Java7ThWeekProject2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String [] keyBoard = new String [5]; // 5�� ũ�⸦ ������ ���ڿ� �迭�� ���� 
		int lp; // �ݺ����� �ݺ��� ���� ���� ���� 
		
		System.out.print("���ڿ��� �Է��ϼ��� : "); // ���ڿ��� �Է¹ޱ� ���� ��� 
		for (lp = 0; lp < 5; lp++) { // �ݺ����� 5�� �ݺ� 
			keyBoard[lp] = input.next(); 
			// �ݺ����� �۵��Ǵµ��� �Է� ���� ���ڿ��� keyBoard�迭 �� ���� 

		}
		for (String opStr : keyBoard) { 
			// keyBoard �迭�� ���� opStr �迭�� �ִ� ������ �ݺ� 
			System.out.print(opStr+" "); // opStr�� �Էµ� ���ڿ��� ��� 
		}
	}
}
