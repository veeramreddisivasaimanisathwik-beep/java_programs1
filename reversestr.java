
import java.util.Scanner;

public class reversestr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String a=sc.nextLine();
        String rev="";
        String temp=a;
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        System.out.println("The reversed string is: "+rev);
            if(temp.equals(rev)){
                System.out.println("the string is palindrome");
            }
            else{
                System.out.println("the string is not palindrome");
            }
        sc.close();
    }
}
