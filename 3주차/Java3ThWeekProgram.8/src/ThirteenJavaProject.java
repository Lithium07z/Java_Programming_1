/*
 * ���α׷� �ۼ�����: 2019.03.14
 * ���α׷� ����: �ڹ� ���α׷���1 ���� 3���� �ǽ� ���α׷�, �������� 13��° ���α׷�
 * ���α׷� ���� ��������: 2019.03.14
 * �ۼ���: ����ȣ
 */
import java.util.Scanner;
public class ThirteenJavaProject {
	public static void main(String[] args) {
		int value;
		int result;
		
		Scanner inputValue = new Scanner(System.in);
		
		System.out.print("x�� ���� �Է��ϼ��� : ");
		value = inputValue.nextInt();
		
		result = 3*value*value*value - 7*value*value + 9; 
	    System.out.println("���׽� 3x^3 - 7x^2 + 9���� x�� ���� " + value + "�� �� ���׽��� ���� " + result + "�Դϴ�.");
			
	}
}
