import java.util.*;
public class StudentActivities {
	//books issued from library
	public void Library() {
	List<String> books = new ArrayList<String>();
	// add String data
	String book_name;
	int choice;
	int i=0;
	String return_book;
	String donate_book; 
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your choice :- \n1.Isuue a Book\n2.Return a book\n3.Donate a book");
	choice = input .nextInt();

	switch(choice) {
		case 1 : 	if(books.size()<=5) {
						System.out.print("Enter the name of the book issued :- ");
						book_name = input.nextLine();
						books.add(book_name);
					}

					else {
						System.out.print("You've issued maximum no. of books. You can't issue more.");
					}
					 break;

		case 2 : System.out.print("Enter The name of the book you want to return :-");
				 return_book = input.nextLine();
				 for(i=0;i<books.size();i++) {
				 	if(return_book == books.get(i)) {
				 		books.remove(i);
				 	}
				 }
				 //another thing we can do here is that we can just list the book issued by the students and 
				 //can ask which one you want to return. 
				 break;

		case 3 : System.out.print("Enter the name of the book you want to donate :- ");
				 donate_book = input.nextLine();
				 //make a file named lib_books and enter every book into that as record

		default : System.out.print("Wrong Choice");

	}




	//anExpandaleArray.add("Foo");
	//anExpandaleArray.add("Bar");

	}

	//curricular-activities--> cgpa,
	//extracurricular-activities or co curricular activities --> sports and games , tech cometition,internships,artistic,litrary,science,tech, performing arts(debate,drama,plays, band, dance, choir,cinema,modelling,theatre), social work,cultural fest , tech fest, topic-specific clubs, work programs, media(journalism , rj and all), political Interest
	//after school activities --> outdoor education such as scouting, girl's guides, boys' brigade, camp fire, 4-h, cadets, gitavarsham aand all, attending conferences finicial litracy, and all , Volunteering
	//fine pending i.e. arrears
	//charges against student
	//scholarship details

}