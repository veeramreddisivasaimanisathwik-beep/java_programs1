
import java.util.Scanner;

public class amstrongnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        int original =num;
        while(num>0){
            int digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        if(sum==original){
            System.out.println("The number is an Armstrong number.");
        }
        else{
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
