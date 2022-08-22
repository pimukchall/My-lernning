import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

class login {

    static ArrayList<ArrayList> register_id = new ArrayList<ArrayList>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1.REGISTER");
            System.out.println("2.LOGIN");
            System.out.println("3.EXIT");
            System.out.print("Select :");
            int select = sc.nextInt();

            switch (select) {
                case 1: {
                    String arr[] = input(); // use input
                    register(arr[0], arr[1]); // use regis
                    break;
                }

                case 2: {
                    String arr[] = input(); // use input
                    check(arr[0], arr[1]); // use check
                    break;
                }

                case 3:
                    return;

                default:
                    return;
            }// end switch
        } // end while
    }

    // -------------------------------------------------------------------------//
    static void register(String id, String password) {// start regis
        register_id.add(new ArrayList());
        register_id.get(register_id.size() - 1).add(0, id);
        register_id.get(register_id.size() - 1).add(1, password);
    }// end regis
     // -------------------------------------------------------------------------//

    // -------------------------------------------------------------------------//
    static String[] input() {
        String[] arrinput = new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID :");
        arrinput[0] = sc.nextLine();
        System.out.println("Enter your Passwords :");
        arrinput[1] = sc.nextLine();
        return arrinput;
    }// end input
     // -------------------------------------------------------------------------//

    // -------------------------------------------------------------------------//
    static void check(String id, String password) {
        for (int i = 0; i < register_id.size(); i++) {
            for (int j = 0; j < register_id.get(i).size(); j++) {

                if ((id.equals(String.valueOf(register_id.get(i).get(0))))
                        && (password.equals(String.valueOf(register_id.get(i).get(1))))) {
                    bonus();
                    break;
                }
            }
        }
    }

    // -------------------------------------------------------------------------//

    // -------------------------------------------------------------------------//
    static void bonus() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your salary : ");
        int salary = sc.nextInt();
        System.out.println("Input your time : ");
        int time = sc.nextInt();

        int money = salary * 12;

        if (time <= 0) {
            System.out.println("You must enter a correct times, try again later.");
        } else {
            if (time >= 16) {
                System.out.println(
                        "Your annual bonus is 40%. The bonus you will receive is..." + ((money * 0.4) + money));

            } else if (time <= 15) {
                System.out.println(
                        "Your annual bonus is 20%. The bonus you will receive is..." + ((money * 0.15) + money));

            } else if (time <= 5) {
                System.out.println(
                        "Your annual bonus is 10%. The bonus you will receive is..." + ((money * 0.1) + money));

            }
        }
    }// end bonus
     // -------------------------------------------------------------------------//
     
}// end class