public class A {
    int i;
    static int j;
    public void m1(){
        System.out.println(i);
        System.out.println(j);
    }
    public void m2(){
        System.out.println(i);
        System.out.println(j);
    }
    public static void main(String[] args){
        A a=new A();
        a.i=10;
        A.j=90;
        a.m1();
        A a1=new A();
        a1.m2();
    }
}
