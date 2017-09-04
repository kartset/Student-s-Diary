import java.util.*;
class StudentDetails	 {
	String student_name;
	String student_roll;
	int year_joined;
	String course_joined;
	String branch;
	String address;
	long int student_contact;
	long int father_contact;
	long int emergency_contact;
	String father_name;
	String local_gaurdian;
	String hostel_name;
	String email;

//email and phone_no. can be changed once entred
//use stringBuffer for email then

	public void enterDetails() {
		Scanner s = new Scanner(System.in);	
		
		System.out.print("Enter some static details about student :-");

		System.out.println("Enter student's name :-");
		student_name = s.nextLine();

		System.out.println("Enter student's roll no. :-");
		student_roll = s.nextLine();


		System.out.println("Enter the year in which student had joined :-");
		year_joined = s.nextInt();


		System.out.println("Enter the course that student has joined :-");
		System.out.print("the list");
		course_joined = s.nextLine();

		System.out.println("Enter the branch :-");
		if(course_joined == ) {

		}
		else
			if(course_joined == )
				//and so on.
		branch = s.nextLine();

		System.out.println("Enter student's Father's name :-");
		father_name = s.nextLine();

		System.out.println("Enter Student's Local Guardian's Name :-");
		local_gaurdian = s.nextLine();

		System.out.println("Enter student's contact number :-");
		student_contact = s.nextInt();

		System.out.println("Enter student's father's contact number:-");
		father_contact = s.nextInt();

		System.out.println("Enter student's local guardian's contact number :-");
		emergency_contact = s.nextInt();

		System.out.println("Enter student's address :-");
		address = s.nextLine();

		System.out.println("Enter student's hostel name :-");
		hostel_name = s.nextLine();

		System.out.println("Enter student's email :-");
		email = s.nextLine();





	}

}