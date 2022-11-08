import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq;
        n=sc.nextInt();
        sq=(int)Math.sqrt(n);
        if(sq*sq==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}