import java.util.StringTokenizer; // ��Ʈ����ũ������ ����� ���� �ҷ��� 

public class StringTokenizerAndSplit {
	public static void main(String[] args) {
		String delims = ","; // ��Ʈ���� ���� ���ڸ� ���� 
		String splitString = " one, two, three, four, five"; // ������ ���ڿ� ���� 
		
		System.out.println("StringTokenizer Example: \n"); // ��Ʈ�� ���ø� ����� ������ �˸� 
		StringTokenizer st = new StringTokenizer(splitString, delims); // ���� ���ڿ��� ���� ���ڸ� �޴� ��Ʈ����ũ������ st�� ���� 
		while (st.hasMoreElements()) { // st�� ���� Elements�� ���� �� ���� �ݺ� 
			System.out.println("StringTokenizer Output: " + st.nextElement());
			// ���ڿ��� ,���� ������ �������� ��ū���� ��� 
		}
		System.out.println("\n\nSplit Example: \n"); // split���� ���ڿ��� ������ ��� 
		String[] tokens = splitString.split(delims); // splitString�� ���ڿ��� delims���ڷ� ������ ���ڿ� �迭 tokens�� ����
		int tokenCount = tokens.length; // tokens �迭�� ���� ���� tokenCount�� ���� 
		for (int j = 0; j < tokenCount; j++) { // tokenCount�� ũ�⸸ŭ �ݺ� 
			System.out.println("Split Output " + tokens[j]);
			// split���� ���� ���ڿ��� ��ū���� ��� 
		}
	}
}
