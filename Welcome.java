import java.util.*;
public class Welcome {
    public static void main(String a[])
    {
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("May i know your name");
        name = s.nextLine();
        System.out.println("Welcome "+name);
    }
}
