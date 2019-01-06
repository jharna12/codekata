import java.util.Scanner;
public class number
{
    public static void main(String[] args)
{
Scannersc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=65&&n<=90||n>=97&&n<=122)
System.out.println("invalid");
int f=1;
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out.println(f);
}
}