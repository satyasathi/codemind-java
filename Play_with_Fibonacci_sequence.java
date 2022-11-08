import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x=0,y=1,sum=0;
        n=sc.nextInt();
        System.out.print(x+" "+y+" ");
        for(int i=1;i<n-1;i++)
        {
            sum=x+y;
            x=y;
            y=sum;
            System.out.print(sum+" ");
        }
    }
}