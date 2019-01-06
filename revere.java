import java.util.Scanner;
public class number
{
    public static void main(String[] args)
{
Scannersc=new Scanner(System.in);
int t=sc.nextInt();
if(t<0)
System.out.println("invalid");
int n;
n=t;
int r=0,s=0;
while(n>0)
{
r=n%10;
s=s*10+r;
n=n/10;
}
System.out.println(s);

}
}