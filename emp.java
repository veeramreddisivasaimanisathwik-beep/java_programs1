import java.util.Scanner;
public class emp {
    String name;
    int age;
    int rollno;
    emp(){
    }
    emp(String name){
        this.name=name;
    }
    emp(String name,int age){
        this(name);
        this.age=age;
    }
    emp(String name,int age,int rollno){
        this(name,age);
        this.rollno=rollno;
    }
    public void display(){
        //System.out.println("Emp name:"+name);
        //System.out.println("age:"+age);
        //System.out.println("rollno:"+rollno);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details");
        name=sc.next();
        age=sc.nextInt();
        rollno=sc.nextInt();
        System.out.println("name:"+name);
        System.out.println("age"+age);
        System.out.println("rollno"+rollno);
    }
    public static void main(String[] args) {
        emp S=new emp();
        S.display();

    }
}
