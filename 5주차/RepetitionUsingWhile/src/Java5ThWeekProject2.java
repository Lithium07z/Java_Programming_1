/*
 * ���α׷� �ۼ�����: 2019.03.26
 * ���α׷� ����:�Է��� ������ ũ�⸸ŭ 0���� ���ڸ� �����ϴ� ���α׷��� while������ �ۼ���
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.26 PM 05:31
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 
public class Java5ThWeekProject2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int inputNumber; // �Է¹��� ���ڸ� �����ϱ� ���� ���� 
		int plusFunction = 0; // �Է¹��� ���ڿ� ���� �ݺ����� Ƚ���� ������ ����
                              // 0���� �����ؾ��ϱ� ������ 0�� �����Ѵ�.
		
		System.out.println("ũ���Է� : "); // ���ڸ� �Է¹ޱ� ���� ��� 
		inputNumber = input.nextInt();
		
		while (inputNumber > plusFunction) { 
			System.out.print("["+plusFunction+"]");
			plusFunction++;
			// �Է¹��� ũ��� ���������� plusFunction�� 1�� ���ϰ� 
			// ���� �������� �ݺ����� Ż���Ѵ�. 
		}
		
	}

}
