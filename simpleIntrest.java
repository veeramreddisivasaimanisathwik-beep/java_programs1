import java.util.Scanner;
public class simpleIntrest {
           public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter the principal amount:");
               int p = sc.nextInt();
               System.out.println("Enter the rate of interest:");
               int r = sc.nextInt();
               System.out.println("Enter the time period:");
               int t = sc.nextInt();
               int si = (p * r * t) / 100;
               System.out.println("The simple interest is: " + si);
           }
}
