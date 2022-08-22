import java.text.DecimalFormat;
import java.util.Scanner;

class kaicomsci05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");

        double experiments[][] = new double[4][6];
        double experiments_results[] = new double[4];

        for (int i = 0; i < experiments.length; i++) {
            for (int j = 0; j < experiments[i].length; j++) {

                System.out.print("Input result :");
                experiments[i][j] = sc.nextDouble();

            }
        }

        for (int i = 0; i < experiments.length; i++) {
            double temp = 0.0;
            for (int j = 0; j < experiments[i].length; j++) {
                temp += experiments[i][j];

            }
            experiments_results[i] = temp / experiments[i].length;
            System.out.println("Experiments\t" + (i + 1) + "\t" + d.format(experiments_results[i]));
        }

    }// end main
}// end class