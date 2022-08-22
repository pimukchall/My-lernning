import java.io.*;

class WriteObject
{
public static void main(String[] args) throws Exception
{
FileOutputStream fos = new FileOutputStream("Person.bin");
ObjectOutputStream oos = new ObjectOutputStream(fos);

 Person p1= new Person("Areerat", "Songsakulwattana", 30000);
oos.writeObject(p1);

 System.out.println("Hello ! write object to person.bin complete");
oos.close();
}//end main
}//end class

public class Person implements java.io.Serializable
{
private String firstname;
private String lastname;
private int salary;

 public Person(String f, String l, int s){
firstname = f;
lastname=l;
salary = s;
}//end Person

 public String toString() {
return firstname + " "+ lastname + " " + salary;
}

}//end class