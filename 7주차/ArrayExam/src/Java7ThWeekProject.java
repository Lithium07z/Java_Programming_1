
/**
 * ���α׷� ��������: 2019.04.08
 * ���α׷� ����: ����ڷκ��� ���� 10���� �Է¹޾� �ݺ����� �̿��� �迭�� �����ϰ� bubbleSort�� �̿��� ������ ��
 *            printArray �޼��带 �̿��� ����ϴ� ���α׷� , Ű����κ��� ������ �Է¹޾� �迭���� 
 *            �˻��ϰ� �迭���� ��ġ�� ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.04.11 AM 11:34
 */
import java.util.Scanner; // Ű����κ��� ���� �Է¹ޱ� ���� �ҷ��� 

public class Java7ThWeekProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] rdArr = new int[10]; // 10�� ũ�⸦ ������ 1���� �迭 ����

		int ipNum; // �迭�� �Է��� ���� �޾� �����ϴ� ����
		int ipNum2 = 0; // ã�� ������ �Է¹޾� �����ϴ� ����
		int lp; // �ݺ����� �ݺ��� ���� ����
		int fdArr;
		
		for (lp = 0; lp < 10; lp++) { // �ݺ����� 10�� �ݺ���
			System.out.print("[" + lp + "]��° �迭 �� �Է� : "); // �� 10���� �迭 ���� �Է¹���
			rdArr[lp] = input.nextInt(); // �Է¹��� �迭 ���� rdArr�� �迭�� ������
		}
		bubbleSort(rdArr); // rdArr�� ���� bubbleSort �޼��忡�� �����
		printArray(rdArr); // rdArr�� ���� printArray �޼��忡�� �����

		System.out.print("ã���� ������ �Է��Ͻʽÿ� : "); // ã�� ������ �Է��϶�� ���
		ipNum2 = input.nextInt(); // �Է¹��� ������ ipNum2�� ����
	
		fdArr = find(rdArr, ipNum2);
		
		System.out.print("ã���ô� ������ ��ġ�� " + fdArr + "�Դϴ�."); // ã�� ������ �ε��� ���� ���
	}

	public static void bubbleSort(int[] rdArr) { // ���� ������ ���� �޼ҵ�
		for (int lp = 0; lp < rdArr.length; lp++) { // rdArr�� ũ�⸸ŭ �ݺ�
			for (int lp2 = 0; lp2 < rdArr.length - 1 - lp; lp2++) // rdArr�� ũ�⸸ŭ �ݺ�
				if (rdArr[lp2] > rdArr[lp2 + 1]) { // ���� ���� ��� ���� ���� ��� ������ ũ�ٸ� 
					int temp = rdArr[lp2]; // ū ����� ���� temp�� �ְ�
					rdArr[lp2] = rdArr[lp2 + 1]; // ���� ����� ���� ū ����� �ε����� �ִ´�
					rdArr[lp2 + 1] = temp; // �ٽ� ū ����� ���� temp�� �ִ´� 
				}
		}
	}

	public static void printArray(int[] rdArr) { // ����� ���� �޼ҵ�
		for (int prtNum : rdArr) { // rdArr�� ���� prtNum�� ����
			System.out.print(prtNum + " "); // rdArr�� ���� ���� prtNum�� �����
		}
		System.out.println(); // �Ʒ� �ٷ� ���� 
	}

	public static int find(int[] rdArr, int ipNum2) { // ã�� ������ �ε��� ���� ��ȯ�ϴ� �޼ҵ�
		int lp; // �ݺ����� �ݺ��� ���� ����
		int index = -1; //

		for (lp = 0; lp < 10; lp++) { // �ݺ����� 10�� �ݺ�
			if (ipNum2 == rdArr[lp]) { // ã�� ������ rdArr�� ��� ���� ���ٸ�
				index = lp; // �ε��� ���� index ������ ����
			}
		}
		return index; // �ε��� ���� ��ȯ��
	}
}
