/*
 * ���α׷� �ۼ�����: 2019.03.26
 * ���α׷� ����: 1���� 50���� ���ڸ� for������ ����ϵ� if ���� �̿��� 
 *            3�� ��� �Ǵ� 5�� ����� * �� ����ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.26 PM 06:01
 */
public class Java5ThWeekProject4 {
	public static void main(String[] args) {
		int allNumber; // 1���� �ݺ��ؼ� 1�� ���� ���� ������ ���� 
		
		for (allNumber = 1; allNumber <= 50; allNumber++) {
			// allNumber�� 1�� �����ϰ� 50�� ���ų� ���������� 1�� ���ϴ� ���� �ݺ� 
			if (allNumber % 3 == 0 ) { 
				System.out.print("*"); 
				// ���� 1�� ���ϴ� �� 3���� ���������� �������� 0�� ��� *�� ���
			}
				else if (allNumber % 5 == 0) {
					System.out.print("*");
					// ���� 1�� ���ϴ� �� 5���� ���������� �������� 0�� ��� *�� ���
				}
				else {
					System.out.print(allNumber);
					// 3�� 5�� ������ ��� �̿ܿ��� ��� ��� 
				}
			
		}
	}

}
