/**
 * ���α׷� �ۼ�����: 2019.04.08
 * ���α׷� ����: ����ڷκ��� ���۰��� ������ �Է¹޾� ���۰����� �������� ����ϴ� ���α׷�,
 *            argument�κ��� �ؼ��� �¼��� �Է¹޾� ���� ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.04.11 AM 12:07
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 
public class Java7ThWeekProject4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int stNum; // �Է¹��� ���۰��� �����ϴ� ���� 
		int fiNum; // �Է¹��� �� ���� �����ϴ� ���� 
		int lp; // �ݺ����� �ݺ��� ���� ���� 
		int rlt = 1; // ����� �����ϴ� ���� 
		
		System.out.print("���۰� : "); // ���۰��� �Է¹��� 
		stNum = input.nextInt(); // �Է¹��� ���� stNum�� ���� 
		System.out.print("�� �� : "); // �� ���� �Է¹��� 
		fiNum = input.nextInt(); // �Է¹��� ���� fiNum�� ���� 
		
		for(lp = stNum; lp <= fiNum; lp++) { 
			// stNum�� ũ����� fiNum�� ũ�⺸�� �۰ų� ������ ���� �ݺ�
			System.out.print(lp+" "); // ���۰��� ���� ������ ���� ��� ��� 
		}
		System.out.println(); // �Ʒ� �ٷ� ���� 
		
		String mNum = args[0]; // argument���� �Է¹��� ���� mNum�� ����
		String sNum = args[1]; // argument���� �Է¹��� ���� sNum�� ���� 
		
		int trsNum = Integer.parseInt(mNum); // mNum�� ����� ���ڿ� ���� ���������� ��ȯ 
		int trsNum2 = Integer.parseInt(sNum); // sNum�� ����� ���ڿ� ���� ���������� ��ȯ 
		
		for (int lp2 = 1; lp2 <= trsNum2; lp2++) { // trsNum2�� ���ų� ������ ���� �ݺ� 
			rlt *= trsNum; // rlt�� trsNum�� ���� ���� ������Ŵ 
		}
		System.out.println("��� : "+mNum+" ^ "+sNum+" = "+rlt); // ���� ����� ��� 
		
	}

}