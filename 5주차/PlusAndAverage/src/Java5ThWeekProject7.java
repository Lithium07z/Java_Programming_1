/*
 * ���α׷� �ۼ�����: 2019.03.26 
 * ���α׷� ����: ����ڷκ��� 0�� �ƴ� ������ �Էµ� �� ������ �հ� ����� ����ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.26 PM 11:54
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� Scanner�� �ҷ���
public class Java5ThWeekProject7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double integer; // �Է¹��� ������ �����ϴ� ����
		double plus = 0.0; // ���� ���� �����ϴ�  ����
		double average; // ����� ���� �����ϴ� ���� 
		double loop = 1; // ������ Ƚ���� �����ϴ� ����
		
		do {
			System.out.println("�����Է� : "); // ������ �Է¹��� 
			integer = input.nextInt();
			
			if (integer == 0) { // ���� �Է¹��� ������ 0�̶�� ���Ḧ ����ϰ� do while ���� ��������
				System.out.println("����");
				
				break;
			}
			
			plus += integer; // ���� ���� ���׿����ڷ� ó���� 
			average = plus / loop; // ����� ���ϰ� average�Լ��� ������
			loop++;
			// ������ �ϸ� ������ 0�� �ƴ� ������ �Է¹ޱ� ������ 
			// ���� Ƚ���� ���� ������ ����� ����
			// 0�� �Է¹����� ����Ǳ� ������ ��¿��� ��������
			System.out.println("��:"+plus); // �� ��� 
			System.out.println("���: "+average); // ��� ���
			
		} while (integer != 0); // 0�� �ƴ϶�� while���� �ݺ���
		
	}

}
