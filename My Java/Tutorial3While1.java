import java.util.Scanner;
class Tutorial3While1
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  int ch = 0;
  String check = " ";
  while(true){
  System.out.println("Hello ! We are Computer Science , DIT, RSU.");
        System.out.println("1. Say Hi\n 2. Say HoHoHo\n 3. Say GoodBye...");
  System.out.print("Input choices (1, 2, or 3) : -> "); ch = sc.nextInt();
  //..................................exit check..................................................
  System.out.print("Do you want to exit (y/n) : ");
       check = sc.next();
  if (ch==1)
  {
   sayHi();
  }
  if(ch==2){
      sayHo();
  }
  if (ch==3)
  {
   sayGoodBye();
  }//end if
        //..........................................check to exit..................................
          if(check.equalsIgnoreCase("y")){ break;}
        }//end while
 }//end main
 static void sayHi(){ System.out.print("Hi, Nice to meet you");}
 static void sayHo(){ System.out.print("HoHoHo, Nice to meet you");}
 static void sayGoodBye(){ System.out.print("Hi, GoodBye :)");}
}//end class