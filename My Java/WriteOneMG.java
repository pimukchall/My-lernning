import java.io.*;
import javax.swing.*;

class WriteOneMG 
{
 public static void main(String[] args) throws IOException
 {
  //start to cap date time
  //..........................................................................................
          long start = System.currentTimeMillis();
  //..........................................................................................
  FileWriter fw = new FileWriter("c.txt");
  //BufferedWriter buf = new BufferedWriter(fw);
  //..........................................................................................
  for(int i =0; i< 1000000; i++){
   fw.write('A');
  }//end for 
        fw.close();
  //..........................................................................................
          long stop = System.currentTimeMillis();
  //..........................................................................................
  //..........................................................................................
  System.out.println("start :" + start +"\t stop:"+ stop + " \t interval : "+ (stop-start));
 }
}