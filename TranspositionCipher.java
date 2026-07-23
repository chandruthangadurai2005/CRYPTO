class TranspositionCipher {


    String encrypt(String text,int key) {

        String result="";


        for(int col=0;col<key;col++) {

            for(int i=col;i<text.length();i+=key)

                result+=text.charAt(i);

        }

        return result;
    }



    String decrypt(String text,int key) {


        char matrix[][]=new char[
                (int)Math.ceil((double)text.length()/key)
                ][key];


        int k=0;


        for(int col=0;col<key;col++) {

            for(int row=0;row<matrix.length;row++) {


                if(k<text.length())

                    matrix[row][col]=text.charAt(k++);

            }

        }


        String result="";


        for(int i=0;i<matrix.length;i++) {

            for(int j=0;j<key;j++) {

                result+=matrix[i][j];

            }

        }


        return result;

    }

}



public class Main {

    public static void main(String args[]) {


        TranspositionCipher obj=new TranspositionCipher();


        String cipher=obj.encrypt("HELLOWORLD",4);


        System.out.println(cipher);


        System.out.println(obj.decrypt(cipher,4));

    }

}
