import java.util.Scanner;
class grade 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("INPUT YOUR SCORE : ");
		int score = sc.nextInt();
		int mark = 0;

if (score >= 80) {
System.out.println("A");
mark=1;}

else if (score >= 75) {
System.out.println("B+");
mark=2;}

else if (score >= 70) {
System.out.println("B");
mark=3;}

else if (score >= 65) {
System.out.println("C+");
mark=4;}

else if (score >= 60) {
System.out.println("C");
mark=5;}

else if (score >= 55) {
System.out.println("D+");
mark=6;}

else if (score >= 50) {
System.out.println("D");
mark=7;}

else if (score < 50) {
System.out.println("F");
mark=8;}

		switch (mark) {
			case 1 : 
                System.out.println("Perfect"); break;

			case 2 : 
                System.out.println("Good+"); break;

			case 3 : 
                System.out.println("Good"); break;

			case 4: 
                System.out.println("So close"); break;

			case 5 : 
                System.out.println("Poor"); break;

			case 6 : 
                System.out.println("Poor"); break;

			case 7 : 
                System.out.println("Bad"); break;

			case 8 : 
                System.out.println(" Building 1 please"); break;
			
			default:System.out.println("");
                
	}
}
}