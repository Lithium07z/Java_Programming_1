/*
 * 프로그램 작성일자: 2019.03.26
 * 프로그램 설명: 1부터 50까지 숫자를 for문으로 출력하되 if 문을 이용해 
 *            3의 배수 또는 5의 배수는 * 로 출력하는 프로그램
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.26 PM 06:01
 */
public class Java5ThWeekProject4 {
	public static void main(String[] args) {
		int allNumber; // 1부터 반복해서 1씩 더한 값을 저장할 변수 
		
		for (allNumber = 1; allNumber <= 50; allNumber++) {
			// allNumber에 1을 대입하고 50과 같거나 작을때까지 1씩 더하는 것을 반복 
			if (allNumber % 3 == 0 ) { 
				System.out.print("*"); 
				// 만약 1씩 더하던 중 3으로 나누었을때 나머지가 0인 경우 *로 출력
			}
				else if (allNumber % 5 == 0) {
					System.out.print("*");
					// 만약 1씩 더하던 중 5으로 나누었을때 나머지가 0인 경우 *로 출력
				}
				else {
					System.out.print(allNumber);
					// 3과 5로 나누는 경우 이외에는 모두 출력 
				}
			
		}
	}

}
