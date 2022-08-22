import java.util.Scanner;
class hire
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		while(true){

		System.out.print("Input your First_Name : ");
		String first_name = sc.next();
		System.out.print("Input your Last_Name : ");
		String last_name = sc.next();

		System.out.print("Hours:");
		int hr = sc.nextInt();

		if (hr <= 40) {
		System.out.println("get hire = " + (hr*100) + "baht" );}

		else {
		int ot = hr-40;
		int hire2 = (hr-ot)*100;
		
		System.out.println("First Name " + first_name);
		System.out.println("Last Name " + last_name);

		System.out.println("get hire = " + (hire2 + (ot*150)) );
			}

		System.out.println("Do you wan to Exit(y/n):");
		String check = sc.next();
		if(check.equalsIgnoreCase("y")){break;

}//end if					
}//end while
}//end main
}//end class