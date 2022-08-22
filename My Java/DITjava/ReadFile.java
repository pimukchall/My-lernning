import java.io.*;
public class ReadFile {
public static void main(String[] args) {

String filename = "New_text.txt";
File myFile = new File(filename);
	
	if ( !myFile.canRead() ) {
	System.out.println(filename+ " is not readable");
	System.exit(1);
	}


	try {
	FileReader input_file = new FileReader(myFile);
	int c;
	while ( ( c = input_file.read()) != -1 ) {
	System.out.print( (char) c );
	}
	}


	catch (FileNotFoundException e) {
	System.out.println("Error file is not found");
	System.exit(1);
	}
	catch (IOException e) {
	System.out.println("Error while reading the file");
	System.exit(1);
	}
}
}