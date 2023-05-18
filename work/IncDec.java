import java.lang.*;

class IncDec
{
    public static void main(String arg[])
    {
        int x=5,y=4,z;
        z=2*x++ + 3 * ++x;
        System.out.println(z);

        float a = 3.5f;
        a++;
        System.out.println(a);

        char c = 'A';
        c++;
        System.out.println(c);



    }
}