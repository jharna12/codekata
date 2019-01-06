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
        for(i=0;i<l;i++)
        {
          reverse=  reverse+s.charAt(i);
        }
         reverse=reverse+'.';
           System.out.println(reverse);
    }
}