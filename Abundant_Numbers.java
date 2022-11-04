import java.util.*;
class arr{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                x+=i;
            }
        }
        if(x>n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}