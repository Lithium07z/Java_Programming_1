/*
 * ���α׷� �ۼ�����: 2019.03.27
 * ���α׷� ����: �������� 2�ܺ��� 9�ܱ��� ��� ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.27 PM 04:35
 */
public class Java5ThWeekProject9 {
	public static void main(String[] args) {
		int multiplication; // 1, 2...9�� ���� �������� �� �ܼ��� �����ϴ� ����
		int plusmultiply; // 1, 2...9�� ���� �������� �� �ܼ��� �����ϴ� ����
		int result; // �������� �� �� �ܼ� ���� ����� �����ϴ� ����
		
		for (multiplication = 2; multiplication < 10; multiplication++) {
			// �������� �� �ܼ��� 2���� 9���� ������Ű�� for��
			for (plusmultiply = 1; plusmultiply < 10; plusmultiply++) {
				// �������� �� �ܼ��� 1���� 9���� ������Ű�� for��
				result = multiplication * plusmultiply;
				// �������� �� �� �ܼ� ���� ����� ����
				System.out.println(multiplication+" * "+plusmultiply+" = "+result);
				// ������ ����� ����� 
			}
			
		}
		
	}

}
