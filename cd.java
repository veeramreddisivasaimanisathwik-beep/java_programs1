
import java.util.Scanner;

public class cd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        int gcd=1;
        int lcm=1;
        for(int i=1;i<=num1/2 && i<=num2/2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
            lcm=(num1*num2)/gcd;
        }
        System.err.println("the gcd of two numbers is"+gcd);
        System.out.println("the lcm of "+num1+" and "+num2+" is "+lcm);
        sc.close();
    }
}
