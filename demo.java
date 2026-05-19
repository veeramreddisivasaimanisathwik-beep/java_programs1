public class demo{
    public static void main(String[] args) {
        Runnable obj1= () ->
    {
      for(int i=1;i<=5;i++){
        System.out.println("hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
          System.out.println("e");
        }
      }
        Runnable obj2= () ->
    {
      for(int i=1;i<=5;i++){
        System.out.println("hello");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
        }
        }
      }
        Thread t1 = new Thread(obj1); 
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}