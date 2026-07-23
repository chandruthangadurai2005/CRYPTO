class TranspositionCipher {


    String encrypt(String text,int key) {


        String result="";


        for(int col=0;col<key;col++) {


            for(int i=col;i<text.length();i+=key) {

                result+=text.charAt(i);

            }

        }


        return result;

    }

}



public class Main {

    public static void main(String args[]) {


        TranspositionCipher obj=new TranspositionCipher();


        System.out.println(
                obj.encrypt("HELLOWORLD",4)
        );

    }
}
