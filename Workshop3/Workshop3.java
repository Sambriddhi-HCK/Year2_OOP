package Workshop3;
/**
 * One: Write a Java program that uses a "for" loop to print the numbers from 1 to 10.
 * System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10 ; i++ ){
            System.out.println(i);
        }
Two: Implement a Java program that utilizes a "while" loop to find the factorial of a given
number.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int factNum = in.nextInt();
        System.out.print("Factorial of " + factNum + " is: ");
        int fact = 1;
        while(factNum !=1){
            fact *= factNum;
            factNum--;
        }
        System.out.print(fact);
        in.close();

Three: Create a Java program using a "do-while" loop to repeatedly ask the user for input until
they enter a specific value (e.g., 0).
Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find the square (or enter 0 to exit): ");
        int num = in.nextInt();
        do {
            System.out.println( "Square of " + num + " is: " + Math.pow(num,2));
            System.out.print("Enter a number to find the square (or enter 0 to exit): ");
            num = in.nextInt();
        }
        while(num != 0); 

        in.close();

four: Write a Java program that demonstrates the use of nested loops to print a pattern, such
as a pyramid of stars.
        //outer loop for rowd

System.out.println("Pyramid pattern: ");
        for ( int i = 1; i <=5; i ++){
            //nested loop 1
            //prints spaces before the star 
            for ( int j = 1; j<= 5 - i; j++){
                System.out.print(" ");
            }
                //inner loop 2
                //prints the stars
                for ( int k = 1 ; k <= 2 * i - 1; k++){
                    System.out.print( " *");
                }
            //next line
            System.out.println("");
        }

        array

        5
//        int[] arr = {3, 4, 5, 2, 5, 9, 10};
//        System.out.println("Original array:" + Arrays.toString(arr));
//
//        int start = 0;
//        int end = arr.length - 1;
//        //temp variable to swap
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            //to move towards center
//            start++;
//            end--;
//        }
//        System.out.println("Reversed array:" + Arrays.toString(arr));

        6
        public class Main {
    public static void main(String[] args) {


        float [] arr = new float[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements for an array: (float numbers)");
        for(int i = 0; i<= arr.length - 1; i++){
            System.out.print("Element " + (i+1) + ": ");
            float num = sc.nextFloat();
            arr[i] = num;
        }
        int count = 0;
        float sum = 0;
        for(int i = 0; i<= arr.length - 1; i++){
            sum += arr[i];
            count++;
        }
        System.out.println("The sum of the elements of the array is: " + sum);
        System.out.println("The average of the elements of the array is: " + sum/count);

    }
}
8
        boolean found = false; // initializing bool found as false
        String [] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 string values for an array: ");
        for(int i = 0; i<= arr.length - 1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            String str = sc.next();
            arr[i] = str;
        }

        System.out.println("Enter a string you want to check in the array: ");
        String strToCheck = sc.next();

        int indexOfMatch = -1; //initialize to an invalid index

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(strToCheck)) {
                found = true; //  if found then true
                indexOfMatch = i; //store the index of the matched value
                break;
            }
        }

        if (found) {
            System.out.println("Matched at index: " + indexOfMatch);
        } else {
            System.out.println("Not Matched!");
        }
        9
                int [] arr = {325,453,234,245,23,5,312,43,25,2};
        System.out.println("Original array: ");

        for (int value : arr) {
            System.out.print(value + " ");
        }
        int n = arr.length;
        for (int i = 0; i <= n-1; i++){
            for (int j = 0; j < n - i -1; j++){

                if (arr[j] > arr[j + 1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\nSorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        Enhanced for loop

        9  
    char []charArr = new char [6];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 6 character values for an array: ");
    for(int i = 0; i<= charArr.length - 1; i++) {
        System.out.print("Element " + (i + 1) + ": ");
        char ch = sc.next().charAt(0);
        charArr[i] = Character.toLowerCase(ch);
    }
    int vowelCount = 0;

    for(char value : charArr) {
        if(value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u'){
            vowelCount++;
        }
    }
        System.out.println("The number of vowels in the entered array of characters is: " + vowelCount);
    }
        10
    public static void main(String[] args) {
    double []arr = {23.33, 21.45, 3.53, 4.4, 56.56, 56.58, 23.22};
    double temp = 0.00;
    for (double value : arr ){
        if( temp <= value){
            temp = value;
        }
    }
    System.out.println("The maximum value is: " + temp);
    }
    11    float sum = 0;

    //prompt user to enter rows and columns
    System.out.println("Enter the dimension for creating a 2D array: " );
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // declaring a 2D array with given dimension
        float [][]arr = new float [rows] [cols];

        //ITERATING through the index and placing the element
        for (int i = 0; i < rows ; i++){
            for (int j = 0; j < cols; j++){
                System.out.print("Enter the element [" + (i+1) + "] [" + (j+1) + "]: ");
                arr[i][j] = sc.nextFloat();
            }
        }

        //calculate the sum of all elements using  enhanced for loop
        for (float[] row : arr) {
            for (float element : row) {
                sum += element;
            }
        }
        System.out.println("The sum of all the elements in the 2D array is: " + sum);

        12
        public class Main {
        public static void main(String[] args) {
        String [] arr = {"Hello", " ","World", "!", " I ", "am ", "Sambriddhi ","Shrestha."};

        //concatenate strings using enhanced for loop
        String concatenatedString = "";
        for( String str : arr){
            concatenatedString += str;
        }
        System.out.println("Concatenated string: "+ concatenatedString);
    }
}
 */
public class Workshop3 {
    public static void main(String[] args) {
        System.out.println("Pyramid pattern: ");
        for ( int i = 1; i <=5; i ++){
            System.out.print(" ");
            //nested loop 1
            //prints spaces before the star 
            for ( int j = 1; j<= 5 - i; j++){
                System.out.print(" ");
            }
                //inner loop 2
                //prints the stars
                for ( int k = 1 ; k <= 2 * i - 1; k++){
                    System.out.print( "*");
                }
            //next line
            System.out.println("");
            
        }
    }   
}
