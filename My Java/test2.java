 import java.util.Scanner;{
 public class Test2	{
		public static void main(String[] args){ 
		Scanner sc =new Scanner(System.in);
		String check = “ ”;
		while(true) {
		System.out.print(“Please input integer number :”);
		int y = functionx(sc.nextInt());
		System.out.println(“\t\tresult is : ”  +  y);
		System.out.println(“Do you want to Exit(y/n) : ”);
		check = sc.nextLine();
		if(check.equalsIgnoreCase(“y”))
			{    break;
		}//end if 
		}//end while
		}//end main
static int functionx(int x)
	{
	return x*x;
	}//end functionx
}//end class
