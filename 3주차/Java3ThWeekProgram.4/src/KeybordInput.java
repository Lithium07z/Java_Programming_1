/*
 * ���α׷� �ۼ�����: 2019.03.14
 * ���α׷� ����: �ڹ� ���α׷���1 ���� 3���� �ǽ� ���α׷�, �������� 9��° ���α׷�
 * ���α׷� ���� ��������: 2019.03.14
 * �ۼ���: ����ȣ
 */
import java.util.Scanner;
public class KeybordInput {
	public static void main(String[] args) {
		int intValue;
		Scanner input = new Scanner(System.in);
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		intValue = input.nextInt();
		System.out.println("�Է��Ͻ� ��ȣ�� " + intValue + "�Դϴ�.");
	}
}