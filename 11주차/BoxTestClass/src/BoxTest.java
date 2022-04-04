/**
 * 프로그램 작성일자: 2019.05.06
 * 프로그램 설명: Box1, Box2 클래스의 부피와 정보를 출력하는 프로그램 
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.05.08 PM 09:45
 */
public class BoxTest {
	public static void main(String[] args) {
		Box1 bx1 = new Box1(); // Box1 클래스를 bx1이라는 이름으로 사용함 
		Box2 bx2 = new Box2(); // Box2 클래스를 bx2라는 이름으로 사용함 
		bx1.setWidth(10); // bx1 클래스의 setWidth 메서드에 10을  보냄 
		bx1.setHeight(10); // bx1 클래스의 setHeight 메서드에 10을 보냄 
		bx1.setLength(10); // bx1 클래스의 setLength 메서드에 10을 보냄 
		bx2.setWidth(5); // bx2 클래스의 setWidth 메서드에 5를  보냄 
		bx2.setHeight(5); // bx2 클래스의 setHeight 메서드에 5를 보냄
		bx2.setLength(5); // bx2 클래스의 setLength 메서드에 5를 보냄 
		System.out.println(bx1.toString() + "\n"+ bx1.getVolume() + bx2.toString() + "\n" + bx2.getVolume());
	}	// bx1, bx2 클래스의 toString 메서드가 리턴한 값과 getVolume이 리턴한 값을 출력 
}

class Box1 { // 10의 가로 세로 높이를 가지는 클래스
	private int Width; // 메서드를 통해서만 값을 받는 Width 변수 선언 
	private int Length; // 메서드를 통해서만 값을 받는 Length 변수 선언
	private int Height; // 메서드를 통해서만 값을 받는 Height 변수 선언
	private int volume; // 메서드를 통해서만 값을 받는 volume 변수 선언 
	
	public void setWidth(int Width) { // Width 변수에 값을 넣는 메서드
		this.Width = Width; // 받은 Width 값을 Box1 클래스의 Width에 저장 
	}
	public void setHeight(int Height) { // Height 변수에 값을 넣는 메서드
		this.Height = Height; // 받은 Height 값을 Box1 클래스의 Height에 저장 
	}
	public void setLength(int Length) { // Length 변수에 값을 넣는 메서드
		this.Length = Length; // 받은 Length 값을 Box1 클래스의 Length에 저장 
	}
	public int getWidth() {
		return Width; // Width 값을 리턴함 
	}
	public int getLength() {
		return Length; // Length 값을 리턴함
	}
	public int getHeight() {
		return Height; // Height 값을 리턴함 
	}
	public int getVolume() { // volume 값을 계산하고 리턴하는 메서드 
		volume = Width * Height * Length; // volume 값을 계산함 
		return volume; // 계산한 volume 값을 리턴함 
	}
	public String toString() { // Box1의 정보를  리턴하는 메서드 
		return "\nBox1 가로 :" + Width + "\nBox1 세로 :" + Length + "\nBox1 높이 :" + Height;
	}	// Box1의 정보를 모두 리턴함 
}

class Box2 { //5의 가로 세로 높이를 가지는 클래스
	private int Width; // 메서드를 통해서만 값을 받는 Width 변수 선언
	private int Length; // 메서드를 통해서만 값을 받는 Length 변수 선언
	private int Height; // 메서드를 통해서만 값을 받는 Height 변수 선언
	private int volume; // 메서드를 통해서만 값을 받는 volume 변수 선언 
	
	public void setWidth(int Width) { // Width 변수에 값을 넣는 메서드
		this.Width = Width; // 받은 Width 값을 Box2 클래스의 Width에 저장
	}
	public void setHeight(int Height) { // Height 변수에 값을 넣는 메서드
		this.Height = Height; // 받은 Height 값을 Box2 클래스의 Height에 저장
	}
	public void setLength(int Length) { // Length 변수에 값을 넣는 메서드
		this.Length = Length; // 받은 Length 값을 Box1 클래스의 Length에 저장 
	}
	public int getWidth() {
		return Width; // Width 값을 리턴함
	}
	public int getLength() {
		return Length; // Length 값을 리턴함
	}
	public int getHeight() {
		return Height; // Height 값을 리턴함
	}
	public int getVolume() { // volume 값을 계산하고 리턴하는 메서드
		volume = Width * Height * Length; // volume 값을 계산함 
		return volume; // 계산한 volume 값을 리턴함 
	}
	public String toString() { // Box2의 정보를  리턴하는 메서드 
		return "\nBox2 가로 :" + Width + "\nBox2 세로 :" + Length + "\nBox2 높이 :" + Height;
	}	// Box1의 정보를 모두 리턴함 
}