/**
 * ���α׷� �ۼ�����: 2019.04.25
 * ���α׷� ����: ������ ���� ������ 2���� �迩�� �����ϰ� �ݺ����� �̿��� �ʱ�ȭ �� �� ������ ��� ���� ���� ����ϴ�
 *            ���α׷�
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.04.25 PM 12:28
 */
public class Java9ThWeekProjectArr4 {
	public static void main(String[] args) {
		int [][] arr = new int [3][10]; // 3�� 10���� ũ�⸦ ������ 2�����迭 ���� 
		int [] colSum = new int[10]; // ���� ���� ���� �����ϴ� �迭 
		int [] rowSum = new int[3]; // ���� ���� ���� �����ϴ� �迭 
		int i; // ���� ���� ���� ���ϴ� �ݺ����� ���� ���� 
		int j; // ���� ���� ���� ���ϴ� �ݺ����� ���� ���� 
		int k; // ���� ���� ���� ���ϴ� �ݺ����� ���� ���� 
		int l; // ���� ���� ���� ���ϴ� �ݺ����� ���� ���� 
		int m; // arr�迭�� ��������� ���� ����ϴ� �ݺ����� ���� ���� 
		int n; // arr�迭�� ��������� ���� ����ϴ� �ݺ����� ���� ���� 
		int count = 0; // ��������� ���� rowSum�迭�� ������Ű�� ���� ���� 
		int count2 = 0; // ��������� ���� colSum�迭�� ������Ű�� ���� ���� 
		int count3 = 0; // arr�迭�� 10��° ���� ���ĸ��� ���� ���� ���� ��½�Ű�� ���� ���� 
		int count4 = 0; // colSum�迭�� ����ϱ� ���� ���� 
		int temp = 1; // arr[0][0]�� �ʱⰪ�� 1�� �����ϱ� ���� ���� 
		
		for(int q = 0; q < arr.length; q++) { // q�� arr�迭�� ���� ũ�⺸�� ���� ��  ���� �ݺ� 
			for(int w = 0; w < arr[q].length; w++) { // w�� arr�迭�� ���� ũ�⺸�� ���� �� ���� �ݺ�
				arr[q][w] = temp; // temp�� ���� arr[q][w]�� ���� 
				temp += 3; // temp�� 3 ������Ű�� ���� 
				if (temp == 31) { // ���� temp�� 31�̶�� 
					temp = 2; // temp�� ���� 2�� ���� 
				} else if (temp == 32) { //���� temp�� 32���
					temp = 3; // temp�� ���� 3���� ���� 
				}
			}
		}
		
		for (i = 0; i < 3; i++) { // i�� 3���� ���� �� ���� �ݺ� 
			for (j = 0; j < 10; j++) { // j�� 10���� ���� �� ���� �ݺ� 
				rowSum[count] += arr[i][j];
				// arr�迭�� ���� ������ rowSum�迭�� ��ҿ� ������Ŵ
			}
				count += 1; // count ���� 1 ������Ŵ 
		}
		for (k = 0; k < 10; k++) { // k�� 10���� ���� �� ���� �ݺ� 
			for (l = 0; l < 3; l++) { // l�� 3���� ���� �� ���� �ݺ� 
				colSum[count2] += arr[l][k];
				// arr�迭�� ���� ������ colSum�迭�� ��ҿ� ������Ŵ
			}
				count2 += 1; // count2 ���� 1 ������Ŵ
		}
		for (m = 0; m < 3; m++) { // m�� 3���� ���� �� ���� �ݺ� 
			for (n = 0; n < 10; n++) { // n�� 10���� ���� �� ���� �ݺ� 
			System.out.print(arr[m][n]+" ");
			count3 += 1; // count3 ���� 1 ������Ŵ 
			switch (count3) {
			case 10: System.out.println(rowSum[0]);
					break; // count3�� ���� 10�̸� rowSum�迭�� 0��° ��Ҹ� ����� 
			case 20: System.out.println(rowSum[1]);
			         break; // count3�� ���� 20�̸� rowSum�迭�� 1��° ��Ҹ� ����� 
			case 30: System.out.println(rowSum[2]);
			         break; // count3�� ���� 30�̸� rowSum�迭�� 2��° ��Ҹ� ����� 
				}
			}
		}
		for (count4 = 0; count4 < 10; count4++) { // count4�� ���� 10���� ���� �� ���� �ݺ�
		System.out.print(colSum[count4]+" "); // colSum�迭�� count4 ���� �ε����ȿ� ��� ���� ���
		}
	}

}
