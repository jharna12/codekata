 import java.util.Scanner;
public class ass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
       int h=m/60;
       m=m%60;
             System.out.println(h+" "+m);
    }
}