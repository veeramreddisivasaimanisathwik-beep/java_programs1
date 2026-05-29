public class mobile {
    String name;
    int ram;
    int rom;
    double price;
    static String color;
    public class demo{
        public static void main(String[] args){
            mobile m1=new mobile();
            m1.name="iphone";
            m1.ram=4;
            m1.rom=128;
            m1.price=70000;
            mobile.color="black";
            System.out.println(m1.name+"\t"+m1.ram+"\t"+m1.rom+"\t"+m1.price+"\t"+mobile.color);
        }
    }
}

