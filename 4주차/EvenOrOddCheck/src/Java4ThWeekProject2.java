/*
 * ���α׷� �ۼ�����: 2019.03.19
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ����: ����ڷκ��� �Է¹��� ������ Ȧ�� ���� ¦�������� �Ǵ��ϴ� ���α׷�, 4���� �ǽ� �� ��° ����
 * ���α׷� ��������: 2019.03.19 PM 08:19
 * 
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ܰ�
public class Java4ThWeekProject2 {
	public static void main(String[] args) {
		int UnknownNumber; // �Է¹ް� �� ������ ������ ���� ����  
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ� : "); // ������ �Է¹���
		UnknownNumber = input.nextInt();
		if (UnknownNumber % 2 == 0) { // �Է¹��� ������ ¦���� ���
			System.out.println(UnknownNumber+"�� ¦���Դϴ�.");
		}
		else { // �Է¹��� ������ Ȧ���� ��� 
			System.out.println(UnknownNumber+"�� Ȧ���Դϴ�.");
		}
		
  
	}
	

}
