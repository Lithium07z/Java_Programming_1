/*
 * ���α׷� �ۼ�����: 2019.03.26  
 * ���α׷� ����: ����ڷκ��� ���̿� �ʺ� �Է¹޾� ��ø�� �ݺ�����
 *            �̿��ؼ� ���� ���ϵ��� ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: ����ȣ
 * ���α׷� ���� ��������: 2019.03.28 PM 09:00
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ���
public class Java5ThWeekProject6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height; // ������ ���̸� �����ϴ� ���� 
		int width; // ������ �ʺ� �����ϴ� ���� 
		int heightLoop; // �ݺ��� �� ������ ���̿� ���õǾ������� ����ϴ� ����
		int widthLoop; // �ݺ��� �� ������ �ʺ�� ���õǾ� ������ ����ϴ� ���� 
		int helpLoop = 0; // �̿��� ������쿡 ���� �ʿ��ϸ� �����ֱ� ���� �ִ� ���� 
		
		System.out.println("������ ���� : "); // ������ ���̸� �Է¹��� 
		height = input.nextInt();
		System.out.println("������ �ʺ� : "); // ������ �ʺ� �Է¹��� 
		width = input.nextInt();
		
		// �簢�� ����
		System.out.println("�簢��");
		for (heightLoop = 1; heightLoop <= height; heightLoop++) {
			// �ʺ��� ũ�⸸ŭ �����ϰ� �Ʒ� �ٷ� ������ ������ �Է¹��� ���̸�ŭ �ݺ��� 
			for (widthLoop = 1; widthLoop <= width; widthLoop++) {
				System.out.print("*");	// �Է¹��� �ʺ�ŭ *�� ������ 
			}
				System.out.print("\n"); // *�� ������ ������ �Ʒ� �ٷ� ����
		}
		// �����ﰢ�� ����
		System.out.println("�����ﰢ��");
		for(heightLoop = 0 ; heightLoop < height ; heightLoop++) {
			// ���� �������Ѽ� ����ϰ� �Ʒ� �ٷ� ������ ������ �Է¹��� ���̸�ŭ �ݺ��� 
            for(widthLoop = 0 ; widthLoop <= heightLoop ; widthLoop++)
            	// �Է¹��� ������ ũ�⸸ŭ ���� �ϳ��� �߰��� �����
                System.out.print("*"); // �� ��� 
                System.out.println(); // �Ʒ� �ٷ� ���� 
        }
		// �̵�ﰢ�� ����
		System.out.println("�̵�ﰢ��");
		for(heightLoop = 0 ; heightLoop < height ; heightLoop++) {
			// �Է¹��� ���̸�ŭ ����, ��, �� �ٲ��� ������ �ݺ��� 
            for(widthLoop = heightLoop ; widthLoop <= height - 2; widthLoop++)
                System.out.print(" ");
            	// ���� - 1�� ���� ���ų� ���� �� ���� ������ �߰��� 
            for(helpLoop = 0; helpLoop <= ( heightLoop * 2 ); helpLoop++)
            	// heightLoop * 2�� ���� helpLoop�� ���� ���ų� ���� �� ���� *�� ����ϰ� ���� �ٲ� 
            	System.out.print("*"); // �� ��� 
             	System.out.println(); // �Ʒ� �ٷ� ���� 
		}
	    // ���ﰢ�� ���� 
		System.out.println("���ﰢ��");
		for (heightLoop = 0; heightLoop < height; heightLoop++) {
			// �Է¹��� ���̸�ŭ ����, ��, �� �ٲ��� ������ �ݺ���
            for (widthLoop = 0; widthLoop < heightLoop; widthLoop++)
                System.out.print(" ");
            	// heightLoop�� ���� widthLoop���� ���� �� ���� ������ ����� 
            for (helpLoop = 0; helpLoop <= ((height-heightLoop-1)*2); helpLoop++)
                System.out.print("*"); //�� ��� 
            	System.out.println(); // �Ʒ� �ٷ� ���� 
		} 
		// ���� �����ﰢ�� ����
		System.out.println("���� �����ﰢ��");
		for(widthLoop = 1; widthLoop <= width; widthLoop++) { 
			// �Է¹��� �ʺ� �� ��ŭ�� �غ��� ������ �ﰢ���� ���鵵�� �ݺ��� 
			for(heightLoop = 1; heightLoop <= widthLoop; heightLoop++) 
				//widthLoop�� ������ �۰ų� ���� �� ���� �ݺ��� 
				System.out.print(heightLoop);
				System.out.println();
				// heightLoop�� ���� widthLoop�� ������ �� ���� ���� ����ϰ� �Ʒ� �ٷ� ������ 
			}
		// ���� �����ﰢ�� ���� ( Ȧ���� ����� �ﰢ�� ��� )
		System.out.println("���� �����ﰢ�� (Ȧ��)");
		for(widthLoop = 1; widthLoop <= width; widthLoop++) { 
			// �Է¹��� �ʺ� �� ��ŭ�� �غ��� ������ �ﰢ���� ���鵵�� �ݺ��� 
			for(heightLoop = 1; heightLoop <= widthLoop; heightLoop++) {
				helpLoop = heightLoop * 2 - 1; 
				// heightLoop�� ���� 2�� ���ϰ� 1�� ���� ������� Ȧ���� ����� 
				// helpLoop�� �����Ŵ 
				System.out.print(helpLoop); // helpLoop�� Ȧ�� ���� ����� 
			}
			System.out.println(); // �Ʒ� �ٷ� ���� 
		}
		// ���� �迭 ����
		System.out.println("���� �迭");
		for(heightLoop = 0; heightLoop < height; heightLoop++) {
			// �Է¹��� ���̸�ŭ heightLoop�� ���� �ݺ��ؼ� ������Ŵ  
			for(widthLoop = 0; widthLoop < width; widthLoop++) {
				// �Է¹��� �ʺ�ŭ widthLoop�� ���� �ݺ��ؼ� ������Ŵ 
				System.out.print("["+heightLoop+"]"+"["+widthLoop+"]");
				// �����ϴ� ������ ����� 
				if (widthLoop == 4) {
					System.out.println(); // ���� widthLoop�� ���� 4�� �Ʒ� �ٷ� ����  
				}
			}
		}
	}
}