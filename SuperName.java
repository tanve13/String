class Base{
	String name = "Amitabh";
	void first(){
		System.out.println("he is a actor");
	}
}
class Child extends Base{
	String name = "Abhishek";
	void first(){
		System.out.println("He is son of "  +super.name );
	}
}
class Person{
	public static void main(String[]args){
		Child ch = new Child();
      ch.first();
	}
}