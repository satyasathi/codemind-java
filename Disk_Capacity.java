import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b,c;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        c=2*512*t*s*b;
        System.out.println(c);
    }
}