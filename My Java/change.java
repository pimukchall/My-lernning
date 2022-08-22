import java.util.Scanner;
class change
{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int returnn = 0;
    System.out.print("Input your money:");
   int money = sc.nextInt();
    System.out.print("Input your price:");
   int price = sc.nextInt();

    returnn = money - price;
    if(money <=0) {return;}

    while(true){
     int[]pay = new int[7];
     
     int[] bankpay = new int[] {500 , 100 , 50 , 20 , 10 , 5 , 1};
     for (int i = 0; i < bankpay.length; i++) {
         pay[i] = returnn/bankpay[i];
         returnn = returnn%bankpay[i];
     }
     System.out.println("500 is : " + pay[0]);
     System.out.println("100 is : " + pay[1]);
     System.out.println("50 is : " + pay[2]);
     System.out.println("20 is : " + pay[3]);
     System.out.println("10 is : " + pay[4]);
     System.out.println("5 is : " + pay[5]);
     System.out.println("1 is : " + pay[6]);
     break;
    }
}

}