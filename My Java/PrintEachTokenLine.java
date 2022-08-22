import java.io.*;
class PrintEachTokenLine
{
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("C:\\Users\\Pimuk\\Documents\\Student.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        int tot = 0;

        while(line!=null){
            String items[] = line.split("");
            tot = Integer.parseInt(item[4]) + Integer.praseInt(item[5]);
            System.out.print("\t" + items[0]+ ":" + item[1] + ":" + item[2] + ":" + item[3] + ":" + item[4] + ":" + item[5] + ":")
            System.out.println("::" + tot);
            line = br.readLine();
            tot=0;
        }
        br.close();
    }
}