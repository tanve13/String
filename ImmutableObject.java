public class ImmutableObject{
  static void updateString(String s){
   s = s + "Class";
  }
  public static void main(String[]Args){
  String str = "Hello";
  updateString(str);
  System.out.println("After Update Method: " +str);
  }
}