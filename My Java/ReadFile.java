import java.io.*;

class ReadFile
{
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\Pimuk\\Documents\\Student.txt");
        int c = fr.read();
        while(c!=-1){
            System.out.print((char)c + "");
        c=fr.read();
    
        }//end while
        fr.close();
        System.out.println();
    }//end main
}//end class