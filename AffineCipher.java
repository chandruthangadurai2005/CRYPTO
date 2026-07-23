class AffineCipher {

    int a;
    int b;

    AffineCipher(int a, int b) {
        this.a = a;
        this.b = b;
    }


    int inverse(int a) {

        for(int i=1;i<26;i++) {
            if((a*i)%26 == 1)
                return i;
        }

        return -1;
    }


    String encrypt(String text) {

        String result="";

        for(char c:text.toCharArray()) {

            int x=c-'A';

            int y=(a*x+b)%26;

            result += (char)(y+'A');
        }

        return result;
    }


    String decrypt(String text) {

        String result="";

        int inv=inverse(a);


        for(char c:text.toCharArray()) {

            int y=c-'A';

            int x=(inv*(y-b+26))%26;

            result += (char)(x+'A');
        }

        return result;
    }

}


public class Main {

    public static void main(String args[]) {

        AffineCipher obj=new AffineCipher(5,8);


        String cipher=obj.encrypt("HELLO");

        System.out.println("Encrypted : "+cipher);


        System.out.println("Decrypted : "+obj.decrypt(cipher));
    }
}
