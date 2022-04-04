package myclass.lang;

public class MyString { 
	StringBuffer Arr = new StringBuffer(); // Arr�� �̸��� ���� StringBuffer ���� 
	char[] strs; // ���ڿ��� ���ڷ� ����� ���� �迭 ���� 
	MyString(String str) {
		strs = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			 strs[i] = str.charAt(i);
		}
	}
	
	public int length() { // �迭 ���̸� �����ϴ� �޼��� 
		return strs.length; // �迭���� ���� 
	}
	public char charAt(int index) { // ���ڿ��� index��ġ ���ڸ� �����ϴ� �޼��� 
		if (index > strs.length) { // ���� �ε��� ���� �迭 ���̺��� �� ��� 
			System.out.println("�ε��� ���� �迭�� ���̺��� Ů�ϴ�."); // ���� ��� 
			return '-'; // ���� - 
		} else { // �ƴϸ� 
			char iArr = strs[index]; // strs �迭�� �ε��� ��ġ ���ڸ� iArr�� ���� 
			return iArr; // iArr ���� 
		}
	}
	public String subString(int start,int end) { 
		// �迭�� start �ε������� end �ε��������� �κ� ���ڿ��� �����ϴ� �޼��� 
		if (end > strs.length) { // ������ ���� �迭�� ���̺��� ũ�� 
			System.out.println("ERROR : ������ ���� �迭�� ���̺��� ��ϴ�."); // ���� ���� 
		}
		for (int j = start; j <= end; j++) { // start���� end ���� �ݺ� 
			Arr.append(strs[j]); // Arr�� strs start ������ ���� 
		}
		return Arr.toString(); // Arr�� toString���� ����� ���� 
	}
	public String reverse() { // ���ڿ��� ������ ����� �����ϴ� �޼��� 
		Arr.delete(0, strs.length); // Arr�� 0���� ���� �迭�� ���̱����� �ʱ�ȭ 
		for (int k = strs.length-1; k >= 0; k--) { // ���ڿ� ���� -1 ���� 0�� �ɶ����� �ݺ� 
			Arr.append(strs[k]); // Arr�� �̾����
		}
		return Arr.toString(); // Arr�� toString���� ����� ���� 
	}
}
