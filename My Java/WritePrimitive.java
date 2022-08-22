import java.io.*;

class WritePrimitive
{
public static void main(String[] args) throws Exception
{
FileOutputStream fos = new FileOutputStream("primitive.bin");
DataOutputStream dos = new DataOutputStream(fos);
int i =511;
dos.writeInt(i);
System.out.println("Write primitive int value complete!");
dos.close();
}//end main
}//end class