import java.util.Scanner;
import java.text.DecimalFormat;

class kaicomsci04 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    double [] player = new double [5];

    double [][] arr = {{286 , 252 , 265},
                    {212 , 186 , 215},
                    {252 , 232 , 216},
                    {192 , 201 , 235},
                    {186 , 236 , 272}};

    for (int i = 0; i < arr.length; i++) {
        double temp = 0.0;
        for (int j = 0; j < arr[i].length; j++) {
            
            temp += arr [i][j];
                      
            
        }
        player[i] = temp/arr[i].length;

        System.out.println("ผู้เล่นคนที่\t" + i  + "\tได้คะแนนเฉลี่ยคือ\t" + df.format(player[i]));
    }

    

}//end main
}//end class