/**
 * ���α׷� �ۼ�����: 2019.04.25
 * ���α׷� ����: ������ ���� ������ 2���� �迭�� �����ϰ� �ʱ�ȭ �ϰ� ����� ���� printTwoDim�޼��带 ����� 
 *            ����ϴ� ���α׷�
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.04.25
 *
 */
public class Java9ThWeekProjectArr3 {
	public static void main(String[] args) {
		
		int[][] arr = {{4, 2, 1, 2, 3, 4, 5, 6, 7, 8}, // 2���� �迭 ���� 
						{1, 2, 4, 3, 5, 2, 6, 7, 8, 9},
						{3, 2, 4, 5, 2, 3, 4, 5, 3, 1}};
		printTwoDim(arr); // arr�� printTwoDim �޼��忡�� ����� 
	}
	public static void printTwoDim(int[][] arr) {
		int i; // �ݺ����� ���� ���� ����
		int j; // �ݺ����� ���� ���� ����
		
		for(i = 0; i < arr.length; i++) { // i�� arr ���� ũ�⺸�� ���� �� ���� �ݺ� 
			for(j = 0; j < arr[i].length; j++) { // j�� arr ���� ũ�⺸�� ���� �� ���� �ݺ� 
				System.out.print(arr[i][j] + " "); // 2���� �迭�� ��� 
			}
			System.out.println(); // ���� ���� �� ���� �Ʒ� �ٷ� ���� 
		}
	}

}
