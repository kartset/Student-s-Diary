import java.util.*;

public  class MainMenu {

	public static void main(String[] args) {
		char search ='y';
		Scanner s = new Scanner(System.in);
		StudentDetails staticDetails = new StudentDetails();
		int choice;
		System.out.println("\t\tWelcome to the Student's Diary. Here you can record the activities of the students you are and can keep record of their progress.");
		do {
			System.out.print("Enter Student's Roll Number :-");
			String roll_no = s.nextLine();
//			System.out.print(roll_no);


			if(roll_no exists in records; ) {
				System.out.println("What do you want to do :- ");
				System.out.print("1.Want to see details \t 2.Edit the details (1-2)");
				choice = s.nextInt();
				switch (choice) {
						case 1 :	//for now it's only staticDetails but give option about details like Static Details
											//or extracurricular-activities' details or activity detail and all.
											staticDetails.showDetails();
											break;

					//	case 2 : 	editDetails(); //not created yet
												//break;

						default : System.out.print("Wrong Choice"); //goto statement implementation
				}
			}

			else {
				System.out.print("Do you want to create a record for this roll no ?(y/n)");
				char create = s.nextChar();

				if(create == 'y') {
					staticDetails.enterDetails();
					System.out.print("Created!");
				}
			}

			//search for something like getch(); of c++
			System.out.print("More ? (y/n)");
			search = s.nextChar();

		}

		while(search == 'y');

	}

}

//three things can be done for a particular student new entry, edit the entries,
//delete the record because he is an  alumni now
