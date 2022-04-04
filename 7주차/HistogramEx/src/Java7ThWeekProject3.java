/**
 * 프로그램 작성일자: 2019.04.08
 * 프로그램 설명: 반복문과 Math.Random 메서드를 이용해 0부터 9사이의 랜덤 값으로  10의 크기를 가지는
 *            배열을 초기화하고 반복문을 이용해 배열의 인덱스와 값 그리고 해당 값만큼의 #를 출력하는 프로그램
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.08 PM 09:49
 */
public class Java7ThWeekProject3 {
	public static void main(String[] args) {
		int [] rdArr = new int [10]; // 10의 크기를 가지는 배열을 생성 
		int lp; // 반복문을 구현하기 위한 변수 
		int lp2; // 반복문을 구현하기 위한 변수 
		int lp3; // 반복문을 구현하기 위한 변수 
		int lp4; // 반복문을 구현하기 위한 변수 
		
		for(lp = 0; lp < 10; lp++) { // 반복문을 10번 반복 
			rdArr[lp] = (int)(Math.random() * 10); 
			// 0 ~ 9 까지의 무작위 정수를 생성해 배열에 넣음 
		}
		for (lp2 = 0; lp2 < 10; lp2++) { // 반복문을 10번 반복
			if (lp2 == 9) { // 만약 lp2의 값이 9라면 
				lp2 = lp2 - 9; // lp2의 값을 0으로 만든다
				System.out.print("["+lp2+"]"+" - "+rdArr[lp2]+" : "); 
				// 인덱스 값과 요소 값을 출력함 
				for (lp3 = 0; lp3 < rdArr[lp2]; lp3++) { 
					// 요소 값 만큼 반복문을 반복함 
					System.out.print("#"); // #을 출력함 , 따라서 요소 값 만큼 #을 출력하게됨 
				}
				break; // if문 중단 
			}else // lp2가 9가 아닌 이외의 경우 
				System.out.print("["+lp2+"]"+" - "+rdArr[lp2]+" : ");
			// 인덱스 값과 요소 값을 출력함 
			for (lp4 = 0; lp4 < rdArr[lp2]; lp4++) {
				// 요소 값 만큼 반복문을 반복함 
				System.out.print("#"); // #을 출력함 , 따라서 요소 값 만큼 #을 출력하게됨 
			}
			System.out.println(); // 줄 바꿈 
		}
	}
}