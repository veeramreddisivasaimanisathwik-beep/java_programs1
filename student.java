class student{
    String name;
    int age;
    int id;
    public void adddetails(String a,int b,int c){
        name=a;
        age=b;
        id=c;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
    public static void main (String[] args){
        student s1=new student();
        s1.adddetails("sathwik",20,68);
        s1.display();
    }
}