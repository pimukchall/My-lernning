import java.io.*;
class ReadObject
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fs = new FileInputStream("Person.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person p = (Person)ois.readObject();

        System.out.println(p);

        System.out.println("Pead complete!");
        ois.close();
        
    }
}