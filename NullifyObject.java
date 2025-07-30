class A{
 String name;
 int age;
} 
public class NullifyObject{
    static  void nullify(A a){
        a = null;
    }
    public static void main(String[] args) {
        A a = new A();
        nullify(a);
        System.out.println("Nullify object:"+a.name +a.age); //output: null0
    }
}
