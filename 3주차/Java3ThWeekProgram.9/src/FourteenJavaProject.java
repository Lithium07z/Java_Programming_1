/*
 * ���α׷� �ۼ�����: 2019.03.14
 * ���α׷� ����: �ڹ� ���α׷���1 ���� 3���� �ǽ� ���α׷�, �������� 14��° ���α׷�
 * ���α׷� ���� ��������: 2019.03.14
 * �ۼ���: ����ȣ
 */
import java.util.Scanner;
public class FourteenJavaProject {
	public static void main(String[] args) {
		int Stem; // �����µ� ����
		int Htem; // �����µ� ����
		
		Scanner inputValue = new Scanner(System.in);
		System.out.println("�����µ��� �Է��ϼ��� : ");
		Stem = inputValue.nextInt();
		
		Htem = 32 + Stem * 180/100;
		System.out.println("ȭ���µ���"+Htem+"�Դϴ�.");
					
	}
}
