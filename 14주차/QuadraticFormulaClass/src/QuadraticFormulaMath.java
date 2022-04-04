/**
 * ���α׷� �ۼ�����: 2019.05.29
 * ���α׷� ����: MathŬ������ �̿��� ���� ������ �ظ� ���ϴ� ���α׷� 
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.05.29
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 

public class QuadraticFormulaMath {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // ��ĳ�ʸ� input�̶�� �̸����� ��� 
		Calculate clc = new Calculate(); // Calculate Ŭ������ clc��� �̸����� ��� 
		
		System.out.println("a, b, c���� �Է��ϼ��� : "); // ���� ������ a, b, c���� �Է¹���
		clc.QuadraticFormula(input.nextDouble(), input.nextDouble(), input.nextDouble());
		// �Է¹��� a, b, c ���� Calculate Ŭ������ QuadraticFormula�� ����
		System.out.println(clc.toString()); // toString�� ���� ������� �޾� ����� 
	}
}

class Calculate { // ���� ���� ��� �� ������ ���� Ŭ���� 
	private static Double[] save = new Double[2]; // ���� �������� ������� �� ���� �����ϱ� ���� �迭
	public static void QuadraticFormula(Double a, Double b, Double c) { // a, b, c�� �޾� ���� ���Ŀ� ������ ����ϴ� �޼��� 
		save[0] = ((-b + Math.sqrt(b*b - 4*a*c))/(2*a)); // ���� ���� +�� ��츦 �迭�� ���� 
		save[1] = ((-b - Math.sqrt(b*b - 4*a*c))/(2*a)); // ���� ���� -�� ��츦 �迭�� ���� 
	}
	public String toString() { // ������� �����ϱ� ���� �޼��� 
		return "x = " + save[0] + ", " + save[1]; // ��� ����� �� 2���� ���� 
	}
}
