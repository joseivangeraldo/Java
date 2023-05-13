import java.lang.*;
import java.util.Scanner;
import java.lang.Math;
class Expression2 
{
    public static void main(String args[])
    {
        int a, b, c;
        float s;
        double area;

        System.out.println("Enter a, b and c ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a+b+c)/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("A area do Triangulo é "+area);



    }

}
