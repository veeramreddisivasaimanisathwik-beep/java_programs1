public class copy_constructor {
    int i;
    int j;
    public void show(int i,int j){
     this.i=i;
     this.j=j;
    }
    public static void main(String[] args) {
        copy_constructor A=new copy_constructor();
        A.i=10;
        A.j=60;
    }
}
