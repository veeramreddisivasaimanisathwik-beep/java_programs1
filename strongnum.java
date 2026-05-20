
import java.util.Scanner;

public class strongnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        int original=num;
        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(sum==original){
            System.err.println("the num is strong num");
        }
        else{
            System.err.println("the num is not strong num");
        }
    }
}
