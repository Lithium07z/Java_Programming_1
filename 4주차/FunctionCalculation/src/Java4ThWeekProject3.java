/*
 * ���α׷� �ۼ�����: 2019.03.19
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ����: ����ڷκ��� x ���� �Է¹޾Ƽ� �Լ����� ����Ͽ� ȭ�鿡 ����ϴ� ���α׷�, 4���� �ǽ� �� ��° ����
 * ���α׷� ��������: 2019.03.19 PM 08:37
 * 
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ܰ� 
public class Java4ThWeekProject3 {
	public static void main(String[] args) {
		int Function; // �Է¹ް� �� ������ ������ ���� ���� 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("��갪 x�� �Է��Ͻÿ� : "); // ������ �Է¹���
	    Function = input.nextInt();
		
		if ( Function <= 0 ) { // �Է¹��� ������ 0�� ���ų� �� ������ ���
			Function = Function * Function * Function -  9 * Function + 2;
			System.out.println("�Լ� f(x)�� ����� "+Function);
			}
		else { // �Է¹��� ������ 0���� Ŭ ��� 
			Function = 7 * Function + 2;
					System.out.println("�Լ� f(x)�� ����� "+Function);
			}
		}
	}