import java.util.Scanner;
public class book {
    String name;
    String author;
    double price;
    public static book getbook(){
        book b1=new book();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book details:");
        b1.name=sc.next();
        b1.author=sc.next();
        b1.price=sc.nextDouble();
        return b1;
    }
    public static void main(String[] args){
        book b1=getbook();
        System.out.println(b1.name+" "+b1.author+" "+b1.price);
    }
}