/*
 * ���α׷� �ۼ�����: 2019.03.27
 * ���α׷� ����: 1900����� 2015�� ���� �⵵ �� ���⿡ �ش��ϴ� �⵵�� ����ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.28 AM 11:41
 */
public class Java5ThWeekProject13 {
	public static void main(String[] args) {
		int yoonYear; // ������ �����ϴ� ���� 
		
		for (yoonYear = 1900; yoonYear <= 2015; yoonYear++) { 
			// yoonYear�� ���� 1900�� ���� 2015����� ������Ű�� for��
			if ( (yoonYear % 4 == 0 && yoonYear % 100 != 0) || yoonYear % 400 == 0 ) {
				// 4�� 400���� ���� �������� 0�̸鼭 100���� ���� �������� 0�� �ƴ϶�� �������� �ν�
				System.out.println(yoonYear); // ���� ���
			}
		}
	}

}
