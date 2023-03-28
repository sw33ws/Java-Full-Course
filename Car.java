// public class Car {
    
//     String make = "Chevrolet";
//     String model = "Corvette";
//     int year = 2020;
//     String color = "blue";
//     double price = 50000.00;

//     void drive() {
//         System.out.println("You drive the car");
//     }
//     void brake() {
//         System.out.println("You step on the brake");
//     }

// }

// public class Car {
    
//     String make = "Ford";
//     String model = "Mustang";
//     String color = "red";
//     int year = 2020;

//     public String toString() {

//         // String myString = make +"/n"+model +"/n"+color +"/n"+year;
//         // return myString;

//         return make +"\n"+model +"\n"+color +"\n"+year;
//     }

// }

// public class Car {

//     String name;

//     Car(String name) {
//         this.name = name;
//     }
// }



// public class Car extends Vehicle {

//     int wheels = 4;
//     int doors = 4;
// }



// public class Car extends Vehicle {

//     @Override
//     void go() {
//         System.out.println("The Driver is dring the car");
//     }

// }



// public class Car {

//     private String make;
//     private String model;
//     private int year;

//     Car(String make, String model, int year) {

//         this.setMake(make);
//         this.setModel(model);
//         this.setYear(year);
//     }

//     public String getMake() {
//         return make;
//     }

//     public String getModel() {
//         return model;
//     }

//     public int getYear() {
//         return year;
//     }

//     public void setMake(String make) {
//         this.make = make;
//     }

//     public void setModel(String model) {
//         this.model = model;
//     }

//     public void setYear(int year) {
//         this.year = year;
//     }
// }



// public class Car {

//     private String make;
//     private String model;
//     private int year;

//     Car(String make, String model, int year) {

//         this.setMake(make);
//         this.setModel(model);
//         this.setYear(year);
//     }

//     Car(Car x) {
//         this.copy(x);
//     }

//     public String getMake() {
//         return make;
//     }

//     public String getModel() {
//         return model;
//     }

//     public int getYear() {
//         return year;
//     }

//     public void setMake(String make) {
//         this.make = make;
//     }

//     public void setModel(String model) {
//         this.model = model;
//     }

//     public void setYear(int year) {
//         this.year = year;
//     }

//     public void copy(Car x) {
//         this.setMake(x.getMake());
//         this.setModel(x.getModel());
//         this.setYear(x.getYear());
//     }
// }



public class Car extends Vehicle {

    @Override
    public void go() {
        System.out.println("The car begins moving");
    }
}