/**
 * ���α׷� �ۼ�����: 2019.05.06
 * ���α׷� ����: Box1, Box2 Ŭ������ ���ǿ� ������ ����ϴ� ���α׷� 
 * ���α׷� �ۼ���: 20195138 ����ȣ
 * ���α׷� ���� ��������: 2019.05.08 PM 09:45
 */
public class BoxTest {
	public static void main(String[] args) {
		Box1 bx1 = new Box1(); // Box1 Ŭ������ bx1�̶�� �̸����� ����� 
		Box2 bx2 = new Box2(); // Box2 Ŭ������ bx2��� �̸����� ����� 
		bx1.setWidth(10); // bx1 Ŭ������ setWidth �޼��忡 10��  ���� 
		bx1.setHeight(10); // bx1 Ŭ������ setHeight �޼��忡 10�� ���� 
		bx1.setLength(10); // bx1 Ŭ������ setLength �޼��忡 10�� ���� 
		bx2.setWidth(5); // bx2 Ŭ������ setWidth �޼��忡 5��  ���� 
		bx2.setHeight(5); // bx2 Ŭ������ setHeight �޼��忡 5�� ����
		bx2.setLength(5); // bx2 Ŭ������ setLength �޼��忡 5�� ���� 
		System.out.println(bx1.toString() + "\n"+ bx1.getVolume() + bx2.toString() + "\n" + bx2.getVolume());
	}	// bx1, bx2 Ŭ������ toString �޼��尡 ������ ���� getVolume�� ������ ���� ��� 
}

class Box1 { // 10�� ���� ���� ���̸� ������ Ŭ����
	private int Width; // �޼��带 ���ؼ��� ���� �޴� Width ���� ���� 
	private int Length; // �޼��带 ���ؼ��� ���� �޴� Length ���� ����
	private int Height; // �޼��带 ���ؼ��� ���� �޴� Height ���� ����
	private int volume; // �޼��带 ���ؼ��� ���� �޴� volume ���� ���� 
	
	public void setWidth(int Width) { // Width ������ ���� �ִ� �޼���
		this.Width = Width; // ���� Width ���� Box1 Ŭ������ Width�� ���� 
	}
	public void setHeight(int Height) { // Height ������ ���� �ִ� �޼���
		this.Height = Height; // ���� Height ���� Box1 Ŭ������ Height�� ���� 
	}
	public void setLength(int Length) { // Length ������ ���� �ִ� �޼���
		this.Length = Length; // ���� Length ���� Box1 Ŭ������ Length�� ���� 
	}
	public int getWidth() {
		return Width; // Width ���� ������ 
	}
	public int getLength() {
		return Length; // Length ���� ������
	}
	public int getHeight() {
		return Height; // Height ���� ������ 
	}
	public int getVolume() { // volume ���� ����ϰ� �����ϴ� �޼��� 
		volume = Width * Height * Length; // volume ���� ����� 
		return volume; // ����� volume ���� ������ 
	}
	public String toString() { // Box1�� ������  �����ϴ� �޼��� 
		return "\nBox1 ���� :" + Width + "\nBox1 ���� :" + Length + "\nBox1 ���� :" + Height;
	}	// Box1�� ������ ��� ������ 
}

class Box2 { //5�� ���� ���� ���̸� ������ Ŭ����
	private int Width; // �޼��带 ���ؼ��� ���� �޴� Width ���� ����
	private int Length; // �޼��带 ���ؼ��� ���� �޴� Length ���� ����
	private int Height; // �޼��带 ���ؼ��� ���� �޴� Height ���� ����
	private int volume; // �޼��带 ���ؼ��� ���� �޴� volume ���� ���� 
	
	public void setWidth(int Width) { // Width ������ ���� �ִ� �޼���
		this.Width = Width; // ���� Width ���� Box2 Ŭ������ Width�� ����
	}
	public void setHeight(int Height) { // Height ������ ���� �ִ� �޼���
		this.Height = Height; // ���� Height ���� Box2 Ŭ������ Height�� ����
	}
	public void setLength(int Length) { // Length ������ ���� �ִ� �޼���
		this.Length = Length; // ���� Length ���� Box1 Ŭ������ Length�� ���� 
	}
	public int getWidth() {
		return Width; // Width ���� ������
	}
	public int getLength() {
		return Length; // Length ���� ������
	}
	public int getHeight() {
		return Height; // Height ���� ������
	}
	public int getVolume() { // volume ���� ����ϰ� �����ϴ� �޼���
		volume = Width * Height * Length; // volume ���� ����� 
		return volume; // ����� volume ���� ������ 
	}
	public String toString() { // Box2�� ������  �����ϴ� �޼��� 
		return "\nBox2 ���� :" + Width + "\nBox2 ���� :" + Length + "\nBox2 ���� :" + Height;
	}	// Box1�� ������ ��� ������ 
}