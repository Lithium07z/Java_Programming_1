/**
 * ���α׷� �ۼ�����: 2019.05.30
 * ���α׷� ����: ����ڷκ��� ���� ������ �ش��ϴ� ���۰� ���� �Է¹ް�  
 *            ���� ���� �ߺ����� �ʵ��� ������ ���� 5���� ����ϴ� ���α׷�
 * ���α׷� �ۼ���: 20195138 ����ȣ 
 * ���α׷� ���� ��������: 2019.05.31 AM 12:00
 */
import java.util.Scanner; // Ű����κ��� �Է¹ޱ� ���� �ҷ��� 
import java.util.Random; // ���� ���� ������ ���� �ҷ��� 

public class RandomOutputClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculate clc = new Calculate(); // Calculate Ŭ������ clc�̸����� ȣ�� �� ��� 
		
		System.out.println("���� ���� ������ �Է��Ͻÿ� "); // ���� ���� ������ �Է¹����� ��� 
		clc.makeRandom(input.nextInt(), input.nextInt()); // �Է¹��� �� ���� ���� Calculate Ŭ������ makeRandom�޼���� ����
		System.out.println("��� : " + clc.toString()); // ��� ����� ���Ϲ޾� ��� 
		
	}
}

class Calculate { // �Է¹��� ���� ���� ���� �������� �����ϴ� Ŭ���� 
	private int[] rNumber = new int[5]; // 5�� ���� ���� ������ �����迭 ����
	private String rString = ""; // ���� �迭�� ���ڿ��� ����� �����ϱ� ���� ���� ���� 
	
	public void makeRandom(int start, int end) { // �Է¹��� ���� ���� ������ �ߺ����� ������ �����ϱ� ���� �޼��� 
		Random rand = new Random(); // Random �Լ��� rand �̸����� ��� 
		for (int i = 0; i < 5; i++) { // 5�� �ݺ��ؼ�
			rNumber[i] = rand.nextInt(end+1); // �迭�� �������� ���� 
		}
		for (int j = 0; j < 5; j++) { // 5�� �ݺ�(�˻�)
			for (int k = 0; k < j; k++) { // 5�� �ݺ�(�˻�)
				if (rNumber[j] == rNumber[k]) { // ���� �˻� ���� ���� ���� �����Ѵٸ�
					rNumber[j] = rand.nextInt(end+1); // j��° �ε����� ���ο� ���� ���� ����
					j--; // �ݺ����� �ڷ� �̷� �ѹ� �� �����ν� ���� ���� ���� �ٽ� ��ġ�ϴ��� �˻�
				} else if (rNumber[j] < start || rNumber[k] < start) { // j��° �Ǵ� k ��° �ε��� ���� start���� �۴ٸ�
					rNumber[j] = rand.nextInt(end+1); // j��°�� ���ο� ���� ���� ���� 
					j--; // �ݺ����� �ڷ� �̷� �ѹ� �� �����ν� ���� ���� ���� �ٽ� ��ġ�ϴ��� �˻� 
				}
			}
		}
	}
	
	public String toString() { // ���� ������ ���ڿ��� �����ϱ� ���� �޼���
		for (int j = 0; j < 5; j++) { // 5�� �ݺ� 
			rString += rNumber[j] + " "; // �迭�� ����� 5�� ���� ������ ���ڿ��� �̾�ٿ� ����
		}
		return rString; // ����� ���� 
	}
}
