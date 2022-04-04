/**
 * 프로그램 작성일자: 2019.04.25
 * 프로그램 설명: 임의의 두 행렬을 2차원 배열로 선언과 동시에 초기화하고 두 행렬의 합을 배열로 저장하고 출력하는 프로그램
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.25 PM 12:36
 */
public class Java9ThWeekProjectArr5 {
	public static void main(String[] args) {
		int[][] fArr = {{1, 5, 6}, // 행렬 A를 선언과 동시에 초기화 
						{9, 2, 4},
						{8, 7, 3}};
		int[][] sArr = {{3, 4, 9}, // 행렬 B를 선언과 동시에 초기화 
						{2, 5, 8},
						{1, 6, 7}};
		int[][] cArr = new int [3][3]; // 두 행렬의 합을 저장하고 출력할 배열을 선언
		
		for(int i = 0; i < fArr.length; i++) { // i가 fArr 배열의 행의 크기보다 작을 때 까지 반복
			for(int j = 0; j < fArr[i].length; j++) { // j가 fArr 배열의 열의 크기보다 작을 때 까지 반복
				cArr[i][j] = fArr[i][j] + sArr[i][j];
			}
		}
		for(int k = 0; k < fArr.length; k++) { // k가 fArr 배열의 행의 크기보다 작을 때 까지 반복
			for(int l = 0; l < fArr[k].length; l++) { // l이 fArr 배열의 열의 크기보다 작을 때 까지 반복
				System.out.print(cArr[k][l] + " "); // cArr의 값을 출력 
			}
			System.out.println(); // 매 열의 출력이 끝나면 아랫 줄로 내림 
		}
	}

}
