/*
 * ���α׷� �ۼ�����: 2019.03.14
 * ���α׷� ����: �ڹ� ���α׷���1 ���� 3���� �ǽ� ���α׷�, �������� 12��° ���α׷�
 * ���α׷� ���� ��������: 2019.03.14
 * �ۼ���: ����ȣ
 */
import java.util.Scanner;
public class TwelfthJavaProject {
	public static void main(String[] args) {
		
		int lenght; // �ʿ��� ������ �����Ͻÿ�.
		int round;  // ����, �ʺ�, ����, ����
		int high;
		int volume; 
		
		Scanner inputValue = new Scanner(System.in);
		
		System.out.println("������ ���̸� �Է��Ͻÿ� : "); //���� �Է�
		lenght = inputValue.nextInt();
		System.out.println("������ �ʺ� �Է��Ͻÿ� : "); //�ʺ� �Է�
		round = inputValue.nextInt();
		System.out.println("������ ���̸� �Է��Ͻÿ� : "); //���� �Է�
		high = inputValue.nextInt();
		
		volume = lenght * round * high; // ���� �ۼ�
		
		System.out.println("������ ���Ǵ� "+volume+"�Դϴ�."); // ��� ���
	}
  }