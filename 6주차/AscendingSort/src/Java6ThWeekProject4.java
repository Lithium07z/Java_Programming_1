/**
 * ���α׷� �ۼ�����: 2019.04.01
 * ���α׷� ����: ������ �����迭�� ���� �� ���� ������������ �����ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.04.01 PM 11:38
 */
import java.util.Arrays; // Arrays �Լ��� ���� ���� �ҷ��� 
public class Java6ThWeekProject4 {
	public static void main(String[] args) {
		int[] randomArray = { 5, 10, 3, 4, 1, 8, 7, 6, 9, 2};
		// randomArray �迭�� ��� ���� ������ �����ϰ� �ʱ�ȭ�� 
		
		System.out.println("�����ĵ� �迭"); // �����ĵ� �迭�� ������� �˸� 
		for (int irregularly : randomArray) // randomArray�� ��� ������ ������ irregularly�� ����
			System.out.print(irregularly+" "); // �����ĵ� �迭�� ������ �־��� irregularly�� ����� 
		Arrays.sort(randomArray); // randomArray�迭�� ������������ ������ 
		System.out.println("\n���ĵ� �迭"); // ���ĵ� �迭�� ������� �˸� 
		for (int lineUp : randomArray) // // randomArray�� ��� ������ ������ lineUp�� ����
			System.out.print(lineUp+" "); // ���ĵ� �迭�� ������ �־��� lineUp�� ����� 
	}

}