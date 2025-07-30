

class Base{
    static{
        System.out.println("Static block");
    }
     Base() {
        System.out.println("Base Class Constructor");
    }
    String name = "Amitabh";
	void first(){
		System.out.println("he is a actor");
	}
}
class Child extends Base{
    Child() {
        super();
    }
    String name = "Abhishek";
	void first(){
		System.out.println("He is son of " );
	}
}
class Person{
	public static void main(String[]args){
		Child ch = new Child();
       System.out.println(ch.name);
	}
}