/*
 * ���α׷� �ۼ�����: 2019.03.19
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ����: ����ڷκ��� 2�� �������� ��� a , b , c�� �Ǽ��� �Է¹޾� 2�� ��������
 *            ���� ��� ����ϴ� ���α׷�, 4���� �ǽ� �ټ� ��° ����
 * ���α׷� ��������: 2019.03.19 PM 09:53 > 2019.03.20 PM 04:47 ( �ּ� �߰� )
 * 
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ܰ� 
import java.math.*; // ��Ʈ ����� ���� sqrt Ŭ������ ���� ���� �ܰ�
public class Java4ThWeekProject5 {
	public static void main(String[] args) {
		double A; // 2�� �������� ��� A
		double B; // 2�� �������� ��� B
		double C; // 2�� �������� ��� C 
		double D = 0.0; // �Ǻ��� D
		double D2 = 0.0; // �Ǻ��� D2
		double FirstX; // ù ��° ��
		double SecondX; // �� ��° �� 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("2�� �������� ��� A�� �Է��ϼ��� : "); // ��� A�� �Է¹���
		A = input.nextInt();
		System.out.println("2�� �������� ��� B�� �Է��ϼ��� : "); // ��� B�� �Է¹��� 
		B = input.nextInt();
		System.out.println("2�� �������� ��� C�� �Է��ϼ��� : "); // ��� C�� �Է¹��� 
		C = input.nextInt();
		
		D = B * B - 4 * A * C; // �Ǻ��� D�� ������ 
		D = Math.sqrt(D); // �Ǻ��� D�� �������� ���ϱ� ���� ����
		
		if ( D > 0 ) { // �Ǻ��� D�� 0���� ū ��� 
			FirstX = (-B + D) / 2 * A;
			SecondX = (-B - D) / 2 * A;
			System.out.println("ù ��° �Ǳ��� "+FirstX+"�̰� �� ��° �Ǳ��� "+SecondX+"�̹Ƿ� '���� �ٸ� �� �Ǳ�' �Դϴ�.");
		}
		else if ( D == 0 ) { // �Ǻ��� D�� 0�� ���� ��� 
			FirstX = SecondX = -( B / (2 * A) );
			System.out.println("ù ��° �Ǳ��� "+FirstX+"�̰� �� ��° �Ǳ��� "+SecondX+"�̹Ƿ� '���� ���� �� �Ǳ�' �Դϴ�.");
			
		}
		else { // �Ǻ��� D�� 0���� ���� ��� 
			D2 = 4 * A * C - B * B; // �Ǻ��� D2�� ������ 
			D2 = Math.sqrt(D2); // �Ǻ��� D2�� �������� ���ϱ� ���� ���� 
			FirstX = (-B + D2) ;
			SecondX = (-B - D2) ;
			System.out.println("ù ��° �Ǳ��� "+FirstX+"i / "+(2*A)+"�̰� �� ��° �Ǳ��� "+SecondX+"i / "+(2*A)+"�̹Ƿ� '���� �ٸ� �� ���' �Դϴ�.");
			
		}
		
	}

}
