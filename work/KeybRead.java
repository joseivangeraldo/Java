import java.lang.*;
import java.util.*;

class KeybRead {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int a, b, c;

        // LER ENTRADAS INT
        System.out.println("Enter 2 numbers");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("Sum is " + c);

        // LER ENTRADAS STRING
        Scanner w = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = w.nextLine();

        System.out.println("Hello " + name);
    }
}