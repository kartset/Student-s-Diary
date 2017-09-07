import java.util.*;
public class StudentDetails extends StudentDetailsConstant {
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

		int choice_course,choice_branch;

		System.out.println("Enter the course that student has joined (1-12) :-"); //here1
		System.out.print(" 1. B.Tech \n 2. M.Tech \n 3. Biotech \n 4. Masters in biotech \n 5. MA \n 6. BA \n 7. MBA" +
		"\n 8. BBA \n 9. BSc \n 10. MSc \n 11. BCA \n 12. MCA");
		
		choice_course = s.nextInt();

		switch(choice_course) {
			case 1 : course_joined = course_opt_1 
					 break;
			case 2 : course_joined = course_opt_2
					 break;
			case 3 : course_joined = course_opt_3
					 break;
			case 4 : course_joined = course_opt_4
					 break;
			case 5 : course_joined = course_opt_5
					 break;
			case 6 : course_joined = course_opt_6
					 break;
			case 7 : course_joined = course_opt_7
					 break;
			case 8 : course_joined = course_opt_8
					 break;
			case 9 : course_joined = course_opt_9
					 break;
			case 10 : course_joined = course_opt_10
					 break;
			case 11 : course_joined = course_opt_11
					 break;
			case 12 : course_joined = course_opt_12
					 break;
			default : System.out.print("Wrong Choice");
						// send it back to //here1 to follow the code flow

		}


		
		if(course_joined == course_opt_1 ) {
			System.out.println("Enter the branch (1-4) :-"); //here
			System.out.print("1. " + btech_branch_opt_1);
			System.out.print("2. " + btech_branch_opt_2);
			System.out.print("3. " + btech_branch_opt_3);
			System.out.print("4. " + btech_branch_opt_4);
	
			choice_branch = s.nextInt();
	
			switch(choice_banch) {
				case 1 : branch = btech_branch_opt_1;
						 break;
	
				case 2 : branch = btech_branch_opt_2;
						 break;
	
				case 3 : branch = btech_branch_opt_3;
						 break;
	
				case 4 : branch = btech_branch_opt_4;
						 break;
	
				default : System.out.print("Wrong Choice");
							//send them back to '//here' and let it follow the code flow again
			}

		}

		else
			if(course_joined == course_opt_2 ) {
			System.out.println("Enter the branch (1-) :-"); //here
			System.out.print("1. " + mtech_branch_opt_1);
			//System.out.print("2. " + bmtech_branch_opt_2);
			//System.out.print("3. " + mtech_branch_opt_3);
			//System.out.print("4. " + mtech_branch_opt_4);
	
			choice_branch = s.nextInt();
	
			switch(choice_banch) {
				case 1 : branch = btech_branch_opt_1;
						 break;
	
				case 2 : //branch = btech_branch_opt_2;
						 break;
	
				case 3 : //branch = btech_branch_opt_3;
						 break;
	
				case 4 : //branch = btech_branch_opt_4;
						 break;
	
				default : System.out.print("Wrong Choice");
							//send them back to '//here' and let it follow the code flow again
			}


			}


			else {
				System.out.print("This is else clause");
			}
				//and so on.
		
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
//break it into different classes and make this class as the parent class
//make a sub class to this which will hold class details of the student like room no, section, current semester and all