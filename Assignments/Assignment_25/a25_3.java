/*
Enter a char :
8
TRUE
vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_3.java
Enter a char :
o
FALSE
vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_3.java
Enter a char :
1
TRUE
*/

import java.util.Scanner ; 

public class a25_3 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 

        char ch = '\0'; 
        System.out.println("Enter a char :"); 
        if(!scanner.hasNext("[0-9]+")){
            System.err.println("FALSE");
            System.exit(1);
        }ch = scanner.nextLine().charAt(0); 

        System.out.print("TRUE");
        System.out.println();

        scanner.close(); 
    }
}
