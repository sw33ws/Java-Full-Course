// The file its self must be named the same as the public class

// public class Main {

//     public static void main(String[] args) {
        
//         // Without the ln in the print statemnt, it will be one line
//         // \n also makes it continue to the next line, both ln and \n together push it an extra line down
//         System.out.println("I Love pizza\n");
//         System.out.print("It's really good");

//     }

// }



// public class Main {

//     public static void main(String[] args) {
        
//         int x = 123; // initialization, int can only store 2 billion
//         // long x = 12345678901234L;
//         // byte x = 100; // bytes can store up to 127
//         // float y = 3.14f;
//         double y = 3.14; // doubles can hold up too 15 digets after the decimal point
//         boolean z = false;
//         char symbol = '@';
//         String name = "Cat";

//         System.out.println("Hello "+name);

//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         String x = "water";
//         String y = "Kool-Aid";
//         String temp;

//         temp = x;
//         x=y;
//         y=temp;

//         System.out.println("x: "+x);
//         System.out.println("y: "+y);
//     }
// }



// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("What is your name? ");
//         String name = scanner.nextLine();
//         System.out.println("How old are you? ");
//         int age = scanner.nextInt();
//         scanner.nextLine(); // Without this line, it will skip over what is your favourite food
//         System.out.println("What is your favorite food ");
//         String food = scanner.nextLine();

//         System.out.println("Hello "+name);
//         System.out.println("You are "+age+" years old");
//         System.out.println("You like "+food);
//     }
// }



// public class Main {

//     public static void main(String[] args) {

//         // + - * / %
        
//         double friends = 10;

//         // friends = friends % 2;

//         // friends++;

//         friends = (double) friends / 3;


//         System.out.println(friends);
//     }
// }



// // GUI intro
// import javax.swing.JOptionPane;

// public class Main {

//     public static void main(String[] args) {
        
//         String name = JOptionPane.showInputDialog("Enter Your Name");
//         JOptionPane.showMessageDialog(null, "Hello "+name);

//         int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
//         JOptionPane.showMessageDialog(null, "You are "+age+" years old");

//         Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
//         JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
//     }
// }



// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
        
//         // double x = 3.14;
//         // double y = -10;

//         // double z = Math.round(x); // .max .min .abs .sqrt .round .floor

//         // System.out.println(z);

//         double x;
//         double y;
//         double z;

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter side x: ");
//         x = scanner.nextDouble();
//         System.out.println("Enter side y: ");
//         y = scanner.nextDouble();

//         z = Math.sqrt((x*x)+(y*y));

//         System.out.println("The hypotenuse is : "+z);

//         scanner.close();
//     }
// }



// import java.util.Random;

// public class Main {

//     public static void main(String[] args) {
        
//         Random random  = new Random();

//         // int x = random.nextInt(6)+1;
//         // double y = random.nextDouble();
//         boolean z = random.nextBoolean();

//         System.out.println(z);
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         int age = 75;

//         if(age==75) {
//             System.out.println("Ok Boomer!");
//         }
//         else if(age>=18) {
//             System.out.println("You are an adult");
//         }
//         else if(age>=13) {
//             System.out.println("You are a teenager");
//         }
//         else {
//             System.out.println("You are not an adult");
//         }
//     }
// }



// // Switch Statement
// public class Main {

//     public static void main(String[] args) {
        
//         String day = "Friday";

//         switch(day) {
//             case "Sunday": System.out.println("It is Sunday");
//             break;
//             case "Monday": System.out.println("It is Monday");
//             break;
//             case "Tuesday": System.out.println("It is Tuesday");
//             break;
//             case "Wednesday": System.out.println("It is Wednesday");
//             break;
//             case "Thursday": System.out.println("It is Thursday");
//             break;
//             case "Friday": System.out.println("It is Friday");
//             break;
//             case "Saturday": System.out.println("It is Saturday");
//             break;
//             default: System.out.println("That is not a day!");
//         }
//     }
// }


// // Logical Operators
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
        
//         // int temp = 25;

//         // if(temp>30) {
//         //     System.out.println("It is hot outside");
//         // }
//         // else if(temp>20 && temp<=30) {
//         //     System.out.println("It is warm outside");
//         // }
//         // else {
//         //     System.out.println("It is cold outside");
//         // }

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("You are playing a game! press q or Q to quit");
//         String response = scanner.next();

//         // if(response.equals("q") || response.equals("Q")) {
//         //     System.out.println("You quit the game");
//         // }
//         // else {
//         //     System.out.println("You are still playing the game");
//         // }

//         if(!response.equals("q") && !response.equals("Q")) {
//             System.out.println("You are still playing the game");
//         }
//         else {
//             System.out.println("You quit the game");
//         }

//         scanner.close();
//     }

// }



// // while loop
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
//         String name = "";

//         while(name.isBlank()) {
//             System.out.print("Enter your name: ");
//             name = scanner.nextLine();
//         }

//         scanner.close();
//         System.out.println("Hello "+name);
//     }
// }



// // For Loop
// public class Main {

//     public static void main(String[] args) {
        
//         for(int i = 0; i<=10; i+=2) {
//             System.out.println(i);
//         }

//         System.out.println("Happy New Year!");
//     }
// }



// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
//         int rows;
//         int columns;
//         String symbol = "";

//         System.out.println("Enter # of rows: ");
//         rows = scanner.nextInt();
//         System.out.println("Enter # of columns: ");
//         columns = scanner.nextInt();
//         System.out.println("Enter symbol of use: ");
//         symbol = scanner.next();

//         for(int i=1; i<=rows; i++) {
//             System.out.println();
//             for(int j=1; j<=columns; j++) {
//                 System.out.print(symbol);
//             }
//         }

//         scanner.close();
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         // String[] cars = {"Camaro","Corvette","Tesla","BMW"};

//         // cars[0] = "Mustange";

//         // System.out.println(cars[0]);

//         String[] cars = new String[3];

//         cars[0] = "Camaro";
//         cars[1] = "Corvette";
//         cars[2] = "Tesla";

//         for(int i=0; i<cars.length; i++) {
//             System.out.println(cars[i]);
//         }
//     }
// }

// // 2D Arrays
// public class Main {

//     public static void main(String[] args) {
        
//         // String[][] cars = new String[3][3];

//         // cars[0][0] = "Camaro";
//         // cars[0][1] = "Corvette";
//         // cars[0][2] = "Silverado";
//         // cars[1][0] = "Mustange";
//         // cars[1][1] = "Ranger";
//         // cars[1][2] = "F-150";
//         // cars[2][0] = "Ferrari";
//         // cars[2][1] = "Lambo";
//         // cars[2][2] = "Tesla";

//         String[][] cars = {
//             {"Camaro","Corvette","Silverado"},
//             {"Mustange","Ranger","F-150"},
//             {"Ferrari","Lambo","Tesla"}
//         };

//         for(int i=0; i<cars.length; i++) {
//             System.out.println();
//             for(int j=0; j<cars[i].length; j++) {
//                 System.out.print(cars[i][j]+" ");
//             }
//         }
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         String name = "Cat";

//         // boolean result = name.equalsIgnoreCase("cat");
//         // int result = name.length();
//         // char result = name.charAt(0);
//         // int result = name.indexOf("C");
//         // boolean result = name.isEmpty();
//         // String result = name.toUpperCase();
//         // String result = name.toLowerCase();
//         // String result = name.trim();
//         String result = name.replace('a', 'o');

//         System.out.println(result);
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         boolean a = true;
//         Character b = '@';
//         Integer c = 123;
//         Double d = 3.14;
//         String e = "Cat";

//         if(a==true) {
//             System.out.println("This is true");
//         }
//     }
// }



// import java.util.ArrayList;
// public class Main {

//     public static void main(String[] args) {
        
//         ArrayList<String> food = new ArrayList<String>();

//         food.add("pizza");
//         food.add("hamburger");
//         food.add("hotdog");

//         food.set(0, "sushi");
//         food.remove(2);
//         food.clear();

//         for(int i=0; i<food.size(); i++) {
//             System.out.println(food.get(i));
//         }
//     }
// }



// import java.util.ArrayList;
// public class Main {

//     public static void main(String[] args) {

//         ArrayList<ArrayList<String>> groceryList = new ArrayList();
        
//         ArrayList<String> bakeryList = new ArrayList();
//         bakeryList.add("pasta");
//         bakeryList.add("garlic bread");
//         bakeryList.add("donuts");

//         ArrayList<String> produceList = new ArrayList();
//         produceList.add("tomatoes");
//         produceList.add("zucchini");
//         produceList.add("peppers");

//         ArrayList<String> drinksList = new ArrayList();
//         drinksList.add("soda");
//         drinksList.add("juice");

//         groceryList.add(bakeryList);
//         groceryList.add(produceList);
//         groceryList.add(drinksList);

//         System.out.println(groceryList.get(0).get(0));
//     }
// }



// import java.util.ArrayList;
// public class Main {

//     public static void main(String[] args) {
        
//         // String[] animals = {"cat","bird","rat","bird"};
//         ArrayList<String> animals = new ArrayList<String>();

//         animals.add("cat");
//         animals.add("dog");
//         animals.add("rat");
//         animals.add("bird");

//         for(String i : animals) {
//             System.out.println(i);
//         }
//     }
// }



// // Methods
// public class Main {

//     public static void main(String[] args) {
        
//         // String name = "Cat";
//         // int age = 21;

//         // hello(name,age);

//         int x = 3;
//         int y =4;

//         // int z = add(x,y);
    
//         // System.out.println(z);

//         System.out.println(add(x,y));

//     }

//     // static void hello(String title, int number) {
//     //     System.out.println("Hello "+title);
//     //     System.out.println("You are "+number);
//     // }

//     static int add(int x, int y) {

//         // int z = x+ y;

//         // return z;

//         return x + y;

//     }
// }




// // Overloaded Methods
// public class Main {

//     public static void main(String[] args) {
        
//         // int x = add(1,2,3,4);
//         double x = add(1.0,2,3,4);

//         System.out.println(x);

//     }

//     static int add(int a, int b) {
//         System.out.println("This is overloaded method #1");
//         return a + b;
//     }
//     static int add(int a, int b, int c) {
//         System.out.println("This is overloaded method #2");
//         return a + b + c;
//     }
//     static int add(int a, int b, int c, int d) {
//         System.out.println("This is overloaded method #3");
//         return a + b + c + d;
//     }

//     static double add(double a, double b) {
//         System.out.println("This is overloaded method #4");
//         return a + b;
//     }
//     static double add(double a, double b, double c) {
//         System.out.println("This is overloaded method #5");
//         return a + b + c;
//     }
//     static double add(double a, double b, double c, double d) {
//         System.out.println("This is overloaded method #6");
//         return a + b + c + d;
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         // System.out.printf("This is a format string %d",123);

//         boolean myBoolean = true;
//         char myChar = '@';
//         String myString = "cat";
//         int myInt = 50;
//         double myDouble = 1000;

//         // System.out.printf("%b",myBoolean);
//         // System.out.printf("%c",myChar);
//         // System.out.printf("%s",myString);
//         // System.out.printf("%d",myInt);
//         // System.out.printf("%f",myDouble);

//         // System.out.printf("Hello %10s",myString);

//         System.out.printf("You have this much money %.2f",myDouble);
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         final double PI = 3.14159;

//         System.out.println(PI);
//     }
// }



// OOP
// public class Main {

//     public static void main(String[] args) {
        
//         Car myCar1 = new Car();
//         Car myCar2 = new Car();

//         // System.out.println(myCar1.make);
//         // System.out.println(myCar1.model);
//         // System.out.println(myCar1.year);
//         // System.out.println(myCar1.color);
//         // System.out.println(myCar1.price);

//         System.out.println(myCar2.make);
//         System.out.println(myCar2.model);

//         // myCar1.drive();
//         // myCar1.brake();
//     }
// }



// // Constructors
// public class Main {

//     public static void main(String[] args) {
        
//         Human human1 = new Human("Brick",65,140);
//         Human human2 = new Human("mordecai",59,75);

//         System.out.println(human1.name);
//         System.out.println(human2.name);

//         human1.eat();
//         human2.drink();
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         DiceRoller diceRoller = new DiceRoller();
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         Pizza pizza = new Pizza("thick crust","tomato","mozzarella","pepperoni");

//         System.out.println("Here are the ingredients of your pizza: ");

//         if(pizza.bread == null) {
            
//         }
//         else {
//             System.out.println(pizza.bread);
//         }

//         if(pizza.sauce == null) {
            
//         }
//         else {
//             System.out.println(pizza.sauce);
//         }

//         if(pizza.cheese == null) {
            
//         }
//         else {
//             System.out.println(pizza.cheese);
//         }

//         if(pizza.topping == null) {
            
//         }
//         else {
//             System.out.println(pizza.topping);
//         }
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         Car car = new Car();

//         System.out.println(car.toString());
//         System.out.println(car);

//     }
// }



// public class Main {

//     public static void main(String[] args) {

//         // Food[] refridgerator = new Food[3];

//         Food food1 = new Food("pizza");
//         Food food2 = new Food("hamburger");
//         Food food3 = new Food("hotdog");

//         Food[] refridgerator = {food1,food2,food3};

//         // refridgerator[0] = food1;
//         // refridgerator[1] = food2;
//         // refridgerator[2] = food3;

//         System.out.println(refridgerator[0].name);
//         System.out.println(refridgerator[1].name);
//         System.out.println(refridgerator[2].name);
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         Garage garage = new Garage();

//         Car car1 = new Car("BMW");
//         Car car2 = new Car("Tesla");

//         garage.park(car2);
//     }
// }



// // Static Keyword
// public class Main {

//     public static void main(String[] args) {

//         Friend friend1 = new Friend("Spongebob");
//         Friend friend2 = new Friend("Patrick");
//         Friend friend3 = new Friend("Squidward");
//         Friend friend4 = new Friend("Sandy");

//         Friend.displayFriends();

//     }
// }



// // inheritance
// public class Main {

//     public static void main(String[] args) {
        
//         Car car = new Car();

//         // car.go();

//         Bicycle bike = new Bicycle();

//         // bike.stop();

//         System.out.println(car.speed);
//         System.out.println(bike.speed);

//         System.out.println(car.doors);
//         System.out.println(bike.pedals);
//     }
// }



// // Method Overridding
// public class Main {

//     public static void main(String[] args) {
        
//         Animal animal = new Animal();
//         Dog dog = new Dog();

//         dog.speak();
//         animal.speak();
//     }
// }



// public class Main {

//     public static void main(String[] args) {
        
//         Hero hero1 = new Hero("Batman",42,"$$$");
//         Hero hero2 = new Hero("Superman",43,"Everything");

//         System.out.println(hero2.toString());
//     }
// }



// // Abstraction
// public class Main {

//     public static void main(String[] args) {
        
//         // Vehicle vehicle = new Vehicle();
//         Car car = new Car();

//         car.go();
//     }
// }



// // Encapsulation
// public class Main {

//     public static void main(String[] args) {
        
//         Car car = new Car("Chevrolet","Camaro",2023);

//         System.out.println(car.getMake());
//         System.out.println(car.getModel());
//         System.out.println(car.getYear());

//         car.setYear(2020);

//         System.out.println(car.getYear());

//     }
// }



// // Copy Objects
// public class Main {

//     public static void main(String[] args) {
        
//         Car car1 = new Car("Chevrolet","Camaro",2023);
//         // Car car2 = new Car("Ford","Mustange",2023);

//         // car2.copy(car1);

//         Car car2 = new Car(car1);

//         System.out.println(car1);
//         System.out.println(car2);
//         System.out.println();
//         System.out.println(car1.getMake());
//         System.out.println(car1.getModel());
//         System.out.println(car1.getYear());
//         System.out.println();
//         System.out.println(car2.getMake());
//         System.out.println(car2.getModel());
//         System.out.println(car2.getYear());
//     }
// }



// // Interface
// public class Main {

//     public static void main(String[] args) {
        
//         Rabbit rabbit = new Rabbit();
//         Hawk hawk = new Hawk();
//         Fish fish = new Fish();

//         rabbit.flee();
//         hawk.hunt();
//         fish.flee();
//         fish.hunt();
//     }
// }



// // Polymorphism
// public class Main {

//     public static void main(String[] args) {
        
//         Car car = new Car();
//         Bicycle bicycle = new Bicycle();
//         Boat boat = new Boat();

//         Vehicle[] racers = {car,bicycle,boat};

//         for(Vehicle x : racers) {
//             x.go();
//         }
//     }
// }


// import java.util.Scanner;
// public class Main {

//     public static void main(String[] args) {
        
//         Animal animal;
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("What animal do you want?");
//         System.out.println("(1=dog) or (2=cat): ");
//         int choice = scanner.nextInt();

//         if(choice==1) {
//             animal = new Dog();
//             animal.speak();
//         }
//         else if(choice==2) {
//             animal = new Cat();
//             animal.speak();
//         }
//         else {
//             animal = new Animal();
//             System.out.println("That Choice was invalid");
//             animal.speak();
//         }
//     }
// }



// // Exception handling
// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         try {

//             System.out.println("Enter a whole number to divide: ");
//             int x = scanner.nextInt();

//             System.out.println("Enter a whole number to divide: ");
//             int y = scanner.nextInt();

//             int z = x/y;

//             System.out.println("result: " + z);
//         }
//         catch(ArithmeticException e) {
//             System.out.println("You can't divide by zero!");
//         }
//         catch(InputMismatchException e) {
//             System.out.println("You can't enter letters and symbols, numbers only");
//         }
//         catch(Exception e) {
//             System.out.println("This is bad practice");
//         }
//         finally {
//             scanner.close();
//             System.out.println("This will always print, its good for closing things like scanners");
//         }
//     }
// }



// import java.io.File;

// public class Main {

//     public static void main(String[] args) {
        
//         File file = new File("javatest.txt");
        
//         if(file.exists()) {
//             System.out.println("That file exists!");
//             System.out.println(file.getPath());
//             System.out.println(file.getAbsolutePath());
//             System.out.println(file.isFile());
//             file.delete();
//         }
//         else {
//             System.out.println("That file doesn't exists!");
//         }
//     }
// }



// // File Writer

// import java.io.FileWriter;
// import java.io.IOException;

// public class Main {

//     public static void main(String[] args) {
        
//         try {
//             FileWriter writer = new FileWriter("poem.txt");
//             writer.write("Roses are red \nViolets are blue");
//             writer.append("\n(A Poem by me!)");
//             writer.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }



// // File Writer

// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

// public class Main {

//     public static void main(String[] args) {
        
//         try {
//             FileReader reader = new FileReader("javatest.txt");
//             int data = reader.read();
//             while(data != -1) {
//                 System.out.print((char)data);
//                 data = reader.read();
//             } 
//             reader.close();

//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }



// // File Audio

// import java.io.File;
// import java.io.IOException;
// import java.util.Scanner;
// import javax.sound.sampled.*;

// public class Main {

//     public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

//         Scanner scanner = new Scanner(System.in);
            
//         File file = new File("audio.wav");
//         AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
//         Clip clip = AudioSystem.getClip();
//         clip.open(audioStream);

//         String response = "";

//         while(!response.equals("Q")) {
//             System.out.println("P = play, S= Stop, R = Reset, Q = Quit");
//             System.out.println("Enter your choice: ");

//             response = scanner.next();
//             response = response.toUpperCase();

//             switch(response) {
//                 case ("P"): clip.start();
//                 break;
//                 case ("S"): clip.stop();
//                 break;
//                 case ("R"): clip.setMicrosecondPosition(0);
//                 break;
//                 case ("Q"): clip.close();
//                 break;
//                 default: System.out.print("not a valid response");
//             }

//         }
//         System.out.println("Closed");
//     }
// }



// // GUI

// // import javax.swing.JFrame;
// // import java.awt.Color;
// // import javax.swing.ImageIcon;

// public class Main {

//      public static void main(String[] args) {
            
//         // JFrame frame = new JFrame();
//         // frame.setTitle("JFrame title goes here");
//         // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             // This is needed to close the window
//         // frame.setResizable(false);                              // This prevents the frame from being resized
//         // frame.setSize(420,420);
//         // frame.setVisible(true);

//         // ImageIcon image = new ImageIcon("logo.png");             // changes the icon of the frame
//         // frame.setIconImage(image.getImage());

//         // // frame.getContentPane().setBackground(Color.green);
//         // frame.getContentPane().setBackground(new Color(0,0,0));     // you can use rgb or hexadecimal

//         // MyFrame myframe = new MyFrame();
//         new MyFrame();

//     }
// }



// // Label

// import java.awt.Color;
// import java.awt.Font;

// import javax.swing.BorderFactory;
// import javax.swing.ImageIcon;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.border.Border;

// public class Main {

//      public static void main(String[] args) {

//         ImageIcon image = new ImageIcon("logo.png");
//         Border border = BorderFactory.createLineBorder(Color.green,3);

//         JLabel label = new JLabel();
//         label.setText("Cat, do you even code?");
//         label.setIcon(image);
//         label.setHorizontalTextPosition(JLabel.CENTER); // left, center or right of image icon
//         label.setVerticalTextPosition(JLabel.TOP);
//         label.setForeground(new Color(0x00FF00)); // font color
//         label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font
//         label.setIconTextGap(10); // set gap to text to image
//         label.setBackground(Color.black);
//         label.setOpaque(true); // display background color
//         label.setBorder(border);
//         label.setVerticalAlignment(JLabel.CENTER);
//         label.setHorizontalAlignment(JLabel.CENTER);
//         // label.setBounds(100, 100, 250, 250);
            
//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         // frame.setSize(500,500);

//         // frame.setLayout(null);

//         ImageIcon imageIcon = new ImageIcon("logo.png");
//         frame.setIconImage(imageIcon.getImage());

//         frame.add(label);
//         frame.pack();
//         frame.setVisible(true);
//     }
// }



// // panels

// import java.awt.BorderLayout;
// import java.awt.Color;

// import javax.swing.ImageIcon;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;

// public class Main {

//      public static void main(String[] args) {

//         ImageIcon icon = new ImageIcon("logo.png");

//         JLabel label = new JLabel();
//         label.setText("Hi");
//         label.setIcon(icon);
//         label.setVerticalAlignment(JLabel.BOTTOM);
//         label.setHorizontalAlignment(JLabel.RIGHT);

//         JPanel redPanel = new JPanel();
//         redPanel.setBackground(Color.red);
//         redPanel.setBounds(0,0,250,250);

//         JPanel bluePanel = new JPanel();
//         bluePanel.setBackground(Color.blue);
//         bluePanel.setBounds(250,0,250,250);

//         JPanel greenPanel = new JPanel();
//         greenPanel.setBackground(Color.green);
//         greenPanel.setBounds(0,250,500,250);
//         greenPanel.setLayout(new BorderLayout());
            

//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLayout(null);
//         frame.setSize(750,750);

//         ImageIcon imageIcon = new ImageIcon("logo.png");
//         frame.setIconImage(imageIcon.getImage());


//         greenPanel.add(label);

//         frame.add(redPanel);
//         frame.add(bluePanel);
//         frame.add(greenPanel);


//         frame.setVisible(true);
//     }
// }



// public class Main {

//      public static void main(String[] args) {
            
//         new MyFrame();
//     }
// }




// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.LayoutManager;

// import javax.swing.JFrame;
// import javax.swing.JPanel;

// public class Main {

//      public static void main(String[] args) {
            
//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(500, 500);
//         frame.setLayout(new BorderLayout(10, 10));
//         frame.setVisible(true);

//         JPanel panel1 = new JPanel();
//         JPanel panel2 = new JPanel();
//         JPanel panel3 = new JPanel();
//         JPanel panel4 = new JPanel();
//         JPanel panel5 = new JPanel();

//         panel1.setBackground(Color.red);
//         panel2.setBackground(Color.green);
//         panel3.setBackground(Color.yellow);
//         panel4.setBackground(Color.magenta);
//         panel5.setBackground(Color.blue);

//         frame.add(panel1, BorderLayout.NORTH);
//     }
// }



// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JPanel;

// public class Main {

//      public static void main(String[] args) {
            
//         JFrame frame = new JFrame();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(500, 500);
//         frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

//         JPanel panel = new JPanel();
//         panel.setPreferredSize(new Dimension(100, 250));
//         panel.setBackground(Color.lightGray);
//         panel.setLayout(new FlowLayout());

//         panel.add(new JButton("1"));
//         panel.add(new JButton("2"));
//         panel.add(new JButton("3"));
//         panel.add(new JButton("4"));
//         panel.add(new JButton("5"));
//         panel.add(new JButton("6"));
//         panel.add(new JButton("7"));
//         panel.add(new JButton("8"));
//         panel.add(new JButton("9"));

//         frame.add(panel);
//         frame.setVisible(true);
//     }
// }



public class Main {

     public static void main(String[] args) {
            

    }
}



// public class Main {

//      public static void main(String[] args) {
            

//     }
// }