import java.util.*;

public class scstring 
{
    public static void main(String[] args)
    {
    int b = 1800110;

    String str=String.valueOf(b);
    System.out.println(str.matches("[01]+"));

    String s="12AB";
    System.out.println(s.matches("[0-9A-F]+"));

    String d="01/12/2000";
    System.out.println(d.matches("[0-3][0-9]+"));
    }
}