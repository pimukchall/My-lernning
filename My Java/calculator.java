import java.util.Scanner;
class calculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String checkexit ="";
		int num1=0,num2=0;
		while(true)
		{
		System.out.println("RSU Calculator");
		System.out.println("1. Add(+) : ");
		System.out.println("2. Subtract(-) : ");
		System.out.println("3. Multiply(*) : ");
		System.out.println("4. Divide(/) : ");
		System.out.println("5. Modulo(%) : ");

		//check to exit or choice on the menu
		System.out.println("Exit (y/n):");
		checkexit = sc.next();

		if(checkexit.equalsIgnoreCase("y")) 
			{break;
			}	
// input value if not exit

		System.out.print("INPUT NUMBER 1: ");
		num1 = sc.nextInt();
		System.out.print("INPUT NUMBER 2: ");
		num2 = sc.nextInt();
		if(checkexit.equals("1")) //plus
		{
			add(num1,num2);
		}

		if(checkexit.equals("2")) //Subtract
		{
			subtract(num1,num2);
		}

		if(checkexit.equals("3")) //Multiply
		{
			multiply(num1,num2);
		}

		if(checkexit.equals("4")) //Divide
		{
			divide(num1,num2);
		}

		if(checkexit.equals("5")) //Modulo
		{
			modulo(num1,num2);
		}
						
		}//end while
 
	}//end main
	// medthod actionCalculator
	public static void add(int n1,int n2){
		System.out.println("add("+ n1 +" , "+ n2 +") = " + (n1 + n2) );

	} //1

	public static void subtract(int n1,int n2){
		System.out.println("subtract("+ n1 +" , "+ n2 +") = " + (n1 - n2) );
	
	} //2

	public static void multiply(int n1,int n2){
		System.out.println("multiply("+ n1 +" , "+ n2 +") = " + (n1 * n2) );

	} //3

	public static void divide(int n1,int n2){
		System.out.println("divide("+ n1 +" , "+ n2 +") = " + (n1 / n2) );

	} //4

	public static void modulo(int n1,int n2){
		System.out.println("modulo("+ n1 +" , "+ n2 +") = " + (n1 % n2) );

	} //5

}//end class
