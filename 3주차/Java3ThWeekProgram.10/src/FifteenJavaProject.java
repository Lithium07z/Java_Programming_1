/*
 * ���α׷� �ۼ�����: 2019.03.14
 * ���α׷� ����: �ڹ� ���α׷���1 ���� 3���� �ǽ� ���α׷�, �������� 15��° ���α׷�
 * ���α׷� ���� ��������: 2019.03.14
 * �ۼ���: ����ȣ
 */
import java.util.Scanner;
public class FifteenJavaProject {
	public static void main(String[] args) {
		int pyung;
		double m2;
		
		Scanner inputValue = new Scanner(System.in);
		System.out.println("����� �Է��ϼ��� : ");
		pyung = inputValue.nextInt();
		
		m2 = (double)pyung * 3.3;
		System.out.printf("�Է°� %d���� %f �������Դϴ�. ", pyung , m2);
		
	}

}
