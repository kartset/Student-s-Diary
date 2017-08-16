import java.util.*;

public  class MainMenu {

	public static void main(String[] args) {
		System.out.println("\t\tWelcome to the Student's Diary. Here you can record the activities of the students you are and can keep record of their progress.");
		System.out.print("Enter Student's Roll Number :-");
		Scanner s = new Scanner(System.in);
		String roll_no = s.nextLine();
		System.out.print(roll_no);
	}
	
}