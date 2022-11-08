import java.util.Scanner;
class Palindrome
{
   public static int reverse(int n)
   {
         int r,sum=0;
         n=Math.abs(n);
		 while(n>0)
		 {
		     r=n%10;
			 sum=sum*10+r;
			 n=n/10;
		 }
       return sum;
    }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n;
       n=sc.nextInt();
       if(n<0)
       System.out.println("-"+reverse(n));
       else
       System.out.println(reverse(n));

   }
}
