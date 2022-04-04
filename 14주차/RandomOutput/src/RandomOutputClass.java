/**
 * 프로그램 작성일자: 2019.05.30
 * 프로그램 설명: 사용자로부터 값의 범위에 해당하는 시작과 끝을 입력받고  
 *            범위 내에 중복되지 않도록 임의의 정수 5개를 출력하는 프로그램
 * 프로그램 작성자: 20195138 김준호 
 * 프로그램 최종 수정일자: 2019.05.31 AM 12:00
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 
import java.util.Random; // 랜덤 난수 생성을 위해 불러옴 

public class RandomOutputClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculate clc = new Calculate(); // Calculate 클래스를 clc이름으로 호출 및 사용 
		
		System.out.println("랜덤 정수 범위를 입력하시오 "); // 랜덤 정수 범위를 입력받음을 출력 
		clc.makeRandom(input.nextInt(), input.nextInt()); // 입력받은 두 정수 값을 Calculate 클래스의 makeRandom메서드로 전달
		System.out.println("결과 : " + clc.toString()); // 계산 결과를 리턴받아 출력 
		
	}
}

class Calculate { // 입력받은 정수 범위 안의 랜덤값을 리턴하는 클래스 
	private int[] rNumber = new int[5]; // 5개 난수 값을 저장할 정수배열 선언
	private String rString = ""; // 정수 배열을 문자열로 만들어 리턴하기 위한 변수 선언 
	
	public void makeRandom(int start, int end) { // 입력받은 정수 범위 내에서 중복없이 정수를 저장하기 위한 메서드 
		Random rand = new Random(); // Random 함수를 rand 이름으로 사용 
		for (int i = 0; i < 5; i++) { // 5번 반복해서
			rNumber[i] = rand.nextInt(end+1); // 배열에 랜덤값을 저장 
		}
		for (int j = 0; j < 5; j++) { // 5번 반복(검사)
			for (int k = 0; k < j; k++) { // 5번 반복(검사)
				if (rNumber[j] == rNumber[k]) { // 만약 검사 도중 같은 값이 존재한다면
					rNumber[j] = rand.nextInt(end+1); // j번째 인덱스에 새로운 랜덤 값을 저장
					j--; // 반복문을 뒤로 미뤄 한번 더 함으로써 새로 넣은 값이 다시 일치하는지 검사
				} else if (rNumber[j] < start || rNumber[k] < start) { // j번째 또는 k 번째 인덱스 값이 start보다 작다면
					rNumber[j] = rand.nextInt(end+1); // j번째에 새로운 랜덤 값을 저장 
					j--; // 반복문을 뒤로 미뤄 한번 더 함으로써 새로 넣은 값이 다시 일치하는지 검사 
				}
			}
		}
	}
	
	public String toString() { // 랜덤 정수를 문자열로 리턴하기 위한 메서드
		for (int j = 0; j < 5; j++) { // 5번 반복 
			rString += rNumber[j] + " "; // 배열에 저장된 5개 랜덤 정수를 문자열에 이어붙여 저장
		}
		return rString; // 결과값 리턴 
	}
}
