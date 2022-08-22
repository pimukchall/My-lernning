import java.util.*;
class bonus
{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Input your salary : " );
    int salary = sc.nextInt();
    System.out.println("Input your time : " );
    int time = sc.nextInt();

    int money = salary*12;

    if (time <= 0 ) {
            System.out.println("You must enter a correct times, try again later.");
        } else {
            if (time >= 16) {
                System.out.println("Your annual bonus is 40%. The bonus you will receive is..." + ((money*0.4) + money));
                
            } else if (time <= 15) {
                System.out.println("Your annual bonus is 20%. The bonus you will receive is..." + ((money*0.15) + money));

            } else if (time <= 5) {
                System.out.println("Your annual bonus is 10%. The bonus you will receive is..." + ((money*0.1) + money));
                
    }
    }
    }
}