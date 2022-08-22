import java.util.Scanner;
class grade2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		double g = 0.00;
		double grade_one = 0.00;
		int credit = 0;

		while(true){
			
	
	

		System.out.print("Please input subject name : ");
		String subject_name = sc.next();
		System.out.print("Please input credit of subject  : ");
		int credit_subject = sc.nextInt();
		System.out.print("Please input grade of subject  : ");
		String grade_subject = sc.next();


switch (grade_subject)
{
case "A": g = 4.00; break;
case "B": g = 3.00; break;
case "C": g = 2.00; break;
case "D": g = 1.00; break;
case "F": g = 0.00; break;
default : return;

}
		grade_one= grade_one + (g * credit_subject);
		credit=credit+credit_subject;

		System.out.println("Do you wan to Exit(y/n):");
		String check = sc.next();
		if(check.equalsIgnoreCase("y")){break;



}//end if					
}//end while

System.out.println("Your Average Grade is :" + (grade_one / credit));

System.out.println("Your total credit is :" + credit);


}//end main
}//end class