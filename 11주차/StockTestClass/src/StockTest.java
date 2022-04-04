/**
 * 프로그램 작성일자: 2019.05.09
 * 프로그램 설명: 두 제품과 재고갯수를 저장하고 그 중 더 많은 제품을 출력한 뒤, 출고할 제품을 골라 일정량 출고하는 프로그램 
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.05.09 PM 06:51
 */
import java.util.Scanner; // 키보드로부터 입력받기 위해 불러옴 
public class StockTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choose; // 출고할 제품을 고르기 위한 변수 
		Stock stk1 = new Stock(); // stock 클래스를 stk1의 이름으로 사용
		Stock stk2 = new Stock(); // stock 클래스를 stk2의 이름으로 사용 
		
		System.out.println("제품을 입력하세요 : "); // 첫 번째 제품을 입력받음 
		stk1.setProduct(input.next());
		System.out.println("재고를 입력하세요 : "); // 첫 번째 제품의 재고수량을 입력받음
		stk1.setStock(input.nextInt());
		System.out.println("제품을 입력하세요 : "); // 두 번째 제품을 입력받음
		stk2.setProduct(input.next());
		System.out.println("재고를 입력하세요 : "); // 두 번째 제품의 재고수량을 입력받음
		stk2.setStock(input.nextInt());
		stk1.getStockNumber(); // stk1의 getStockNumber를 사용함
		stk2.getStockNumber(); // stk2의 getStockNumber를 사용함
		
		if(stk1.getStockNumber() > stk2.getStockNumber()) { // stk1의 재고가 stk2보다 많다면
			System.out.println(stk1.toString()); // stk1의 제품, 재고 정보를 출력
		} else if (stk1.getStockNumber() < stk2.getStockNumber()) { 
			// stk2의 재고가 stk1보다 많다면
			System.out.println(stk2.toString()); // stk2의 제품, 재고 정보를 출력
		} else {
			System.out.println("두 제품의 재고가 " + stk1.getStockNumber() + "(으)로 동일합니다.");
			// 두 제품의 재고가 동일하면 두 제품의 재고가 동일함을 출력 
		}
		
		
		System.out.println("출고할 제품을 선택하세요\n1번 \n2번\n입력 :" ); // 출고할 제품을 입력받음
		choose = input.nextInt();
		if (choose == 1) { // 1번이 입력되면 
			System.out.println("출고할 갯수를 입력하세요 : "); // stk1 제품의 출고량을 입력받음 
			stk1.releaseStock(input.nextInt());
			System.out.println("남은 재고 : " + stk1.getStockNumber()); // 남은 재고량을 출력함
		} else if (choose == 2) { // 2번이 입력되면
			System.out.println("출고할 갯수를 입력하세요 : ");  // stk2 제품의 출고량을 입력받음 
			stk2.releaseStock(input.nextInt());
			System.out.println("남은 재고 : " + stk2.getStockNumber()); // 남은 재고량을 출력함 
		} else {
			System.out.println("선택할 수 없는 제품입니다."); // 이외의 번호가 입력되면 선택할 수 없음을 출력
		}
	}
}

class Stock { // 제품 정보를 저장하는 클래스 
	private String product; // 메서드를 통해서만 제품을 입력받는 변수
	private int stock; // 메서드를 통해서만 재고량을 입력받는 변수 
	
	public void setProduct(String product) { // 입력받은 제품을 Stock클래스에 저장하는 메서드
		this.product = product; // 입력받은 제품을 Stock 클래스의 product에 저장함
	}
	public void setStock(int stock) { // 입력받은 재고를 Stock클래스에 저장하는 메서드 
		this.stock = stock; // 입력받은 재고를 Stock클래스의 stock에 저장함 
	}
	public int getStockNumber() { // 남은 재고량을 리턴하는 메서드
		return stock; // 재고량을 리턴함
	}
	public String toString() { // 제품 정보를 리턴하는 메서드
		return "물건 : " + this.product + "\n재고 : " + stock; // 제품, 재고량 리턴
	}
	public void releaseStock(int stock) { // 재고를 출고하는 메서드
		if(this.stock < stock) { // 입력받은 출고량이 재고보다 많은 경우 
			System.out.println("재고보다 많은 양은 출고할 수 없습니다."); // 출고가 불가능함을 출력함
		} else { // 입력받은 출고량이 재고와 같거나 그보다 적은 경우
			this.stock -= stock; // 기존 재고에서 출고량을 뺌
		}
	}
}