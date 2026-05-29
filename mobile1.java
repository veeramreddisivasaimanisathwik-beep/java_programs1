class mobile1{
    public static void m1(int i){
        System.out.println("m1(int i)"+i);
    }
    public static void m1(A a){
        System.out.println("m1(A a)"+a);
    }
    public static void main(String[] args){
        m1(10);
        A a=new A();
        m1(a);
    }
}