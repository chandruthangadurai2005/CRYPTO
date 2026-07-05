
import java.util.Scanner;

public class Caesar {
   
    
    public static String encry(String a,int k){
        
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<a.length();i++){
              char b=a.charAt(i);
              int v=b-'a';
              v+=k;
              v=v%26;
              ans.append((char)('a'+v));

        }
        return ans.toString();
    }
    public static String decry(String a,int k){
        
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<a.length();i++){
              char b=a.charAt(i);
              int v=b-'a';
             
              v=(v -k + 26) % 26;
              ans.append( (char)('a'+v));

        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter plain text:");
        String a = sc.next();

        System.out.println("Enter key:");
        int key = sc.nextInt();

        String enc = encry(a, key);
        System.out.println("Encrypted: " + enc);

        String dec = decry(enc, key);
        System.out.println("Decrypted: " + dec);

        sc.close();
    }
}
