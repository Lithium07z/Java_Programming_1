/**
 * 프로그램 작성일자: 2019.04.25
 * 프로그램 설명: 임의의 값을 가지는 2차원 배열을 선언하고 초기화 하고 출력을 위한 printTwoDim메서드를 만들어 
 *            출력하는 프로그램
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.25
 *
 */
public class Java9ThWeekProjectArr3 {
	public static void main(String[] args) {
		
		int[][] arr = {{4, 2, 1, 2, 3, 4, 5, 6, 7, 8}, // 2차원 배열 선언 
						{1, 2, 4, 3, 5, 2, 6, 7, 8, 9},
						{3, 2, 4, 5, 2, 3, 4, 5, 3, 1}};
		printTwoDim(arr); // arr을 printTwoDim 메서드에서 사용함 
	}
	public static void printTwoDim(int[][] arr) {
		int i; // 반복문을 위한 변수 선언
		int j; // 반복문을 위한 변수 선언
		
		for(i = 0; i < arr.length; i++) { // i가 arr 행의 크기보다 작을 때 까지 반복 
			for(j = 0; j < arr[i].length; j++) { // j가 arr 열의 크기보다 작을 때 까지 반복 
				System.out.print(arr[i][j] + " "); // 2차원 배열을 출력 
			}
			System.out.println(); // 열이 끝날 때 마다 아랫 줄로 내림 
		}
	}

}
