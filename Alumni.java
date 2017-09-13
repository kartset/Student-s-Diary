import java.io.*;
class Alumni {
	//if student is an passed than his info about what has he done after leaving college

	public int final_cgpa;
	public int alu_sal;
	public String alu_dsig;
	public String alu_company;
	public static int no_of_company_worked; //it will change everytime the string alu_company change
	//a string array for name of the companies and dynamic so that we can add more 
	public String linked_in_prof;
	public String twitter_prof;
	public String fb_prof;
	public String github_prof;
	public String almaconnect_prof;
	public String final_year_project;
	public String alumni_rollno;

	Scanner in = new Scanner(System.in);

	public void data_input() {

			System.out.print("Enter the roll no of the alumni :-");
			alumni_rollno = in.nextLine();

		/*if the roll no still exists in another records destroy it (still exists means that if the record of this student
			still exists like another students who are currently enrolled in any of the courses then destroy info except any
			of above)
			*/

			/*else folllow the following program flow*/


			System.out.print("Brief Description of the final year project of Alumni :- ");
			final_year_project = in.nextLine();

			System.out.print("Enter the CGPA earned by the student when in the campus :-");
			final_cgpa = in.nextInt();

			System.out.print("Alumni's Alma Connect profile :- ");
			almaconnect_prof = in.nextLine();

			System.out.print("Alumni's Github Profile :-");
			github_prof = in.nextLine();

			System.out.print("Alumni's Facebook Profile :-");
			fb_prof = in.nextLine();

			System.out.print("Alumni's Twitter profile :-");
			twitter_prof = in.nextLine();

			System.out.print("Alumni's LinkedIn Profile :- ");
			linked_in_prof = in.nextLine();

			System.out.print("No. of the companies worked :- ");
			no_of_company_worked = in.nextInt();

			System.out.print("Name of the company currently working in :-");
			alu_company = in.nextLine();

			System.out.print("Current designation of the alumni in that company :-");
			alu_dsig = in.nextLine();

			System.out.print("Enter the current annual salary or package of the alumni");
			alu_sal = in.nextInt();
	}

	public void show_data() {

	}

	public void change_data() {

	}

}


//this class requires three functions :- data input, data show, data edit
