import java.io.*;
import javax.swing.*;

class AppendStudent 
{
 public static void main(String[] args) throws Exception 
 {
  //.......................................................................................
  FileWriter fw = new FileWriter("C:\\Users\\Pimuk\\Documents\\Student.txt", true);
  PrintWriter pw = new PrintWriter(fw);
 
         String code = JOptionPane.showInputDialog("Code");
   String name  = JOptionPane.showInputDialog("Name ");
   String surname = JOptionPane.showInputDialog("Surname");
   String scr1 = JOptionPane.showInputDialog(" Score 1 ");
   String scr2 = JOptionPane.showInputDialog(" Score 2");
   String scr3 = JOptionPane.showInputDialog(" Score 3"); 
  //.......................................................................................
         pw.printf("%n%s %s %s %s %s %s%n", code, name, surname, scr1, scr2, scr3);
  //........................................................................................
  System.out.println("write complete!");
  pw.close();
 }
}