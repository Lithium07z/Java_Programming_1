/**
 * ���α׷� �ۼ�����: 2019.04.25
 * ���α׷� ����: �ټ� ���� ���ڿ��� �����ϴ� ������ �迭�� ������ �� ���ڿ� �����͸�
 *            �Է� �޾� ������ �� ������ ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.04.25 AM 11:33
 */
import java.util.Scanner; //Ű����� �Է¹ޱ� ���� �ҷ��� 
public class Java9ThWeekProjectArr {
	public static void main(String[] args) {
		
		int i; // �ݺ��� �۵��� ���� ���� i ����
		String arr [] = new String[5]; // 5�� ũ�⸦ ������ ���ڿ� �迭 ����
		Scanner scan = new Scanner(System.in); // ��ĳ�� ����� ���� �ۼ� 
		
		for(i = 0; i < arr.length; i++) { // i�� arr �迭�� ũ�⺸�� ���� �� ���� �ݺ� 
			System.out.print("���ڿ� �Է� : "); // ���ڿ��� �Է¹��� 
			arr[i] = scan.next(); // �Է¹��� ���ڿ��� arr�迭��  i��ġ�� ������ 
			
		}
		for(i = 0; i < arr.length; i++) { // i�� arr �迭�� ũ�⺸�� ���� �� ���� �ݺ� 
			System.out.println("arr[" + i + "]=" + arr[i]); // �迭 ���� ���� ���� ����� 
			
		for(String data : arr) // arr �迭�� ���� �ϳ��� ���� data ���ڿ��� ���� 
			System.out.println(data); // arr �迭�κ��� ���� ���ڿ��� ����� 
		}
		
		
	}

}
