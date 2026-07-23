class ExtendedEuclid {


    int inverse(int a,int m) {


        int m0=m;

        int x0=0;

        int x1=1;



        while(a>1) {


            int q=a/m;


            int temp=m;

            m=a%m;

            a=temp;



            temp=x0;

            x0=x1-q*x0;

            x1=temp;

        }


        if(x1<0)

            x1+=m0;



        return x1;

    }

}



public class Main {


    public static void main(String args[]) {


        ExtendedEuclid obj=new ExtendedEuclid();


        System.out.println(
                obj.inverse(7,26)
        );

    }

}
