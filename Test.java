class Car {
    String color;
}

public class Test {
    static void changeColor(Car c) {
        c.color = "Red";
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.color = "Blue";
        changeColor(c); 
      System.out.println("Car Color: " + c.color);  
    }
}
