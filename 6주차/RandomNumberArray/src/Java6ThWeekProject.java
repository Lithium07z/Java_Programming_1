/**
 * ���α׷� �ۼ�����: 2019.04.01 
 * ���α׷� ����: ������ 10���� ���� ������  1���� �迭�� �����ϰ� �ʱ�ȭ�ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.04.01 PM 11:03
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 
public class Java6ThWeekProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int random [] = { 1, 3, 2, 9, 5 , 6, 7, 8, 4, 10}; // random �迭�� ���� �����ϰ� �ʱ�ȭ ��
		int[] copyArray = new int [10]; // Random �迭�� �����ϱ� ���� �迭, random �迭�� �����ؾ� �ϱ� ������ ���� ũ��� �����ϰ� �ʱ�ȭ ��
		int loop; // for���� �ݺ��� ���� ���� ���� 
		int sum = 0; // �迭�� �������� �����ϱ� ���� ���� 
		int inputNum; // ã�����ϴ� ���� �Է¹޾� �����ϱ� ���� ���� 
		int count = 0; // �迭�� �ִ� Ȧ���� ������ ���� �����ϱ� ���� ���� 
		int sumOddNum = 0; // �迭�� �ִ� Ȧ���� ��� ���ϰ� �����ϱ� ���� ���� 
		
		for(loop = 0; loop < random.length; loop++) { // loop�� ���� Random�迭�� ũ�⺸�� ������ ���� �ݺ�
		    copyArray[loop] = random[loop]; // Random�迭�� ������ copyArray�迭�� ������
		    sum += random[loop]; // 0 ~ 9 ����� ���� ��� ������ sum�� ������ 
		}
		System.out.println("�迭 ������ : "+sum); // �迭�� �������� ��� 
		
		System.out.print("ã�����ϴ� ���� �Է��ϼ��� : "); // ã�����ϴ� ���� �Է¹��� 
		inputNum = input.nextInt();
		
		for(loop = 0; loop < random.length; loop++) { // loop�� ���� Random�迭�� ũ�⺸�� ������ ���� �ݺ�
			if (random[loop] == inputNum)
				//���� �Է¹��� ���� Random�迭�� ��ҵ� �� �ϳ��� ���ٸ� 
				System.out.println("�� "+inputNum+"�� �ε����� "+"["+loop+"]"+"�Դϴ�.");
				// �Է� ���� ���� �迭 �� �ε��� ���� ����� 
		}
		for(loop = 0; loop < random.length; loop++) { // loop�� ���� Random�迭�� ũ�⺸�� ������ ���� �ݺ�
			if (random[loop] % 2 != 0) { // Random�迭�� ��ҵ� �� 2�� �������� ���� �������� 0�� �ƴ϶��
				count += 1; // count ������ 1�� ���ϰ� �����Ѵ�
				sumOddNum += random[loop]; // Random�迭�� ��� ���� sumOddNum�� ���� �����Ѵ�
			}
		}
		System.out.println("Ȧ���� ���� : "+count+"��"); // �迭 ���� Ȧ�� ������ ����� 
		System.out.println("Ȧ���� �� : "+sumOddNum); // �迭 �� Ȧ���� ���� ����� 
	}

}
