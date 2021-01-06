
public class Main {

	public static void main(String[] args) {
		// TODO create two student profile instances
		StudentProfile student01 = new StudentProfile("Thays", "Casado", 2021, 4.2, "Computer Science");
		StudentProfile student02 = new StudentProfile("Kathryn", "Hodge", 1993, 5, "Master CSIS");
		
		student01.incrementExpectedGraduationYear();
		
		System.out.println(student01.expectedYearGraduation);
		

	}

}
