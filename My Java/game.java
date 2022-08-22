import java.util.Random;
import java.util.Scanner;
class game
{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int [][] arr = new int [5][5];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            arr[i][j] = random_score();
        }
    }
    int max = 0, score = 0;
    for (int i = 0; i < arr.length; i++) {
        int high_score = 0;
        for (int j = 0; j < arr.length; j++) {
            high_score+=arr[i][j];
        }
        if (high_score>score){
            score = high_score;
            max=i;
        }

        System.out.println("ผู้เล่นคนที่" +(i+1) + " ได้คะแนน : "+ high_score);

    }

    System.out.println("คนที่ได้คะแนนมากที่สุดคือคนที่ " + (max+1));

}
public static int random_score() {
    
    int [][] arr = {
            {1,1,1,1,1},
            {1,2,2,2,1},
            {1,2,3,2,1},
            {1,2,2,2,1},
            {1,1,1,1,1}
    };
    Random rd = new Random();
    int score = arr [rd.nextInt(4)][rd.nextInt(4)];
    return score;
    }
}