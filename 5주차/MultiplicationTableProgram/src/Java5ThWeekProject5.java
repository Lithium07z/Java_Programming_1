/*
 * ���α׷� �ۼ�����: 2019.03.26 
 * ���α׷� ����: Ű����κ��� 1���� 9 ������ ������ �Է¹޾� �ش� �������� ����ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.26 PM 06:16
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ���
public class Java5ThWeekProject5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int integer; // ����� �������� �ܼ��� �Է¹ް� �����ϱ� ���� ���� 
		int multiplication; // 1, 2, 3...9���� 1�� �ݺ��ؼ� ������ ���� ���� ���� 
		int result; // ����� ��� ���� ������ ���� 
		
		System.out.println("������ ���� �Է��ϼ���  : "); // ����� �������� �ܼ��� �Է¹���
		integer = input.nextInt();
		
		for (multiplication = 1; multiplication < 10; multiplication++ ) {
			// 1���� 9���� 1�� ���س����� ���س����� ���� 1�� �����ϰ� 10�� �������� �ݺ����� Ż��
			result = integer * multiplication;
			// ������ ����� result ������ ������
			System.out.println(integer+" * "+ multiplication+ " = " + result);
			// ������ ����� ����� 
		}
	}

}
