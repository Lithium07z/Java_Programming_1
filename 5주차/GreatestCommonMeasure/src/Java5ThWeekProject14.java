/*
 * ���α׷� �ۼ�����: 2019.03.28 
 * ���α׷� ����: ����ڷκ��� �� ���� �Է¹޾� �ִ� ������� ���ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.28 AM 11:38
 */
import java.util.Scanner; // Ű����κ��� ���� �Է¹ޱ� ���� �ҷ��� 
public class Java5ThWeekProject14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstNumber; // ù ��° ���� �Է¹޾� �����ϴ� ���� 
		int secondNumber; // �� ��° ���� �Է¹޾� �����ϴ� ���� 
		int helpBox; // �� ���� ����� ����鼭 ���� �����ϴ� ���� 
		
		System.out.println("ù ��° ���� �Է��Ͻʽÿ� : ");
		firstNumber = input.nextInt(); // ù ��° ���� �Է¹��� 
		System.out.println("�� ��° ���� �Է��Ͻʽÿ� : ");
		secondNumber = input.nextInt(); // �� ��° ���� �Է¹��� 
		
		if ( firstNumber > secondNumber ) {
			// �Է¹��� �� �� �߿��� ù ��° ���� �� ū ����� �ݺ� 
			while (secondNumber != 0) {
				// secondNumber�� ���� 0�� �ɶ����� �ݺ�
				helpBox = firstNumber % secondNumber; 
				// �Է¹��� �� �� �߿��� ���� ������ ū ���� ������ helpBox�� ����
				firstNumber = secondNumber;
				// 0�� �� ������ ������ �ٸ� ������� ���ؾ� �ϹǷ�  ���� ��� �߿��� ���� ���� ������ 
				secondNumber = helpBox;
				// �������� �ٽ� ������ ������� ���ؾ� �ϹǷ� secondNumber�� ������ 
				
			}
			System.out.println("�ִ� ������� "+firstNumber+" �Դϴ�.");
		} else { // �Է¹��� ��  �� �߿��� �� ��° ���� �� ū ����� �ݺ� 
			while (firstNumber != 0) { 
				// firstNumber�� ���� 0�� �ɶ����� �ݺ�
				helpBox = secondNumber % firstNumber;
				// �Է¹��� �� �� �߿��� ���� ������ ū ���� ������ helpBox�� ����
				secondNumber = firstNumber;
				// 0�� �� ������ ������ �ٸ� ������� ���ؾ� �ϹǷ�  ���� ��� �߿��� ���� ���� ������ 
				firstNumber = helpBox;
				// �������� �ٽ� ������ ������� ���ؾ� �ϹǷ� firstNumber�� ������
			}
			System.out.println("�ִ� ������� "+secondNumber+" �Դϴ�.");
			// �ִ� ����� ��� 
		}
	
	}

}
