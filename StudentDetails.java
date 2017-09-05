import java.util.*;
public class StudentDetails	 {
	public String student_name;
	public String student_roll;
	public int year_joined;
	public String current_sem;
	public String course_joined;
	public String branch;
	public String address;
	public long int student_contact;
	public long int father_contact;
	public long int emergency_contact;
	public String father_name;
	public String local_gaurdian;
	public String hostel_name;
	public String email;

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

		System.out.println("Current Semester :-");
		current_sem = s.nextLine();


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

	public void showDetails() {
		System.out.println("Name :- " + student_name +"\nStudent's Roll No :- " + student_roll + "\nYear in which "
		"student joined :- " + year_joined + "\nCurrent Semester in which student is studying :-" + current_sem + 
		"\nCourse for which student has joined" + course_joined +  "\nBranch Student has selected " + branch + "\n"
		"Student's Father's Name :- " + father_name + "\nStudent's Local Guadrdian's Name :- " + local_gaurdian + 
		"\nEnter Student's Contact Number :- " + student_contact + "\nFather's Contact Number :- " + father_contact + 
		"\nLocal Guardian's Contact Number :- " + emergency_contact + "\nStudent's Address :- " + address + "\n"
		"Hostel in which Student is living :- " + hostel_name + "\nStudent's email-id :- " + email);
	}
	}

}


//implement get set concept for eg set_denominator(int d) {this.deno = d; something} get_denominator() {return deno}
//divide all of them into certain classes and make student details as the super class of all of them or an abstract class 
//or an interface
