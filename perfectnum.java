
import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num=sc.nextInt();
        int sum=0;
        int original=num;
        for(int i=1;i<=num/2;i++){
            sum=sum+i;
        }
        if(sum==original){
            System.err.println("the num is perfect num");
        }
        else{
            System.err.println("the num is not perfect num");
        }
    }
    
}
