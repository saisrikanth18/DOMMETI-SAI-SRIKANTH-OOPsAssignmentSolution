package Graded.Coding.Assignment1;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		String name = "Welcome to Tech Department";
		System.out.println(name);
		return name;
	}
	
	public String getTodaysWork() {
		String work = "Complete coding of module 1";
		System.out.println(work);
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		System.out.println(deadline);
		return deadline;
	}
	
	public String getTechStackInformation() {
		String techstack = "Core Java";
		System.out.println(techstack);
		return techstack;
	}
}
