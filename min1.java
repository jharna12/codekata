import java.util.Scanner;
public class ass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(a[i]>=65&& a[i]<=90||a[i]>=97&&a[i]<=122)
        {
            System.out.println("invalid");
        }
        int max=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]<max)
            max=a[i];
        }
        System.out.println(max);
    }
}
