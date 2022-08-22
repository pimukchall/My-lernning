import java.io.*;
class CharFileUseStreamTokenizer
{
public static void main(String[] args)
{
String filename = "New_Text.txt";
File myFile = new File(filename);
//..................................................................
if ( !myFile.canRead() ) {
System.out.println(filename+ " is not readable");
System.exit(1);
}
try {
StreamTokenizer token = new StreamTokenizer ( new BufferedReader ( new InputStreamReader ( new FileInputStream (myFile))));
token.whitespaceChars('.','.');
token.whitespaceChars(',',',');
token.whitespaceChars('!','!');
token.whitespaceChars('?','?');
int ttype=0;
//.........................................................
ttype = token.nextToken();
//................................................................
while ( ttype != StreamTokenizer.TT_EOF) {
if(ttype == StreamTokenizer.TT_NUMBER) { System.out.println(token.nval); }
else { System.out.println(token.sval); }
//....................token next....................................................................................
ttype = token.nextToken();

 }//end while

 }//end try
//.................................................................
catch (FileNotFoundException e) {
System.out.println("Error file is not found");
System.exit(1);
}//end catch 1
//.................................................................
catch (IOException e) {
System.out.println("Error while reading the file");
System.exit(1);
}//end catch 2
}//end main
}//end class