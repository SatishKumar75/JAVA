import java.util.Scanner;

public class tableRange {
    
    public static void main(String[] args) {
        int a,b,i,t=0,s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range");
        a = sc.nextInt();
        b = sc.nextInt();
        s = (b-a)+1;

        int[][] r = new int[s][10];

        for(int j=a; j<=b; j++){
            for(i=1; i<=10; i++){
                r[t][i-1] = j*i;
            }
            t++;
        }

        for(t=0; t<s; t++){
            for(i=0; i<10; i++){
                System.out.println(r[t][i]);
            }
            System.out.println();
        }
    }
}
