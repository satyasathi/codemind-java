import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,min=0,gcd=0;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        min=a;
        else
        min=b;
        for(int i=min;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
    }
}