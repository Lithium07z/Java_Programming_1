/*
 * ���α׷� �ۼ�����: 2019.03.27 
 * ���α׷� ����: ����ڷκ��� �Է¹��� ���ڱ����� ��� ���� �� �Ҽ��� ����ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.28 PM 12:10 
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 
public class Java5ThWeekProject8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNumber; // �Է¹��� ���� �����ϴ� ���� 
		int loopCount; // �Է¹��� ������ �۰ų� ���� �� ���� �����ϴ� ����  
		int loopCount2; // loopCount���� ���� �� ���� �����ϴ� ���� 
		int logicCheck; // �Ҽ��� �Ҽ��� �ƴ� ���� ������ ����ϱ� ���� ���� 
		
		System.out.println("��� �ִ밪 �Է� : "); // ���� �Է¹��� 
		inputNumber = input.nextInt();
		
		for (loopCount = 2; inputNumber >= loopCount ; loopCount++) {
			// �Է¹��� ������ �۰ų� ���� �� ���� ������Ŵ
			logicCheck = 0; // logicCheck�� ���� �ʱ�ȭ��Ŵ 
			for (loopCount2 = 2; loopCount > loopCount2; loopCount2++) {
				// loopCount2�� ���� loopCount���� ���� �� ���� ������Ŵ 
				if(loopCount % loopCount2 == 0) {
					// loopCount�� loopCount2�� ������ �Ҽ����� �ƴ��� �Ǻ��� 
					logicCheck += 1;
					// loopCount�� ���� loopCount2�� �������� ���� ���� 0�� ������
					// �Ҽ��� �ƴϹǷ� logicCheck�� 1�� ���� ����� �ȵǰ� �� 
					continue;
				}
				
			}	if (logicCheck == 0) { // logicCheck�� ���� 0 �̶�� �Ҽ��� ����� 
					System.out.println("�Ҽ� : "+loopCount);
					// �Ҽ� ���
			}
			
		}
		
	}

}
