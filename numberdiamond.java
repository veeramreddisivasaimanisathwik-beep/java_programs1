import java.util.Scanner;
public class numberdiamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int spaces=num-1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
            System.out.print(j);
            }
            System.out.println("");
        }
    }
}
