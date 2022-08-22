import java.util.Scanner;
class finance
{
public static void main(String[] args) {
    String check_exit="";
    int how_many_months = 0;
    double car_price = 0, deposit= 0, total_finance= 0, per_month = 0, interest = 0, total_interest = 0, total_monthly_payment = 0;

    Scanner sc = new Scanner(System.in);
while(true)
{
        //1.ราคารถ
        System.out.print("Please input your car price :");
        car_price = sc.nextDouble();
        System.out.print("Please input your deposit (% only) :");
        deposit = sc.nextDouble();
        System.out.print("Please input your month :");
        how_many_months = sc.nextInt();
        System.out.print("Please input your interest (% only) :");
        interest = sc.nextDouble();

        total_finance = car_price - (car_price * deposit/100);
        //System.out.print(total_finance);

        ///2.ต่อเดือน
        per_month = total_finance/how_many_months;

        //3.ดอกเบี้ย
        total_interest = per_month*interest/100;
        //System.out.print(total_interest);

        //4 รวมยอดแต่ละเดือน
        total_monthly_payment = per_month + total_interest;
        System.out.println("Total Monthly Payment" + total_monthly_payment);


//check exit (y/n)
System.out.println("EXIT (y/n) :");
check_exit = sc.next();    
if(check_exit.equalsIgnoreCase("y"))
{break;}


}//loop
}// end main
}// end class