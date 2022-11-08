import java.util.Scanner;
class Palindrome
{
   public static boolean isPalindrome(int n)
   {
         int temp=n,r,sum=0;
		 while(n>0)
		 {
		     r=n%10;
			 sum=sum*10+r;
			 n=n/10;
		 }
        if(sum==temp)
           return true;
        else
           return false;
    }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n,i,d1=0,d2=0;
       n=sc.nextInt();
       for(i=n+1;;i++)
       {
           if(isPalindrome(i))
           {
               d1=i;
               break;
           }
       }
       for(i=n-1;i>=1;i--)
       {
           if(isPalindrome(i))
           {
               d2=i;
               break;
           }
       }
       if(d1-n>n-d2)
       System.out.println(d2);
       else if(d1-n<n-d2)
       System.out.println(d1);
       else
       System.out.println(d2+" "+d1);
   }
}