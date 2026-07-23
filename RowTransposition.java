class RowTransposition {


    String encrypt(String text,int col) {


        int row=(int)Math.ceil((double)text.length()/col);


        char matrix[][]=new char[row][col];


        int k=0;


        for(int i=0;i<row;i++)

            for(int j=0;j<col;j++)

                if(k<text.length())

                    matrix[i][j]=text.charAt(k++);



        String ans="";


        for(int j=0;j<col;j++)

            for(int i=0;i<row;i++)

                ans+=matrix[i][j];


        return ans;

    }




    String decrypt(String text,int col) {


        int row=(int)Math.ceil((double)text.length()/col);


        char matrix[][]=new char[row][col];


        int k=0;


        for(int j=0;j<col;j++)

            for(int i=0;i<row;i++)

                matrix[i][j]=text.charAt(k++);



        String ans="";


        for(int i=0;i<row;i++)

            for(int j=0;j<col;j++)

                ans+=matrix[i][j];


        return ans;

    }

}



public class Main {

    public static void main(String args[]) {


        RowTransposition obj=new RowTransposition();


        String cipher=obj.encrypt("HELLOWORLD",4);


        System.out.println(cipher);


        System.out.println(obj.decrypt(cipher,4));

    }

}
