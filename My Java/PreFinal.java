import java.util.Scanner;
class PreFinal
{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
//input

    System.out.println("Insert your student code please...");
    String student_code = sc.next();

    System.out.println("Insert your first name please...");
    String first_name = sc.next();

    System.out.println("Insert your last name please...");
    String last_name = sc.next();

    System.out.println("Insert your birthday (00/00/00) please...");
    String birth_day = sc.next();

    System.out.println("Insert your E-mail please...");
    String e_mail = sc.next();

//output

    System.out.println("Student code" + student_code);
    System.out.println("You're" + first_name + " " + last_name );
    System.out.println("Your Birthday" + birth_day);
    System.out.println("Contact by Email" + e_mail);
    
    }
}