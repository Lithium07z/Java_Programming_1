/**
 * ���α׷� ��������: 2019.04.01  
 * ���α׷� ����: ������ ���� ���� ������ 2���� �迭�� �����ϰ� �ʱ�ȭ �ϰ� 
 *            ����� ���� printTwoDim�޼��带 ����� �� �޼��带 �̿��� ����ϴ� ���α׷�
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.04.02 PM 11:49
 */
public class Java6ThWeekProject3 {
	public static void main(String[] args) {
		int [][]arr = {{ 4, 2, 1, 2, 3, 4, 5, 6, 7, 8 }, // 2���� �迭�� ����� ���ÿ� �ʱ�ȭ�� 
		               { 1, 2, 4, 3, 5, 2, 6, 7, 8, 9 },
		               { 3, 2, 4, 5, 2, 3, 4, 5, 3, 1 }};
		      printTwoDim(arr); // arr�迭�� printTwoDim �޼��忡�� ����� 
		   }
	public static void printTwoDim (int[][] arr) {
		int helpL; // �迭�� ���� �ݺ��� ���� ����  
		int helpL2; // �迭�� ���� �ݺ��� ���� ���� 
		
		for(helpL = 0; helpL < arr.length; helpL++) {
			// arr�迭�� �� �� ��ŭ �ݺ�
			for(helpL2 = 0; helpL2 < arr[helpL].length; helpL2++) {
				// arr�迭�� �� �� ��ŭ �ݺ� 
				System.out.print(arr[helpL][helpL2]+" ");
				// arr�迭�� ��, �� ���� ���� ���� ����� 
			}
		        System.out.println(); // �Ʒ��ٷ� ����  
		}
	}
}