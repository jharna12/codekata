import java.util.Scanner;
public class ass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    if(s=="monday"||s=="tueday"||s=="wednesday"||s=="friday"||s=="thursday")
     System.out.println("no");
      else if( s=="saturday"||s=="sunday")
           System.out.println("yes");
           else
            System.out.println("invalid");
    }
}