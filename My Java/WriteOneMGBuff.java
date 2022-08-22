//using FileWriter+BufferedWriter
import java.io.*;

class WriteOneMGBuff 
{
 public static void main(String[] args) throws IOException
 {
  //start to cap date time
  //..........................................................................................
          long start = System.currentTimeMillis();
  //..........................................................................................
  FileWriter fw = new FileWriter("C:\\Users\\Pimuk\\Documents\\d.txt");
  BufferedWriter buf = new BufferedWriter(fw);
  //..........................................................................................
  for(int i =0; i< 1000000; i++){
   buf.write('A');
  }//end for 
        buf.close();
  //..........................................................................................
          long stop = System.currentTimeMillis();
  //..........................................................................................
  //..........................................................................................
  System.out.println("start :" + start +"\t stop:"+ stop+ " \t interval : "+ (stop-start));
 }
}