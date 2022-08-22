import java.io.*;

class PrintFirstLine
{
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("C:\\Users\\Pimuk\\Documents\\Student.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        System.out.println(line);
        br.close();
    }
}