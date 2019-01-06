 import java.util.Scanner;
public class ass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int h1=sc.nextInt();
       
        int m1=sc.nextInt();
         int h2=sc.nextInt();
        int m2=sc.nextInt();
        int h3=h1-h2;
        int m3;
        if(m1>m2)
        m3=m1-m2;
        else
        m3=m2-m1;
     System.out.println(h3+" "+m3);
    }
}