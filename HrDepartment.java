package Graded.Coding.Assignment1;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		String name = "Welcome to HR Department";
		System.out.println(name);
		return name;
	}
	
	public String getTodaysWork() {
		String work = "Fill today’s worksheet and mark your attendance";
		System.out.println(work);
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		System.out.println(deadline);
		return deadline;
	}
	
	public String doActivity() {
		String activity = "Team Lunch";
		System.out.println(activity);
		return activity;
	}
}
