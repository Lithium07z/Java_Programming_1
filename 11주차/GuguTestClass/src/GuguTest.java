/**
 * ���α׷� �ۼ�����: 2019.05.07
 * ���α׷� ����: Ŭ������ �޼��带 �̿��� �������� ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.05.09 AM 11:40
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 
public class GuguTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Gugu dan2 = new Gugu(); // Gugu Ŭ������ dan2��� �̸����� ����� 
		int dan; // ����ڷκ��� ���� �Է¹޾� �����ϱ� ���� ���� 
		System.out.println("���� �Է��ϼ��� : "); // ���� �Է¹��� 
		dan = input.nextInt();
		dan2.setDan(dan); // dan2�� setDan���� dan������ ����� 
		dan2.printGugu(); // dan2�� printGugu�޼��带 ����� 
	}
}

class Gugu {
	private int dan; // �޼��带 ���ؼ��� �� ���� �޴� ����
	public void setDan(int dan) { // main���κ��� dan ���� ���� 
		this.dan = dan; // ���� ���� Gugu Ŭ������ dan���� ������ 
	}
	public void printGugu() { // �������� ����ϴ� �޼���
		for(int i = 1; i <= 9; i++) { // i �� 1���� 9���� �۰ų� ���� �� ���� �ݺ� 
			System.out.println(dan + " * " + i + " = " + dan*i ); // ������ ��� 
		}
	}	
}