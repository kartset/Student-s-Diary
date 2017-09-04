import java.util.*;

public  class MainMenu {

	public static void main(String[] args) {
		char search ='y';
		Scanner s = new Scanner(System.in);

		System.out.println("\t\tWelcome to the Student's Diary. Here you can record the activities of the students you are and can keep record of their progress.");
		do {
			System.out.print("Enter Student's Roll Number :-");
			String roll_no = s.nextLine();
			System.out.print(roll_no);
		

			if(roll_no exists in records ) {
				show /*static*/ information about him 
			}

			else {
				System.out.print("Do you want to create a record for this roll no ?")
				char create = s.nextChar();

				if(create == 'y') {
					ask /*for*/ all /*static*/ info about that roll no
					System.out.print("Created!");
					
				}

				else{
					System.out.print("No record exist with this roll no. Want to search for another roll no.");
					search = s.nextChar();
				}
			}
		}

		while(search == 'y')
		
	}
	
}