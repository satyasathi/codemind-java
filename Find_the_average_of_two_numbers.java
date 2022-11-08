import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        float avg;
        sum=a+b;
        avg=(float)sum/2;
        System.out.format("%.4f",avg);
    }
}