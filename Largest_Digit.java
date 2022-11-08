import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,r,max=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r>max)
            max=r;
            n=n/10;
        }
        System.out.println(max);
    }
}