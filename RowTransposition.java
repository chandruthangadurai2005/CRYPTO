class RowTransposition {


    String encrypt(String text,int columns) {


        int rows=(int)Math.ceil((double)text.length()/columns);


        char matrix[][]=new char[rows][columns];


        int k=0;


        for(int i=0;i<rows;i++) {

            for(int j=0;j<columns;j++) {


                if(k<text.length())

                    matrix[i][j]=text.charAt(k++);

            }

        }


        String result="";


        for(int j=0;j<columns;j++) {


            for(int i=0;i<rows;i++) {


                result+=matrix[i][j];

            }

        }


        return result;

    }

}



public class Main {


    public static void main(String args[]) {


        RowTransposition obj=new RowTransposition();


        System.out.println(obj.encrypt("HELLOWORLD",4));

    }

}
