
public class Worskshop_One {

    public static void main(String[] args) {
        String data = "Luffy";
        System.out.println("Hey there,");
        System.out.println("I am \""+ data + "\"!" );
    }
}

// 2. Write a program to print the difference and product of numbers 45 and 32. 

// public class Worskshop_One {
//     public static void main(String[] args) {
//         int num1 = 45 ;
//         int num2 = 32;

//         int difference = num1 - num2;
//         int product = num1 * num2;

//         System.out.println("Difference: " + difference);
//         System.out.println("Product: "  + product);
        
//     }

// }

//  3. Write a Java program to print an int, a double, and a char on the screen.
/**
 * Worskshop_One
 */
// public class Worskshop_One {

//     public static void main(String[] args) {
//         int integer = 23;
//         double d_num = 23.3432;
//         char character = 'D' ;

//         System.out.println("An int: " + integer);
//         System.out.println("A double: " + d_num);
//         System.out.println("A char: " + character);

//     }
// }

// 4.	Write a program to calculate the area of a triangle.  
// Where s is the semi-perimeter of the triangle s = (a+b+c)/2

// import java.lang.Math;
// import java.util.Scanner;
// public class Worskshop_One {

//     public static void main(String[] args) {
//         Scanner num1 = new Scanner(System.in);
//         System.err.println("Enter a side of a triangle: ");
//         int a = num1.nextInt();
//         Scanner num2 = new Scanner(System.in);
//         System.err.println("Enter second side of a triangle: ");
//         int b = num2.nextInt();
//         Scanner num3 = new Scanner(System.in);
//         System.err.println("Enter the third side of a triangle: ");
//         int c = num3.nextInt();
//         double s = (a+b+c) /2;
//         double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
//         System.out.println("The are of triangle is: " + area);

//         num1.close();
//         num2.close();
//         num3.close();
//     }
// }



/**
 * Worskshop_One
 */

//  5.	Write a Java program to calculate the area of a square. 
// Prompt the user to enter the length of one side and then display the result. Ensure that the program handles user input as a double data type.
// public class Worskshop_One {

//     public static void main(String[] args) {
//         Scanner side = new Scanner(System.in);
//         System.out.println("Enter a side of a square: ");
//         double a = side.nextDouble();
//         double areaOfSquare = Math.pow(a, 2);
//         System.out.println("The area of square is: " + areaOfSquare);
//         side.close();
//     }
// }

/**
 * Worskshop_One
 6.	Create a Java program that converts a temperature in Celsius to Fahrenheit. 
 Prompt the user to enter the temperature in Celsius, perform the conversion using the formula (F = C * 9/5 + 32), and display the result as a double.
 */

// public class Worskshop_One {

//     public static void main(String[] args) {
//         Scanner temp = new Scanner(System.in);
//         System.out.println("Enter temperature in Celcius: ");
//         double celcius = temp.nextDouble();
//         double Fahrenheit = celcius * 9/5 + 32;
//         System.out.println("The required Farenheit temperature is: " + Fahrenheit + "°F");
//         temp.close();
//     }
// }

/**
 * Worskshop_One
 * 7.	Develop a Java program that calculates the volume of a cylinder.
 *  Prompt the user to enter the radius and height of the cylinder and then display the result. 
 * Ensure that the program uses appropriate data types for calculation and output.
 */
// public class Worskshop_One {

//     public static void main(String[] args) {
//         // pi r ^2 h 
//         Scanner r = new Scanner(System.in);
//         System.out.println("Enter radius of cylinder: ");
//         double radius = r.nextDouble();
//         Scanner h = new Scanner(System.in);
//         System.err.println("Enter height of cylinder: ");
//         double height = h.nextDouble();
//         double volume = 3.14 * Math.pow(radius, 2) * height;
//         System.out.println("The volume od the cylinder is: " + volume);
//         r.close();
//         h.close();
//     }
// }

// 8.	Write a Java program that calculates the simple interest on a loan. Prompt the user to enter the principal amount,
//  the rate of interest, and the time period. Calculate and display the interest amount as a double.
/**
 * Worskshop_One
 */
// public class Worskshop_One {

//     public static void main(String[] args) {
//         // p, r, t
//         Scanner p = new Scanner(System.in);
//         System.out.println("To calculate simple interest on a loan:");
//         System.out.println("Enter principal amount: ");
//         double principal = p.nextDouble();
//         Scanner r = new Scanner(System.in);
//         System.out.println("Enter rate of interest: ");
//         double rateInt = r.nextDouble();
//         Scanner t = new Scanner(System.in);
//         System.out.println("Enter the time period (in years): ");
//         double time = t.nextDouble();

//         double interest = principal * rateInt * time / 100; 
//         System.out.println("The simple interest is: " + interest);
//     }
// }


/**
 * Worskshop_One
 * 9.	Create a Java program that takes two integer inputs from the user, performs all
 * basic arithmetic operations (addition, subtraction, multiplication, and division) on these numbers, and displays the results.
 */
// public class Worskshop_One {

//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         double num1 = a.nextDouble();
//         Scanner b = new Scanner(System.in);
//         System.out.println("Enter the second number: ");
//         double num2 = b.nextDouble(); 

//         double add = num1 + num2;
//         double sub = num1 - num2;
//         double multiplication = num1 * num2;
//         double division = num1 / num2;
//         System.out.println("Basic arithmetic operations: ");
//         System.out.println("Addition: " + add);
//         System.out.println("Subtraction: " + sub);
//         System.out.println("Multiplication: " + multiplication);
//         System.out.println("Division: " + division);
//         a.close();
//         b.close();

//     }
// }

// 10.	Write a Java program that calculates the perimeter of a rectangle. Prompt the user to enter the length and
//  width of the rectangle, and then display the result. Use appropriate data types for calculation and output.


// public class Worskshop_One{
//     public static void main(String[] args) {
//         System.out.println("To calculate the perimeter of a rectangle");
//         Scanner a = new Scanner(System.in);
//         System.out.println("Enter length: ");
//         double length = a.nextDouble();
//         System.out.println("Enter width: ");
//         double width = a.nextDouble(); 
//         double perimeter = 2 * ( length + width);
//         System.out.println("The  perimeter of a rectangle is: " + perimeter);
//         a.close();
//     }
// }

/**
 * Worskshop_One
 11.	Develop a Java program that converts miles to kilometers. 
 Prompt the user to enter the distance in miles and display the equivalent distance in kilometers as a double.*/
// public class Worskshop_One {
//     public static void main(String[] args) {
//         System.out.println("Miles -> Kilometer: ");
//         Scanner a = new Scanner(System.in);
//         System.out.println("Enter distance in terms of miles: ");
//         double miles = a.nextDouble();
//         double kilometer = miles * 1.60934;
//         System.out.println(miles +" miles = " +kilometer + "km");

//         a.close();
//     }
    
// }

/**
 * Worskshop_One
 *12.	Create a Java program that computes the area of a circle. Prompt the user to enter 
 the radius and display the result as a double. Use the formula (Area = π * r * r) for the calculation.

 */
// public class Worskshop_One {

//     public static void main(String[] args) {
//         System.out.println("For are of a circle: ");
//         Scanner a = new Scanner(System.in);
//         System.out.println("Enter radius of the circle: ");
//         double radius = a.nextDouble();   
//         double area = Math.PI * Math.pow(radius, 2); 
//         System.out.println("The area of the circle is: " + area); 
//         a.close();   
//     }
// }

/**
 * Worskshop_One
 * 13.	Develop a Java program that calculates the total cost of purchasing a given quantity of items at a certain price per item. 
 * Prompt the user to enter the quantity and price, and display the total cost as a double.
 */
// public class Worskshop_One {

//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);
//         System.out.println("Enter the cost:");
//         double cost = a.nextDouble();
//         System.out.println("Enter the number of items purchased");
//         double number = a.nextDouble();
//         System.out.println("The tosl cost is: " + (cost * number ) );
//         a.close();
//     }
// }

/**
 * Worskshop_One
 * 14.	Write a Java program that converts a given amount of money in U.S. dollars to another currency (e.g., rupees).
 *  Prompt the user to enter the amount and the exchange rate, and display the converted amount as a double.
 */
// public class Worskshop_One {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);
//         System.out.println("US Dollar => Nepali Rupees");
//         System.out.println("Enter the amount to US dollars:");
//         double dollar = a.nextDouble();
//         double rupees = dollar * 133.43;
//         System.out.println("$" +dollar + " = Rs." + rupees);
//     }
    
// }