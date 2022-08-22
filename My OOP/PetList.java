import java.util.ArrayList;
public class PetList {
    public static void main(String[] args) {
        
        ArrayList<String> namePets = new ArrayList<>();
        namePets.add("Pet1");
        namePets.add("Pet2");
        namePets.add("Pet3");
        namePets.add("Pet4");
        namePets.add("Pet5");

        System.out.println(namePets);

        namePets.set(01, "Max");
        System.out.println(namePets);

        namePets.remove("Pet3");
        System.out.println(namePets);
    }
}
