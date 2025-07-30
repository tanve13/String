class Student{
    String name;
    int age;
}
public class ResetObject{
static  void resetStudent(Student stu){
stu.name = "Tanveer";
stu.age = 20;
}
public static void main(String[] args) {
    Student stu = new Student();
    stu.name = "tanve";
    stu.age = 19;
    resetStudent(stu);
    System.err.println("Reset values: "+stu.name +stu.age);
}
}