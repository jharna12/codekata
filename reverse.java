 import java.util.Scanner;
public class ass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    
        int i,l=0;
        l=s.length();
       String reverse="";
        for(i=l-1;i>=0;i--)
        {
          reverse=  reverse+s.charAt(i);
        }
           System.out.println(reverse);
    }
}