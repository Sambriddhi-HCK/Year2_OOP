package Workshop2;
/**
 * Workshop2
 */

import java.util.Scanner;

   
        //1 Taking length and breadth of a rectangle from user and check if it is square or not.
        // Scanner in = new Scanner(System.in);
        // System.out.println("To check whether your rectangle is square or not ");
        // System.out.println("Enter length: ");
        // int length = in.nextInt() ;
        // System.out.println("Enter breadth: ");
        // int breadth = in.nextInt() ;

        // if (length==breadth){
        //     System.out.println("Your rectangle is a square.");
        // }
        // else{
        //     System.out.println("Your rectangle is not a square.");
        // }
        // in.close();

// public class Workshop2 {
//     public static void main(String[] args) {   

//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter your final score for evaluation: ");
//         double finalScore = in.nextDouble() ;
    
//         if (finalScore>90 && finalScore<=100){
//             System.out.println(" A+");
//         } else if(finalScore>80 && finalScore<=90){
//             System.out.println(" A ");
//         } else if(finalScore>70 && finalScore<=80){
//             System.out.println(" B+ ");
//         } else if(finalScore>60 && finalScore<=70){
//             System.out.println(" B ");
//         }
//          else if(finalScore>50 && finalScore<=60){
//             System.out.println(" C+ ");
//         }
//          else if(finalScore>40 && finalScore<=50){
//             System.out.println("C");
//         } else if(finalScore>=0 && finalScore<=40){
//             System.out.println("You have failed!");
//         }else{
//             System.out.println("Invalid input!!");
//         }
//         in.close();
//     }
// }

/**
 * Workshop2
*/
// public class Workshop2 {
//     public static void main(String[] args) {

//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter your age for evaluation: ");
//         System.out.println("Enter first age: ");
//         int age1 = in.nextInt() ;
//         System.out.println("Enter second age: ");
//         int age2 = in.nextInt() ;
//         System.out.println("Enter third age: ");
//         int age3 = in.nextInt() ;

//         if (age1>age2 & age1>age3 ){
//             System.out.println("The oldest is the first.");
//         }
//         else if (age2>age3 & age2>age1 ){
//             System.out.println("The oldest is the second.");
//         }
//         else{
//             System.out.println("The oldest is the third.");
//         }

//         if (age1<age2 & age1<age3 ){
//             System.out.println("The youngest is the first.");
//         }else if (age2<age3 & age2<age1 ){
//             System.out.println("The youngest is the second.");
//         }else{
//             System.out.println("The youngest is the third.");
//         }

//         in.close();
//     }
// }

/***
        int x = 2, y = 5, z = 0;
        //a
        boolean a = (x == 2);
        //b
        boolean b = (x != 5);
        //c
        boolean c = (x != 5 && y >= 5);
        //d
        boolean d = (z != 0 || x == 2);
        //e
        boolean e = (!(y < 10));

        System.err.println("x == 2: " + a);
        System.err.println("x != 5: " + b);
        System.err.println("x != 5 && y >= 5: " + c);
        System.err.println("z != 0 || x == 2: " + d);
        System.err.println("!(y < 10): " + e);

                // 5 
        Scanner in = new Scanner(System.in);
        System.out.println("Do you have a medical condition? (y/n) ");
        char medicalCause = in.next().charAt(0);

        switch(Character.toLowerCase(medicalCause)){
            case 'y':
            case 'Y:
            System.out.println("You are not allowed to sit in the exam.");
            break;
            case 'n':
            System.out.println("You are allowed to sit in the exam.");
            break;
            default:
            System.out.println("Invalid input!!");
        }
        //6
        System.out.println("Enter a number:");
        int num = in.nextInt();

        if (num%2 == 0){
            System.out.println("The entered number is even.");
        }else {
            System.out.println("The entered number is odd.");
        }
        //7
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = in.nextInt();

        if (x>5 & x<15){
            System.out.println("The value of x is: " + x + ".");
        }else {
            System.out.println("The value of x did not satisy the condition. ");
        }
        in.close();

        //10 
        f (x > y){
	        if (y > z){ 
                System.out.println("x is greater than y and z.");
            }//statement1.
        }else if (y>z){
            if(y>x){
                System.out.println("y is greater than x and z.");
            }
        }else {
                System.out.println("z is greater than x and y.");
            }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter you grade(A+,A,B+,B,C+,C)");
        String grade = in.nextLine();

        switch (grade){
            case "A+":
            System.out.println("Excellent!");
            break;
            case "A":
            System.out.println("Outstanding!");
            break;
            case "B+":
            System.out.println("Good!");
            break;
            case "B":
            System.out.println("Can do better!");
            break;
            case "C+":
            System.out.println("Just passes!");
            break;
            case "C":
            System.out.println("You Failed!");
            break;
            default:
            System.out.println("Invalid grade!");
        }
        in.close();

        //10        
        int roll_no = 12; 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1/2:");
        int i = in.nextInt();

        switch (i) {
            case 1:
            System.out.println("Your roll number is 10"); 
            break;
            case 2:
            System.out.println("Your roll number is 12"); 
            break;
            default:
            System.out.println("Your roll number is greater than 12");
            }
            in.close();

 */


/**
 * Workshop2
 */
public class Workshop2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter two String values: ");
        System.out.print("First String value: ");
        String firstString = in.nextLine();
        System.out.print("Second String value: ");
        String secondString = in.nextLine();

        //a
        System.out.println("Length of first string: " + firstString.length());
        //b
        System.out.println("First string compares to Second String: " + firstString.compareTo(secondString));
        //c
        System.out.println("Character at third index of first string: " + firstString.charAt(3));
        //d
        System.out.println("Sub string from first string from 0 to 2nd index: " + secondString.substring(0,2));
        //e
        System.out.println("First string equal to 'Nepal'? " + firstString.equals("Nepal"));
        //f
        System.out.println("First string to uppercase:" + firstString.toUpperCase());
        //g
        System.out.println("Second string to lower case:" + secondString.toLowerCase());
        in.close();
    }
}
