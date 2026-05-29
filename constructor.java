public class constructor {
    constructor(int i){
        System.out.println("the number is:"+i);
    }
    public static void main(String[] args){
        new constructor(10);
        constructor a=new constructor(30);
        new constructor(3+6);
    }
}
