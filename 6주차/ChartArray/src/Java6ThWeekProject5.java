/**
 * ���α׷� ��������: 2019.04.03
 * ���α׷� ����: ������ ���� ������ ���� �迭�� ���� �� ���� ���� �����ϱ� ���� �迭�� �����ϰ� 
 *            �迭�� �� ���� ���� �� �ϴ� ���α׷� 
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.04.04 AM 11:45
 */
public class Java6ThWeekProject5 {
	public static void main(String[] args) {
		int [][] arr = {{ 4, 2, 1, 2, 3, 4, 5, 6, 7, 8 }, // 2���� �迭�� ����� ���ÿ� �ʱ�ȭ�� 
	                    { 1, 2, 4, 3, 5, 2, 6, 7, 8, 9 },
	                    { 3, 2, 4, 5, 2, 3, 4, 5, 3, 1 }};
		int [] colSum = new int[10]; // ���� ���� ���� �����ϴ� �迭 
		int [] rowSum = new int[3]; // ���� ���� ���� �����ϴ� �迭 
		int loop; // ���� ���� ���� ���ϴ� �ݺ����� ���� ���� 
		int loop2; // ���� ���� ���� ���ϴ� �ݺ����� ���� ���� 
		int loop3; // ���� ���� ���� ���ϴ� �ݺ����� ���� ���� 
		int loop4; // ���� ���� ���� ���ϴ� �ݺ����� ���� ���� 
		int loop5; // arr�迭�� ��������� ���� ����ϴ� �ݺ����� ���� ���� 
		int loop6; // arr�迭�� ��������� ���� ����ϴ� �ݺ����� ���� ���� 
		int count = 0; // ��������� ���� rowSum�迭�� ������Ű�� ���� ���� 
		int count2 = 0; // ��������� ���� colSum�迭�� ������Ű�� ���� ���� 
		int count3 = 0; // arr�迭�� 10��° ���� ���ĸ��� ���� ���� ���� ��½�Ű�� ���� ���� 
		int count4 = 0; // colSum�迭�� ����ϱ� ���� ���� 
		
		for (loop = 0; loop < 3; loop++) { // loop�� 3���� ���� �� ���� �ݺ� 
			for (loop2 = 0; loop2 < 10; loop2++) { // loop�� 10���� ���� �� ���� �ݺ� 
				rowSum[count] += arr[loop][loop2];
				// arr�迭�� ���� ������ rowSum�迭�� ��ҿ� ������Ŵ
			}
				count += 1; // count ���� 1 ������Ŵ 
		}
		for (loop3 = 0; loop3 < 10; loop3++) { // loop�� 10���� ���� �� ���� �ݺ� 
			for (loop4 = 0; loop4 < 3; loop4++) { // loop�� 3���� ���� �� ���� �ݺ� 
				colSum[count2] += arr[loop4][loop3];
				// arr�迭�� ���� ������ colSum�迭�� ��ҿ� ������Ŵ
			}
				count2 += 1; // count2 ���� 1 ������Ŵ
		}
		for (loop5 = 0; loop5 < 3; loop5++) { // loop�� 3���� ���� �� ���� �ݺ� 
			for (loop6 = 0; loop6 < 10; loop6++) { // loop�� 10���� ���� �� ���� �ݺ� 
			System.out.print(arr[loop5][loop6]+" ");
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
