import java.util.*;
class arr{
    public static void main(String args[]){
        int n,d;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>10){
            int x=0;
            while(n>0){
            d=n%10;
            n=n/10;
            x+=d;
            }
        n=x;
    }
    System.out.println(n);
}
}