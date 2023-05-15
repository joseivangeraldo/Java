import java.lang.*;
import java.util.Scanner;

class Cuboid
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int lenght, breadth, height;
        int totalArea,volume;

        System.out.println("Enter Lenght Breadth and Height");
        lenght = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        totalArea = 2*(lenght*breadth+lenght*height+breadth*height);
        volume = lenght*breadth*height ;

        System.out.println("Total Area "+ totalArea);
        System.out.println("Volume "+ volume);


    }
}