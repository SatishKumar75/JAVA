import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Enter the rows ");
        a = sc.nextInt();
        System.out.println("Enter the columns ");
        b = sc.nextInt();

        int[][] arr = new int [a][b];
        int[] cs = new int [a];

        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<a; i++){
            int rsum = 0,cws = 0;
            for(int j=0; j<b; j++){
                System.out.print(arr[i][j] + " ");
                rsum += arr[i][j];
            }
            System.out.print(rsum);
            System.out.println();
        }
    }
}
