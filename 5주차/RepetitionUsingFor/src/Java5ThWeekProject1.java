/*
 * ���α׷� �ۼ�����: 2019.03.26
 * ���α׷� ����: �Է��� ������ ũ�⸸ŭ 0���� ���ڸ� �����ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.26 PM 05:21
 */
import java.util.Scanner; // Ű����κ��� �Է��� �ޱ� ���� �ҷ���
public class Java5ThWeekProject1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNumber; // �Է¹��� ���ڸ� �����ϱ� ���� ���� 
		int plusFunction; // �Է¹��� ���ڿ� ���� �ݺ����� Ƚ���� ������ ���� 
		
		System.out.println("ũ���Է� : "); // ���ڸ� �Է¹ޱ� ���� ��� 
		inputNumber = input.nextInt(); 
		
		for (plusFunction = 0; inputNumber > plusFunction; plusFunction++) {
			// �ʱⰪ�� plusFunction�� 0���� �����ϰ� �Է¹��� ���ڿ� ������ �ݺ����� Ż����
			System.out.print("["+plusFunction+"]"); // �ݺ��ؼ� ������ ������ ����� 
			
		}
			
	
	}

}
