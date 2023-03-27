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



public class Main {

    public static void main(String[] args) {
        
        
    }
}



// public class Main {

//     public static void main(String[] args) {
        
        
//     }
// }