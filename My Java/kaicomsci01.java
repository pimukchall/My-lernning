import java.util.Scanner;

class kaicomsci01 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int [][] arr1 = {{16,18,23},{54,91,11}};
    int [][] arr2 = {{24,52,77},{16,19,59}};
    int [][] arrplus = new int [2][3];
    for (int i = 0; i < arrplus.length; i++) {
        for (int j = 0; j < arrplus[i].length; j++) {
            arrplus[i][j] = arr1[i][j] + arr2[i][j];
            System.out.println("แสดงผล" + arrplus[i][j]);
            
        }
    }

}
}