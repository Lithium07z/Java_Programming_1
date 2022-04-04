/**
 * 프로그램 작성일자: 2019.04.08
 * 프로그램 설명: 사용자로부터 시작값과 끝값을 입력받아 시작값부터 끝값까지 출력하는 프로그램,
 *            argument로부터 밑수와 승수를 입력받아 값을 계산하는 프로그램 
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.11 AM 12:07
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 
public class Java7ThWeekProject4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int stNum; // 입력받은 시작값을 저장하는 변수 
		int fiNum; // 입력받은 끝 값을 저장하는 변수 
		int lp; // 반복문의 반복을 위한 변수 
		int rlt = 1; // 결과를 저장하는 변수 
		
		System.out.print("시작값 : "); // 시작값을 입력받음 
		stNum = input.nextInt(); // 입력받은 값을 stNum에 저장 
		System.out.print("끝 값 : "); // 끝 값을 입력받음 
		fiNum = input.nextInt(); // 입력받은 값을 fiNum에 저장 
		
		for(lp = stNum; lp <= fiNum; lp++) { 
			// stNum의 크기부터 fiNum의 크기보다 작거나 같을때 까지 반복
			System.out.print(lp+" "); // 시작값과 끝값 사이의 값을 모두 출력 
		}
		System.out.println(); // 아랫 줄로 내림 
		
		String mNum = args[0]; // argument에서 입력받은 값을 mNum에 저장
		String sNum = args[1]; // argument에서 입력받은 값을 sNum에 저장 
		
		int trsNum = Integer.parseInt(mNum); // mNum에 저장된 문자열 값을 정수형으로 변환 
		int trsNum2 = Integer.parseInt(sNum); // sNum에 저장된 문자열 값을 정수형으로 변환 
		
		for (int lp2 = 1; lp2 <= trsNum2; lp2++) { // trsNum2와 같거나 작을때 까지 반복 
			rlt *= trsNum; // rlt에 trsNum의 값을 곱해 누적시킴 
		}
		System.out.println("결과 : "+mNum+" ^ "+sNum+" = "+rlt); // 제곱 결과를 출력 
		
	}

}