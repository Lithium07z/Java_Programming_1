
/**
 * 프로그램 작성일자: 2019.04.01  
 * 프로그램 설명: main 메서드에서 1부터 10까지의 값을 가지는  1차원 배열을 선언과 동시에 초기화하고 
 *            출력을 위한 printOneDim메서드를 만들어 이 메서드를 이용해 출력하는 프로그램 
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.04.02 PM 11:49
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 

public class Java6ThWeekProject2 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		printOneDim(arr); // arr배열의 값을 printOneDim 메서드에서 사용함
		int indx; // find 메서드에서의 index 값을 받는 변수 
		indx = find(arr); // arr배열의 값을 find 메서드에서 사용함 
		if(indx == -1) { // index의 값이 -1이라면
			System.out.println("숫자를 찾지 못했습니다. "); // 숫자를 찾지 못했음을 출력
		} else  // index의 값이 -1이 아니라면
			System.out.println("찾으시는 숫자의 위치는 "+indx+"입니다.");;
			// 찾는 숫자의 인덱스를출력함 
		int ttal; // sumArray 메서드에서의 total 값을 받는 변수 
		ttal = sumArray(arr); // arr배열의 값을 sumArray 메서드에서 사용함
		System.out.println("배열의 총 합은 " + ttal + "입니다.");
		// 배열의 총 합을 출력함
		
	}

	public static void printOneDim(int[] copyMethod) { // 출력하기 위한 메서드
		// main메서드 에서의 printOneDim의 값을 copyMethod에 전달하고 저장함
		int loop; // 반복문을 실행시키기 위한 변수
		for (loop = 0; loop < copyMethod.length; loop++) {
			// copyMethod의 배열 크기보다 작을 때 까지 반복함
			System.out.print(copyMethod[loop] + " ");
			// copyMethod배열의 요소 값들을 출력함
		}
		System.out.println(); // 아랫 줄로 내림
	}

	public static int find(int[] copyMethod) {
		Scanner input = new Scanner(System.in);
		int inputNum; // 입력받은 숫자를 저장할 변수
		int loop; // 반복문을 실행시키기 위한 변수
		int index = -1; // 숫자를 찾지 못했을 경우를 위한 변수 
		System.out.print("찾으실 숫자를 입력하십시오 : "); // 배열에서 찾을 숫자를 입력받음
		inputNum = input.nextInt();
		for (loop = 0; loop < copyMethod.length; loop++) {
			// copyMethod배열의 크기보다 작을 때 까지 반복함

			if (inputNum == copyMethod[loop]) {
				// 입력한 숫자와 copyMethod배열 내의 숫자가 같다면
				index = loop; // loop 값을 index에 저장함 
			}
		}
		return index; // index값을 반환함 
	}

	public static int sumArray(int[] copyMethod) {
		int loop; // 반복문을 실행시키기 위한 변수
		int total = 0; // 배열의 총 합을 저장하기 위한 변수

		for (loop = 0; loop < copyMethod.length; loop++) {
			// copyMethod배열의 크기보다 작을 때 까지 반복함
			total += copyMethod[loop];
			// copyMethod배열의 요소 값들을 모두 꺼내어 total에 더해 누적시킴
		}
		return total;
	}
}
