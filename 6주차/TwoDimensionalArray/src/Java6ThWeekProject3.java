/**
 * 프로그램 수정일자: 2019.04.01  
 * 프로그램 설명: 임의의 랜덤 값을 가지는 2차원 배열을 선언하고 초기화 하고 
 *            출력을 위한 printTwoDim메서드를 만들어 이 메서드를 이용해 출력하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.04.02 PM 11:49
 */
public class Java6ThWeekProject3 {
	public static void main(String[] args) {
		int [][]arr = {{ 4, 2, 1, 2, 3, 4, 5, 6, 7, 8 }, // 2차원 배열을 선언과 동시에 초기화함 
		               { 1, 2, 4, 3, 5, 2, 6, 7, 8, 9 },
		               { 3, 2, 4, 5, 2, 3, 4, 5, 3, 1 }};
		      printTwoDim(arr); // arr배열을 printTwoDim 메서드에서 사용함 
		   }
	public static void printTwoDim (int[][] arr) {
		int helpL; // 배열의 세로 반복을 위한 변수  
		int helpL2; // 배열의 가로 반복을 위한 변수 
		
		for(helpL = 0; helpL < arr.length; helpL++) {
			// arr배열의 행 값 만큼 반복
			for(helpL2 = 0; helpL2 < arr[helpL].length; helpL2++) {
				// arr배열의 열 값 만큼 반복 
				System.out.print(arr[helpL][helpL2]+" ");
				// arr배열의 행, 열 값을 토대로 값을 출력함 
			}
		        System.out.println(); // 아랫줄로 내림  
		}
	}
}