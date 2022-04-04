/**
 * 프로그램 작성일자: 2019.04.24
 * 프로그램 설명: Student 클래스를 생성하기위한 main 메소드를 가지는 StudentEx 클래스를 작성하고 
 *            3명의 학생객체를 생성하고 각각의 정보를 저장하고 출력하는 프로그램
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.29 PM 09:30
 */
import java.io.*;

	class Student{ // 학생정보를 저장하는 클래스
		private String student_No; // 메서드를 통해서만 학번을 받는 변수
		private String student_Name; // 메서드를 통해서만 학생 이름을 받는 변수
		private int grade; // 메서드를 통해서만 학년을 받는 변수
		private String dept; // 메서드를 통해서만 학과를 받는 변수 

		public String getStudent_No() {
			return student_No; // 학번을 리턴함 
		}
		public String getStudent_Name() {
			return student_Name; // 이름을 리턴함 
		}
		public int getGrade() {
			return grade; // 학년을 리턴함 
		}
		public String getDept() {
			return dept; // 전공을 리턴함 
		}
		public void setStudent_No(String student_No) {
			// Java9ThWeekProject 클래스에서 학번을 받아 Student 클래스의 student_No에 저장하는 메서드
			this.student_No = student_No; 
			// Java9ThWeekProject 클래스에서 받은 학번을 Student 클래스의 student_No에 저장함
		}
		public void setStudent_Name(String student_Name) {
			// Java9ThWeekProject 클래스에서 이름을 받아 Student 클래스의 student_Name에 저장하는 메서드
			this.student_Name = student_Name;
			// Java9ThWeekProject 클래스에서 받은 이름을 Student 클래스의 student_Name에 저장함
		}
		public void setGrade(int grade) {
			// Java9ThWeekProject 클래스에서 학년을 받아 Student 클래스의 grade에 저장하는 메서드
			this.grade = grade;
			// Java9ThWeekProject 클래스에서 받은 학년을 Student 클래스의 grade에 저장함
		}
		public void setDept(String dept) {
			// Java9ThWeekProject 클래스에서 학과를 받아 Student 클래스의 dept에 저장하는 메서드
			this.dept = dept;
			// Java9ThWeekProject 클래스에서 받은 학과를 Student 클래스의 dept에 저장함
		}
		
		public String toString(){ // 출력을 위한 메서드
			return "학번: " + student_No + "\n이름: " + student_Name + "\n학년: " + grade + "\n학과: " + dept;
		} // 학번, 이름, 학년, 학과를 리턴함 
	}
		
class Java9ThWeekProject {
		public static void main(String[] args) {
			Student str1 = new Student(); // Student 클래스를 사용함 
			str1.setStudent_No("20195138"); // setStudent_No 메서드에 값을 줌 
	        str1.setStudent_Name("김준호"); // setStudent_Name 메서드에  값을 줌 
	        str1.setGrade(1); // setGrade 메서드에 값을 줌 
	        str1.setDept("소프트웨어융합대학"); // setDept 메서드에 값을 줌 
			System.out.println( str1.toString() ); // toString을 출력함 
			
		}
	}