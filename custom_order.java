// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
    //  System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
    
    Scanner keyboard = new Scanner (System.in);
    
    String firstName; // Nombre del Usuario
    String itemOrder; // Articulo escogido
    String frostingType; // Frosting ordered
    String fillingType; //Filling ordered
    String toppings; // Toppings ordered
    String input; // User input
    
    double cost = 15.00; // Cost of cake and cupcakes
    final double TAX_RATE = .08; // Impuesto añadido
    double tax; // Amount of tax
    
    // Introduce shop and prompt user to input first name
    
    System.out.println("¡Bienvenidos a la tienda de Tartas y Magdalenas Java!");
    System.out.println("Hacemos tartas personalizadas gracias a nuestro secret cake batter");

    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
    System.out.print("¿Cual es tu nombre?");
    firstName = keyboard.nextLine();
    
    System.out.print(firstName + ", por favor, escoge de nuestro MENU abajo: ");
    System.out.print("\n"); //Salta una linea
    
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

    System.out.println("_______________________________________________");
    System.out.println("        MENU         QUANTITY       BASE COST  ");
    System.out.println("_______________________________________________");
    System.out.println("        Tarta            1             $15     ");
    System.out.println("      Magdalenas         6             $15     ");
    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    System.out.println("Frosting (vanilla, chocolate, strawberry, coco)");
    System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
    System.out.println("Toppings   (sprinkles, cinnamon, cocoa, nuts)  ");
    System.out.println("_______________________________________________");

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

    System.out.println("¿Quiere Tarta o Magdalenas?");
    itemOrder = keyboard.nextLine();
    
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

    System.out.println("What type of FROSTING do you want? ");
    System.out.println("Vanilla, Chocolate, Strawberry or Coco");
    frostingType = keyboard.nextLine();
    
    
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING

    System.out.println("What type of FILLING do you want? ");
    System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
    fillingType = keyboard.nextLine();  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS

    System.out.println("What type of TOPPINGS do you want? ");
    System.out.println("Sprinkles, Cinnamon, Cocoa, Nuts");
    toppings = keyboard.nextLine();
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION

    System.out.println();
    System.out.println(firstName + " , your order is as follows: ");
    System.out.println("_________________________________________");
    System.out.println("Item Ordered: " + itemOrder);
    System.out.println("Frosting: " + frostingType);
    System.out.println("Filling: " + fillingType);
    System.out.println("Toppings: " + toppings);
    System.out.println("_________________________________________");
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
    
    System.out.printf("The cost of your order is: $%.2f\n", cost);
    tax = cost * TAX_RATE;
    System.out.printf("The tax is: $%.2f\n", tax);
    System.out.printf("The total due is: $%.2f\n",(tax + cost));
  
    }   
}
