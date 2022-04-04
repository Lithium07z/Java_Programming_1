/*
 * 프로그램 작성일자: 2019.03.26  
 * 프로그램 설명: 사용자로부터 높이와 너비를 입력받아 중첩된 반복문을
 *            이용해서 여러 패턴들을 출력하는 프로그램 
 * 프로그램 작성자: 김준호
 * 프로그램 최종 수정일자: 2019.03.28 PM 09:00
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴
public class Java5ThWeekProject6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height; // 도형의 높이를 저장하는 변수 
		int width; // 도형의 너비를 저장하는 변수 
		int heightLoop; // 반복할 때 도형의 높이와 관련되어있으면 사용하는 변수
		int widthLoop; // 반복할 때 도형의 너비와 관련되어 있으면 사용하는 변수 
		int helpLoop = 0; // 이외의 여러경우에 따라 필요하면 도와주기 위해 있는 변수 
		
		System.out.println("도형의 높이 : "); // 도형의 높이를 입력받음 
		height = input.nextInt();
		System.out.println("도형의 너비 : "); // 도형의 너비를 입력받음 
		width = input.nextInt();
		
		// 사각형 패턴
		System.out.println("사각형");
		for (heightLoop = 1; heightLoop <= height; heightLoop++) {
			// 너비의 크기만큼 나열하고 아래 줄로 내리는 과정을 입력받은 높이만큼 반복함 
			for (widthLoop = 1; widthLoop <= width; widthLoop++) {
				System.out.print("*");	// 입력받은 너비만큼 *을 나열함 
			}
				System.out.print("\n"); // *의 나열이 끝나면 아랫 줄로 내림
		}
		// 직각삼각형 패턴
		System.out.println("직각삼각형");
		for(heightLoop = 0 ; heightLoop < height ; heightLoop++) {
			// 별을 증가시켜서 출력하고 아래 줄로 내리는 과정을 입력받은 높이만큼 반복함 
            for(widthLoop = 0 ; widthLoop <= heightLoop ; widthLoop++)
            	// 입력받은 높이의 크기만큼 별을 하나씩 추가해 출력함
                System.out.print("*"); // 별 출력 
                System.out.println(); // 아랫 줄로 내림 
        }
		// 이등변삼각형 패턴
		System.out.println("이등변삼각형");
		for(heightLoop = 0 ; heightLoop < height ; heightLoop++) {
			// 입력받은 높이만큼 공백, 별, 줄 바꿈의 과정을 반복함 
            for(widthLoop = heightLoop ; widthLoop <= height - 2; widthLoop++)
                System.out.print(" ");
            	// 높이 - 1의 값과 같거나 작을 때 까지 공백을 추가함 
            for(helpLoop = 0; helpLoop <= ( heightLoop * 2 ); helpLoop++)
            	// heightLoop * 2의 값이 helpLoop의 값과 같거나 작을 때 까지 *을 출력하고 줄을 바꿈 
            	System.out.print("*"); // 별 출력 
             	System.out.println(); // 아랫 줄로 내림 
		}
	    // 역삼각형 패턴 
		System.out.println("역삼각형");
		for (heightLoop = 0; heightLoop < height; heightLoop++) {
			// 입력받은 높이만큼 공백, 별, 줄 바꿈의 과정을 반복함
            for (widthLoop = 0; widthLoop < heightLoop; widthLoop++)
                System.out.print(" ");
            	// heightLoop의 값이 widthLoop보다 작을 때 까지 공백을 출력함 
            for (helpLoop = 0; helpLoop <= ((height-heightLoop-1)*2); helpLoop++)
                System.out.print("*"); //별 출력 
            	System.out.println(); // 아랫 줄로 내림 
		} 
		// 숫자 직각삼각형 패턴
		System.out.println("숫자 직각삼각형");
		for(widthLoop = 1; widthLoop <= width; widthLoop++) { 
			// 입력받은 너비 값 만큼의 밑변을 가지는 삼각형을 만들도록 반복함 
			for(heightLoop = 1; heightLoop <= widthLoop; heightLoop++) 
				//widthLoop의 값보다 작거나 같을 때 까지 반복함 
				System.out.print(heightLoop);
				System.out.println();
				// heightLoop의 값이 widthLoop와 같아질 때 까지 값을 출력하고 아랫 줄로 내려감 
			}
		// 숫자 직각삼각형 패턴 ( 홀수만 사용해 삼각형 출력 )
		System.out.println("숫자 직각삼각형 (홀수)");
		for(widthLoop = 1; widthLoop <= width; widthLoop++) { 
			// 입력받은 너비 값 만큼의 밑변을 가지는 삼각형을 만들도록 반복함 
			for(heightLoop = 1; heightLoop <= widthLoop; heightLoop++) {
				helpLoop = heightLoop * 2 - 1; 
				// heightLoop의 값에 2를 곱하고 1을 빼는 방법으로 홀수를 만들고 
				// helpLoop에 저장시킴 
				System.out.print(helpLoop); // helpLoop의 홀수 값을 출력함 
			}
			System.out.println(); // 아랫 줄로 내림 
		}
		// 숫자 배열 패턴
		System.out.println("숫자 배열");
		for(heightLoop = 0; heightLoop < height; heightLoop++) {
			// 입력받은 높이만큼 heightLoop의 값을 반복해서 증가시킴  
			for(widthLoop = 0; widthLoop < width; widthLoop++) {
				// 입력받은 너비만큼 widthLoop의 값을 반복해서 증가시킴 
				System.out.print("["+heightLoop+"]"+"["+widthLoop+"]");
				// 증가하는 값들을 출력함 
				if (widthLoop == 4) {
					System.out.println(); // 만약 widthLoop의 값이 4면 아랫 줄로 내림  
				}
			}
		}
	}
}