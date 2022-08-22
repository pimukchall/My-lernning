import java.util.Scanner;
class TaxCalculator 
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double Tax = 0;
    double Totalincome = 0;
    while(true){
    double[]income = new double[12];
    for (int i = 0;i<income.length;i++){
        System.out.print("Input your wages : ");
        income[i] = sc.nextInt();
        Totalincome = Totalincome + income[i];
    }
    if (Totalincome>=1000000){
        Tax = Totalincome*0.15;
    }
    else if (Totalincome>=500000){
        Tax = Totalincome*0.10;
    }
    else if (Totalincome>=200000){
        Tax = Totalincome*0.05;
    }
    else{
        Tax = 0;
    }
    System.out.println("Your total income : "+Totalincome);
    System.out.println("Your tax : "+Tax);
    System.out.println("Net income : "+(Totalincome-Tax));
    System.out.println("Do you want to end it?(Yes/No) : ");
    String Check = sc.next();
    if (Check.equalsIgnoreCase("Yes")){
    break;}
    }
    }
}
