/*
 * ���α׷� �ۼ�����: 2019.03.19
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ����: �� ���� �Է¹޾� �� ���� ũ�⸦ ���ϴ� ���α׷�, 4���� �ǽ� ù ��° ����
 * ���α׷� ��������: 2019.03.19 PM 08:18
 * 
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ܰ�
public class Java4ThWeekProject {
	public static void main(String[] args) {
		int FirstNumber; // ù ��°�� �Է¹޴� ������ ������ ���� ����
		int SecondNumber; // �� ��°�� �Է¹޴� ������ ������ ���� ���� 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ù ��° ������ �Է��ϼ��� : "); // ù ��° ������ �Է� �޾� ������ ����
		FirstNumber = input.nextInt();
		System.out.println("�� ��° ������ �Է��ϼ��� : "); // �� ��° ������ �Է� �޾� ������ ���� 
		SecondNumber = input.nextInt();
		if (FirstNumber < SecondNumber) { // ù ��° �������� �� ��° ������ Ŭ ���
			System.out.println("��� : ù ��° ���� "+FirstNumber+"��(��) �� ��° ���� "+SecondNumber+"���� �۴�.");
		}
			else if (FirstNumber > SecondNumber) { // ù ��° ������ �� ��° �������� Ŭ ���
				System.out.println("��� : ù ��° ���� "+FirstNumber+"��(��) �� ��° ���� "+SecondNumber+"���� ũ��.");
			}
			     else { // ù ��° ������ �� ��° ������ ���� ��� 
					System.out.println("��� : ù ��° ���� "+FirstNumber+"��(��) �� ��° ���� "+SecondNumber+"�� ����.");
				}
		
	}
	

}
