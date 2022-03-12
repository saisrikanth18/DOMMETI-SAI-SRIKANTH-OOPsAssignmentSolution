package Graded.Coding.Assignment1;

public class Main {
	
	public static void main(String[] args) {
		
		AdminDepartment A = new AdminDepartment();
		HrDepartment B = new HrDepartment();
		TechDepartment C = new TechDepartment();
		
		A.departmentName();
		A.getTodaysWork();
		A.getWorkDeadline();
		A.isTodayAHoliday();
		
		B.departmentName();
		B.doActivity();
		B.getTodaysWork();
		B.getWorkDeadline();
		B.isTodayAHoliday();
		
		C.departmentName();
		C.getTodaysWork();
		C.getWorkDeadline();
		C.getTechStackInformation();
		C.isTodayAHoliday();
		
	}
}
