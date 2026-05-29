class abandan{
    static int i=30;
    int j=80;
public static void m1(){
    System.out.println(i);
    //System.out.println(j);
}
public static void m2(){
    System.out.println(i);
    //System.out.println(j);
}
public static void main(String[] args){
    new abandan().m1();
    new abandan().m2();
}
}