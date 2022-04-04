package myclass.lang;

public class MyString { 
	StringBuffer Arr = new StringBuffer(); // Arr의 이름을 갖는 StringBuffer 생성 
	char[] strs; // 문자열을 문자로 만들어 넣을 배열 샐성 
	MyString(String str) {
		strs = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			 strs[i] = str.charAt(i);
		}
	}
	
	public int length() { // 배열 길이를 리턴하는 메서드 
		return strs.length; // 배열길이 리턴 
	}
	public char charAt(int index) { // 문자열의 index위치 문자를 리턴하는 메서드 
		if (index > strs.length) { // 받은 인덱스 값이 배열 길이보다 길 경우 
			System.out.println("인덱스 값이 배열의 길이보다 큽니다."); // 오류 출력 
			return '-'; // 리턴 - 
		} else { // 아니면 
			char iArr = strs[index]; // strs 배열의 인덱스 위치 문자를 iArr에 저장 
			return iArr; // iArr 리턴 
		}
	}
	public String subString(int start,int end) { 
		// 배열의 start 인덱스부터 end 인덱스까지의 부분 문자열을 리턴하는 메서드 
		if (end > strs.length) { // 마지막 값이 배열의 길이보다 크면 
			System.out.println("ERROR : 마지막 값이 배열의 길이보다 깁니다."); // 오류 리턴 
		}
		for (int j = start; j <= end; j++) { // start부터 end 까지 반복 
			Arr.append(strs[j]); // Arr에 strs start 값부터 붙임 
		}
		return Arr.toString(); // Arr을 toString으로 만들어 리턴 
	}
	public String reverse() { // 문자열을 역으로 만들어 리턴하는 메서드 
		Arr.delete(0, strs.length); // Arr의 0부터 기존 배열의 길이까지를 초기화 
		for (int k = strs.length-1; k >= 0; k--) { // 문자열 길이 -1 부터 0이 될때까지 반복 
			Arr.append(strs[k]); // Arr에 이어붙임
		}
		return Arr.toString(); // Arr을 toString으로 만들어 리턴 
	}
}
