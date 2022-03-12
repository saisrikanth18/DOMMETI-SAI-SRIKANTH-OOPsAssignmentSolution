package Graded.Coding.Assignment1;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		String name = "Welcome to Admin Department";
		System.out.println(name);
		return name;
	}
	
	public String getTodaysWork() {
		String work = "Complete your document Submission";
		System.out.println(work);
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		System.out.println(deadline);
		return deadline;
	}
}
