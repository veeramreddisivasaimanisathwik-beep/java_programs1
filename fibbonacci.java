
import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<=num;i++){
            System.err.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
        System.err.println("the fibbonacci series is:"+num);
        sc.close();
    }
}
