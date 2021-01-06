
public class StudentProfile {
	// Declare the instances variables
	String firstName;
	String lastName;
	int expectedYearGraduation;
	double gpa;
	String major;
	
	//constructor
	public StudentProfile(String firstName,	String lastName,
			int expectedYearGraduation, double gpa,	String major) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.expectedYearGraduation = expectedYearGraduation;
		this.gpa = gpa;
		this.major = major;		
	}
	
	//Methods
	public int incrementExpectedGraduationYear() {
		return ++this.expectedYearGraduation;
	}
}
