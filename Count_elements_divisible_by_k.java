import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n,x[],i,k;
       n=sc.nextInt();
       k=sc.nextInt();
       x=new int[n];
       for(i=0;i<n;i++)
       x[i]=sc.nextInt();
       int c=0;
       for(i=0;i<n;i++)
       {
           if(x[i]%k==0)
           {
               c++;
           }
       }
       System.out.println(c);
   }
}