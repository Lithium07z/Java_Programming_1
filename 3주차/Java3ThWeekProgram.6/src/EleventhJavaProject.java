/*
 * ���α׷� �ۼ�����: 2019.03.14
 * ���α׷� ����: �ڹ� ���α׷���1 ���� 3���� �ǽ� ���α׷�, �������� 11��° ���α׷�
 * ���α׷� ���� ��������: 2019.03.14
 * �ۼ���: ����ȣ
 */
import java.util.Scanner;
public class EleventhJavaProject {
	public static void main(String[] args) {
		int menuNumber;
		
		Scanner input = new Scanner(System.in);
		System.out.println("/*******�޴�*****/");
		System.out.println("[1] �Է�");
		System.out.println("[2] ���");
		System.out.println("[3] �ʱ�ȭ");
		System.out.println("[4] ����");
		System.out.println("�޴��� �����ϼ��� : ");
		menuNumber = input.nextInt();
		System.out.println(menuNumber + "�� �޴��� �����ϼ̽��ϴ�.");
	}

}
