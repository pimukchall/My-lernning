import java.util.Scanner;

class kaicomsci02 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int deposite = 0;
    int machine = 28000;
    int depreciated = 4000;
    for (int i = 1; i <= 7; i++) {
        deposite = deposite + depreciated;
        machine -= depreciated;
        System.out.println("ปีที่\t" + i + "\tค่าเสื่อมราคา\t" + depreciated + "\tราคาสิ้นค้า\t" + machine + "\tค่าเสื่อมสะสม\t" + deposite) ;
        
    
        
    }
    

}//end main
}//end class