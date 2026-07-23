class ColumnCipher {


    String encrypt(String text,String key) {


        int rows=(int)Math.ceil((double)text.length()/key.length());


        char matrix[][]=new char[rows][key.length()];


        int k=0;


        for(int i=0;i<rows;i++) {

            for(int j=0;j<key.length();j++) {


                if(k<text.length())

                    matrix[i][j]=text.charAt(k++);

            }

        }


        String result="";


        for(int j=0;j<key.length();j++) {


            for(int i=0;i<rows;i++) {


                result+=matrix[i][j];

            }

        }


        return result;

    }

}



public class Main {

    public static void main(String args[]) {


        ColumnCipher obj=new ColumnCipher();


        System.out.println(
                obj.encrypt("ATTACKATDAWN","ZEBRA")
        );

    }
}
