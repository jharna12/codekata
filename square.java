 import java.util.Scanner;
public class ass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n<0)
     System.out.println("invalid");
    int r=0,s=0;
    while(n>0)
    {
    r=n%10;
    s=s+r*r;
    n=n/10;
    }
    System.out.println(s);
    }
}