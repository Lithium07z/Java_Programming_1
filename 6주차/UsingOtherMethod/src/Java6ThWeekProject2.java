
/**
 * ���α׷� �ۼ�����: 2019.04.01  
 * ���α׷� ����: main �޼��忡�� 1���� 10������ ���� ������  1���� �迭�� ����� ���ÿ� �ʱ�ȭ�ϰ� 
 *            ����� ���� printOneDim�޼��带 ����� �� �޼��带 �̿��� ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.04.02 PM 11:49
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 

public class Java6ThWeekProject2 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		printOneDim(arr); // arr�迭�� ���� printOneDim �޼��忡�� �����
		int indx; // find �޼��忡���� index ���� �޴� ���� 
		indx = find(arr); // arr�迭�� ���� find �޼��忡�� ����� 
		if(indx == -1) { // index�� ���� -1�̶��
			System.out.println("���ڸ� ã�� ���߽��ϴ�. "); // ���ڸ� ã�� �������� ���
		} else  // index�� ���� -1�� �ƴ϶��
			System.out.println("ã���ô� ������ ��ġ�� "+indx+"�Դϴ�.");;
			// ã�� ������ �ε���������� 
		int ttal; // sumArray �޼��忡���� total ���� �޴� ���� 
		ttal = sumArray(arr); // arr�迭�� ���� sumArray �޼��忡�� �����
		System.out.println("�迭�� �� ���� " + ttal + "�Դϴ�.");
		// �迭�� �� ���� �����
		
	}

	public static void printOneDim(int[] copyMethod) { // ����ϱ� ���� �޼���
		// main�޼��� ������ printOneDim�� ���� copyMethod�� �����ϰ� ������
		int loop; // �ݺ����� �����Ű�� ���� ����
		for (loop = 0; loop < copyMethod.length; loop++) {
			// copyMethod�� �迭 ũ�⺸�� ���� �� ���� �ݺ���
			System.out.print(copyMethod[loop] + " ");
			// copyMethod�迭�� ��� ������ �����
		}
		System.out.println(); // �Ʒ� �ٷ� ����
	}

	public static int find(int[] copyMethod) {
		Scanner input = new Scanner(System.in);
		int inputNum; // �Է¹��� ���ڸ� ������ ����
		int loop; // �ݺ����� �����Ű�� ���� ����
		int index = -1; // ���ڸ� ã�� ������ ��츦 ���� ���� 
		System.out.print("ã���� ���ڸ� �Է��Ͻʽÿ� : "); // �迭���� ã�� ���ڸ� �Է¹���
		inputNum = input.nextInt();
		for (loop = 0; loop < copyMethod.length; loop++) {
			// copyMethod�迭�� ũ�⺸�� ���� �� ���� �ݺ���

			if (inputNum == copyMethod[loop]) {
				// �Է��� ���ڿ� copyMethod�迭 ���� ���ڰ� ���ٸ�
				index = loop; // loop ���� index�� ������ 
			}
		}
		return index; // index���� ��ȯ�� 
	}

	public static int sumArray(int[] copyMethod) {
		int loop; // �ݺ����� �����Ű�� ���� ����
		int total = 0; // �迭�� �� ���� �����ϱ� ���� ����

		for (loop = 0; loop < copyMethod.length; loop++) {
			// copyMethod�迭�� ũ�⺸�� ���� �� ���� �ݺ���
			total += copyMethod[loop];
			// copyMethod�迭�� ��� ������ ��� ������ total�� ���� ������Ŵ
		}
		return total;
	}
}
