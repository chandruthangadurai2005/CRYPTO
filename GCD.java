import java.util.*;

class GCD{
    public static int gcd_rec(int x,int y){
         if(y==0) return x;
         return gcd_rec(y,x%y); 
    }
    public static int gcd(int x,int y){
          while(y!=0){
            int t=x;
            x=y;
            y=t%x;
          }
          return x;
    }
    public static void main(String []args){
           Scanner sc=new Scanner(System.in);
           System.out.println("enter two numbers to find gcd");
           int a=sc.nextInt();
           int b=sc.nextInt();
           int ans=gcd_rec(a,b);
           System.out.println("GCD "+ans);
    }

}