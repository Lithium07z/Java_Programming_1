/*
 * ���α׷� �ۼ�����: 2019.03.27  
 * ���α׷� ����: �Ǻ���ġ������ ����ϱ����� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.27 PM 10:17
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 
public class Java5ThWeekProject12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lastTerm; // �Ǻ���ġ������ ������ ���� �����ϴ� ���� 
		int sequence = 0; // �Ǻ���ġ������ ù ��° ��
		int helpReturn = 1; // �Ǻ���ġ������ �� ��° ��
		int result; // �� ���� ���� ����
		int total = 0; // ������ �� �հ踦 �����ϴ� ���� 
		
		System.out.println("�Ǻ���ġ������ ������ ���� �Է��Ͻÿ� : ");
		lastTerm = input.nextInt();
		// �Ǻ���ġ������ ������ ���� �Է¹��� 
		
		for(; lastTerm >= 1; lastTerm--) {
			// �Ǻ���ġ ������ �� ��ŭ �ݺ��ؼ� ����� 
			if (lastTerm == 1) { // ������ ��¶��� ,�� �����ϰ� ���� ����� 
				System.out.print(sequence);
			} else { // ������ ����� �ƴ� ��쿡�� ,�� �Բ� ����� 
				System.out.print(sequence+" , ");
			}
			result = sequence + helpReturn; // ���� ���� ���� result�� ������ 
			sequence = helpReturn; // �� ���� ���ϱ� ���� ���� ���� ���� ����ؾ� �ϹǷ� sequence�� ����
			helpReturn = result; // ������ �����Ű�� ���� ���� ���� ���� ������ 
			total = result; // ������ �� �հ踦 �����
			
		}
		
		System.out.println("\n���� �հ� : "+total);
		// ������ �� �հ踦 ����� 
	}

}
