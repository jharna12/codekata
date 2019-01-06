import java.util.Scanner;

public class ass

{
 
   public static void main(String[] args)
    
{
        
Scanner sc=new Scanner(System.in);
       
 int n=sc.nextInt();
        
int a=sc.nextInt();
        
int d=sc.nextInt();
if(n<0||a<0||d<0)
System.out.println("invalid");
   
     int s=0;
       
 s=(n*(2*a+(n-1)*d))/2;
        
System.out.println(s);
   
 }
}
