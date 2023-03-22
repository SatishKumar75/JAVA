import javax.annotation.processing.SupportedOptions;

public class array {
    public static void main(String[] args){
        int[][][] x = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
        System.out.println(x[0][1][2]);
        System.out.println(x[1][0][1]);
        System.out.println(x[1][1][1]);
        // System.out.println(x[2][1][0]);
        // System.out.println(x[1][2][0]);
        // System.out.println(x[2][0][0]);

        int[] y = new int[9];
        System.out.println(y.length);

        int[][] z = new int[6][3];
        System.out.println(z.length);
        System.out.println(z[0].length);
    }
}