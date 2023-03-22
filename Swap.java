import java.util.*;

public class Swap {
    public static void main(String args[]) {
        int a, b;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two number to swap");
        a = S.nextInt();
        b = S.nextInt();

        //Swap the values of a and b using temp variable
        System.out.println("Before swapping");
        System.out.println(a + " " + b);
        int temp = a; // Store the value of a in temp
        a = b;        // Assign the value of b to a
        b = temp;     // Assign the value of temp to b
        
        System.out.println("After swapping");
        System.out.println(a + " " + b);
        

    }
}

