/**
 * 프로그램 작성일자: 2019.04.29
 * 프로그램 설명: 3명의 학생객체를 생성하고 각각의 정보를 저장하고 출력하는 프로그램
 * 프로그램 작성자: 20195138 김준호
 * 프로그램 최종 수정일자: 2019.04.29 PM 09:49
 */
import java.io.*;

	class Student1{
		private String student_No;
		private String student_Name;
		private int grade;
		private String dept;

		public String student_No() {
			return student_No;
		}
		public String student_Name() {
			return student_Name;
		}
		public int grade() {
			return grade;
		}
		public String dept() {
			return dept;
		}
		public void setStudent_No(String student_No) {
			this.student_No = student_No;
		}
		public void setStudent_Name(String student_Name) {
			this.student_Name = student_Name;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
		public String toString(){
			return "학번: " + student_No + "\n이름: " + student_Name + "\n학년: " + grade + "\n학과: " + dept;
		}
	}
	class Student2{
		private String student_No;
		private String student_Name;
		private int grade;
		private String dept;

		public String student_No() {
			return student_No;
		}
		public String student_Name() {
			return student_Name;
		}
		public int grade() {
			return grade;
		}
		public String dept() {
			return dept;
		}
		public void setStudent_No(String student_No) {
			this.student_No = student_No;
		}
		public void setStudent_Name(String student_Name) {
			this.student_Name = student_Name;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
		public String toString(){
			return "\n학번: " + student_No + "\n이름: " + student_Name + "\n학년: " + grade + "\n학과: " + dept;
		}
	}
	class Student3{
		private String student_No;
		private String student_Name;
		private int grade;
		private String dept;

		public String student_No() {
			return student_No;
		}
		public String student_Name() {
			return student_Name;
		}
		public int grade() {
			return grade;
		}
		public String dept() {
			return dept;
		}
		public void setStudent_No(String student_No) {
			this.student_No = student_No;
		}
		public void setStudent_Name(String student_Name) {
			this.student_Name = student_Name;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
		public String toString(){
			return "\n학번: " + student_No + "\n이름: " + student_Name + "\n학년: " + grade + "\n학과: " + dept;
		}
	}
		
class StudentEx {
		public static void main(String[] args) {
			Student1 str1 = new Student1();
			Student2 str2 = new Student2();
			Student3 str3 = new Student3();
			str1.setStudent_No("20195138");
	        str1.setStudent_Name("김준호");
	        str1.setGrade(1);
	        str1.setDept("소프트웨어융합대학");
	        str2.setStudent_No("알 수 없음");
	        str2.setStudent_Name("김홍의");
	        str2.setGrade(1);
	        str2.setDept("소프트웨어융합대학");
	        str3.setStudent_No("20195264");
	        str3.setStudent_Name("채준혁");
	        str3.setGrade(1);
	        str3.setDept("소프트웨어융합대학");
			System.out.println( str1.toString() );
			System.out.println( str2.toString() );
			System.out.println( str3.toString() );
			
		}
	}
