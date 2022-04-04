
/**
 * 프로그램 수정일자: 2019.04.08
 * 프로그램 설명: 사용자로부터 정수 10개를 입력받아 반복문을 이용해 배열에 저장하고 bubbleSort를 이용해 정렬한 뒤
 *            printArray 메서드를 이용해 출력하는 프로그램 , 키보드로부터 정수를 입력받아 배열에서 
 *            검색하고 배열내의 위치를 출력하는 프로그램 
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.04.11 AM 11:34
 */
import java.util.Scanner; // 키보드로부터 값을 입력받기 위해 불러옴 

public class Java7ThWeekProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] rdArr = new int[10]; // 10의 크기를 가지는 1차원 배열 선언

		int ipNum; // 배열에 입력할 값을 받아 저장하는 변수
		int ipNum2 = 0; // 찾을 정수를 입력받아 저장하는 변수
		int lp; // 반복문의 반복을 위한 변수
		int fdArr;
		
		for (lp = 0; lp < 10; lp++) { // 반복문을 10번 반복함
			System.out.print("[" + lp + "]번째 배열 값 입력 : "); // 총 10개의 배열 값을 입력받음
			rdArr[lp] = input.nextInt(); // 입력받은 배열 값을 rdArr의 배열에 저장함
		}
		bubbleSort(rdArr); // rdArr의 값을 bubbleSort 메서드에서 사용함
		printArray(rdArr); // rdArr의 값을 printArray 메서드에서 사용함

		System.out.print("찾으실 정수를 입력하십시오 : "); // 찾을 정수를 입력하라고 출력
		ipNum2 = input.nextInt(); // 입력받은 정수를 ipNum2에 저장
	
		fdArr = find(rdArr, ipNum2);
		
		System.out.print("찾으시는 정수의 위치는 " + fdArr + "입니다."); // 찾는 정수의 인덱스 값을 출력
	}

	public static void bubbleSort(int[] rdArr) { // 버블 정렬을 위한 메소드
		for (int lp = 0; lp < rdArr.length; lp++) { // rdArr의 크기만큼 반복
			for (int lp2 = 0; lp2 < rdArr.length - 1 - lp; lp2++) // rdArr의 크기만큼 반복
				if (rdArr[lp2] > rdArr[lp2 + 1]) { // 만약 앞의 요소 값이 뒤의 요소 값보다 크다면 
					int temp = rdArr[lp2]; // 큰 요소의 값을 temp에 넣고
					rdArr[lp2] = rdArr[lp2 + 1]; // 작은 요소의 값을 큰 요소의 인덱스에 넣는다
					rdArr[lp2 + 1] = temp; // 다시 큰 요소의 값을 temp에 넣는다 
				}
		}
	}

	public static void printArray(int[] rdArr) { // 출력을 위한 메소드
		for (int prtNum : rdArr) { // rdArr의 값을 prtNum에 넣음
			System.out.print(prtNum + " "); // rdArr의 값을 받은 prtNum을 출력함
		}
		System.out.println(); // 아랫 줄로 내림 
	}

	public static int find(int[] rdArr, int ipNum2) { // 찾는 정수의 인덱스 값을 반환하는 메소드
		int lp; // 반복문의 반복을 위한 변수
		int index = -1; //

		for (lp = 0; lp < 10; lp++) { // 반복문을 10번 반복
			if (ipNum2 == rdArr[lp]) { // 찾는 정수와 rdArr의 요소 값이 같다면
				index = lp; // 인덱스 값을 index 변수에 넣음
			}
		}
		return index; // 인덱스 값을 반환함
	}
}
