/*
Enter a char :
o
TRUE
vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_4.java
Enter a char :
l
TRUE
vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_4.java
Enter a char :
L
FALSE
vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_4.java
Enter a char :
8 
FALSE
*/

import java.util.Scanner ; 

public class a25_4 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 

        char ch = '\0'; 
        System.out.println("Enter a char :"); 
        if(!scanner.hasNext("[a-z]+")){
            System.err.println("FALSE");
            System.exit(1);
        }ch = scanner.nextLine().charAt(0); 

        System.out.print("TRUE");
        System.out.println();

        scanner.close(); 
    }
}
