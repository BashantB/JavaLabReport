// Base Class Vehicle
class Vehicle {

    // Private Fields
    private String make; 
    private String color; 
    private int year;      
    private String model;   
    private int seats;
    private int wheels;
  
  
    // Parameterized Constructor
    public Vehicle(String make, String color, int year, String model,int seats,int wheels) {
      this.make = make;
      this.color = color;
      this.year = year;  
      this.model = model; 
      this.seats = seats;
      this.wheels = wheels;
    }
  
    // public method to print details
    public void printDetails() {
      System.out.println("Manufacturer: " + make);
      System.out.println("Color: " + color);
      System.out.println("Year: " + year);
      System.out.println("Model: " + model);
      System.out.println("Seats: " + seats);
      System.out.println("Wheels: " + wheels);
    }
    
  }
  
  // Derived Class Car
  class Car extends Vehicle {
  
    // Private field
    private String bodyStyle;
  
    // Parameterized Constructor
    public Car(String make, String color, int year, String model, String bodyStyle,int seats,int wheel) {
      super(make, color, year, model,seats,wheel);  //calling parent class constructor
      this.bodyStyle = bodyStyle;       
    }
  
    public void carDetails() {  //details of car
      printDetails();         //calling method from parent class
      System.out.println("Body Style: " + bodyStyle);
    }
    
  }
  
  class Inheritance {
  
    public static void main(String[] args) {
      System.out.println("Bashant Bist 019-322");
      Car fortuner = new Car("Toyata", "B/W", 2014, "Fortuner-2700", "SUV",12,4); //creation of car Object
      fortuner.carDetails(); //calling method to print details
    }
    
  }