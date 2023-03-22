import java.util.Scanner;

class table {

    public static void main(String[] args) {
        int n, i;
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        n = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            a[i - 1] = n * i;
        }

        for (i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

    }
}