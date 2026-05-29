class B{
    int i;
    static int j;
    public void m1(){
        i++;
        j++;
    }
    public static void main(String[] args){
        B a1=new B();
        B a2=new B();
        a1.m1();
        a2.m1();
        System.out.println(a1.i);
        System.out.println(B.j);
        System.out.println(a2.i);
        System.out.println(B.j);
    }
}
