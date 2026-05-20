
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the binary number:");
        int binarynum=sc.nextInt();
        int decimal=0;
        int base=1;
        while(binarynum>0){
            int lastdigit=binarynum%10;
            decimal=decimal+lastdigit*base;
            base=base*2;
            binarynum=binarynum/10;
        }
        System.out.println("the decimal number is:"+decimal);
    }
}
