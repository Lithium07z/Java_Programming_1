
/*
 * ���α׷� �ۼ�����: 2019.03.19
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ����: ����ڿ��� �� ���� ���ڸ� �Է��ϵ��� �Ͽ� ���� ���� ��, ���� ū ��, 
 *            �հ� �Ǵ� ��� �� �� �ϳ��� �����Ͽ� ����ϴ� �޴���� ���α׷�, 4���� �ǽ� ���� ��° ����
 * ���α׷� ��������: 2019.03.21 AM 11:55
 * 
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ܰ�

public class Java4ThWeekProject6 {
	public static void main(String[] args) {
		int MenuNumber; // ����ġ ��ȣ�� �Է� �ޱ� ���� ����
		int FirstNumber; // ù ��°�� �Է¹��� ������ ���� ����
		int SecondNumber; // �� ��°�� �Է¹��� ������ ���� ����
		double result = 0; // ������ ��� ���� �����ϱ� ���� ����

		Scanner input = new Scanner(System.in); // Ű����κ��� �Է¹ޱ� ���� ����

		System.out.println("�� ������ �Է��ϼ���: "); // �� ������ �Է¹���
		FirstNumber = input.nextInt();
		SecondNumber = input.nextInt();
		System.out.println("�޴�\n" + "1. ������\n" + "2. ū��\n" + "3. �հ�\n" + "4. ���\n" + "5. ����\n" + "�޴��� �����ϼ���: ");
		MenuNumber = input.nextInt(); // �޴��� �����

		switch (MenuNumber) // 5���� ����� �޴�
		{
		case 1:
			if (FirstNumber < SecondNumber)// �Է� ���� �� �� �߿��� ���� ���� ����ϴ� ���̽�
				result = FirstNumber;
			else
				result = SecondNumber;
			break;
		case 2:
			if (FirstNumber > SecondNumber) // �Է� ���� �� �� �߿��� ū ���� ����ϴ� ���̽�
				result = FirstNumber;
			else
				result = SecondNumber;
			break;
		case 3: // �Է� ���� �� ���� ���� ����ϴ� ���̽�
			result = FirstNumber + SecondNumber;
			break;
		case 4: // �Է� ���� �� ���� ����� ����ϴ� ���̽�
			result = ((double) FirstNumber + (double) SecondNumber) / 2.0;
			break;
		case 5: // ���α׷��� �����ϴ� ���̽�
			System.exit(0);
			break;
		default:
			System.out.println("�޴����ÿ���"); // ���ܰ��� �ԷµǾ����� ������ ����ϴ� default
			break;

		}
		System.out.println("��� :" + result); // ������� �����
	}

}
