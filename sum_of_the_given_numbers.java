import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}