/*
 * ���α׷� �ۼ�����: 2019.03.27     
 * ���α׷� ����: ����ڷκ��� n ���� �Է� �ް� n!(���丮��)�� ���ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� �ۼ�����: 2019.03.27 PM 08:49
 */
import java.util.Scanner;
public class Java5ThWeekProject11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int factorial; // ���丮�� ����� ���� �Է¹ް� �����ϴ� ���� 
		long calculate; // �Է¹��� ���丮�� ũ�⸸ŭ �ݺ��ϱ� ���� �����ϴ� ���� 
		long calculate2 = 1; // ���丮�� �������� ���� �����ϴ� ���� 
		
		System.out.println("���丮�� n ���� �Է��Ͻÿ� : "); // ���丮�� ���� �Է¹��� 
		factorial = input.nextInt();
		
		for (calculate = factorial; calculate >= 1; calculate--) {
			// �Է¹��� ���丮�� ��ŭ �ݺ��ϱ� ���� calculate�� 1���� ũ�ų� ���� �� ���� ���ҽ�Ŵ
			calculate2 = calculate2 * calculate;
			// calculate�� calculate2�� ���� ����  calculate2�� �����ϸ鼭
			// ���丮�� �������� ������ ��� ���� 

		}
		System.out.println(factorial+"! = "+calculate2);
		// ����� ���丮�� �� ���
	}

}
