/*
 * ���α׷� �ۼ�����: 2019.03.19
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ����: ����ڷκ��� Ű�� �����Ը� �Է¹޾� ǥ��ü���� ����� �� �񸸵��� ����ϰ� 
 *            �� ������ ���� �񸸿��θ� ����ϴ� �Ǵ��ϴ� ���α׷�, 4���� �ǽ� �� ��° ����
 * ���α׷� ��������: 2019.03.19 PM 08:55
 * 
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ܰ� 
public class Java4ThWeekProject4 {
	public static void main(String[] args) {
		int Height; // Ű�� �Է¹ޱ� ���� ����
		int Weight; // �����Ը� �Է¹ޱ� ���� ���� 
		double StandardWeight; // ǥ��ü���� �����ϱ� ���� ���� 
		double Fatness; // �񸸵��� �����ϱ� ���� ���� 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ű�� �Է��ϼ���: "); // Ű�� �Է¹���
		Height = input.nextInt();
		System.out.println("�����Ը� �Է��ϼ���: "); // �����Ը� �Է¹��� 
		Weight = input.nextInt();
		
		StandardWeight = ( Height - 100 ) * 0.9; // ǥ��ü�� ����
		Fatness = ( Weight - StandardWeight ) / StandardWeight * 100; // �񸸵� ����
		
		if ( Fatness < 20 ) { // �񸸵��� ������ ��� 
			System.out.println("�񸸵��� �����Դϴ�.");
		}
		else if ( Fatness < 30 ) { // �񸸵��� �浵���� ��� 
			System.out.println("�񸸵��� �浵���Դϴ�.");
		}
		else if ( Fatness < 50) { // �񸸵��� �ߵ����  ���
			System.out.println("�񸸵��� �ߵ���Դϴ�.");
		}
		else { // �񸸵��� ������ ��� 
			System.out.println("�񸸵��� �����Դϴ�.");
		}
		
	}

}
