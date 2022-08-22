import java.util.*;
import java.text.DecimalFormat;
class kaicomsci03
{
    public static void main(String[] args) {
    DecimalFormat DF = new DecimalFormat("0.00");
    
    System.out.println("\t\t Sales and Profit Projection \t\t");
    System.out.println("\t Year \t\t Expected Sales \t\t Projected Profit");
    Double Money = 10000000.00,Profit = 0.10, los = 0.04, n=0.00, m=0.00;
    for (int i=1;i<=10;i++){
        Money = Money-Money*los;
        System.out.println("\t "+i+"\t\t"+DF.format(Money)+"\t\t"+DF.format(Money*Profit));
        n = n+Money;
        m = m+(Money*Profit);
        }
    System.out.println("_______________________________________________________________________________________________________");
    System.out.println("\tTotal:\t\t"+DF.format(n)+"\t\t"+DF.format(m));
    }
}