/**
 * ���α׷� �ۼ�����: 2019.05.29
 * ���α׷� ����: �Ѹ����б� Ȩ������ URL�� StringTokenizer�� �̿��� ������ ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.05.29
 */
import java.util.StringTokenizer; // StringTokenizer�� ����� 

public class StringTokenizerURL { // URL�� StringTokenizer�� �̿��� ������ Ŭ���� 
	public static void main(String[] args) {
		StringTokenizer url = new StringTokenizer("http://www.hallym.ac.kr", ":// .");
		// ://�� . delim ���� ���ڷ� http://www.hallym.ac.kr�� ���� 
		while (url.hasMoreTokens()) { // ���� ��ū�� �ִٸ�
			System.out.println(url.nextToken()); // ���� ��ū�� ��� 
		}	
	}
}
