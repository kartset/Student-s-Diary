
public class Arrears {

	public int fine_pending_total = 0, fine_pending_dept = 0; fine_pending_lib=0, fine_paid_total=0;
	public int fine_paid_now = 0,
	public String roll_no;
	public int temp = 0;

	//System.out.print("Enter the roll no. of the students :- ");
	//roll_no = input.nextLine();


	public void arrears_pending() {

		System.out.print("Enter the roll no. of the students :- ");
		roll_no = input.nextLine();

		System.out.print("Enter the Department Fine:- ");
		temp = input.nextInt();

		fine_pending_dept += temp;

		System.out.print("Enter the Library Fine:- ");
		temp = input.nextInt();

		fine_pending_lib += temp;

		fine_pending_total += (fine_pending_lib + fine_pending_dept);

		System.out.print("Total fine pending :- " + fine_pending_total);


	}

	public void show_arrears_pending() {

		System.out.print("Enter the roll no. of the student :- ");
		roll_no = input.nextLine();

		System.out.print("Department Fine Pending :- " + fine_pending_dept);

		System.out.print("Library Fine Pending :- " + fine_pending_lib);

		System.out.print("Total Fine Pending :- " + fine_pending_total);
	}

	public void show_arrears_paid() {
		System.out.print("Enter the roll no. of the student :- ");
		roll_no = input.nextLine();

		System.out.print("Total Fine Paid :-" + fine_paid_total);
	}

	public void pay_arrears() {
		System.out.print("Enter the roll no. of the student :- ");
		roll_no = input.nextLine();

		System.out.print("Fine Pending :-");
		show_arrears();

		System.out.print("How much Department fine you are paying now : ");
		temp = input.nextInt();

		fine_paid_now += temp;

		System.out.print("How much Library fine you are paying now : ");
		temp = input.nextInt();

		fine_paid_now += temp;

		fine_paid_total += fine_paid_now;

		fine_pending_total -= fine_paid_now;

		fine_paid_now = 0;

	}
}
