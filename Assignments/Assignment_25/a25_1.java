/*
Enter a char :
F
TRUE
vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_1.java
Enter a char :
9
FALSE%                                                                       vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_1.java
Enter a char :
[
FALSE%                                                                       vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_1.java
Enter a char :
l
TRUE
*/

import java.util.Scanner; 

public class a25_1{
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in) ; 

        char ch = '\0'; 

        System.out.println("Enter a char :");
        if(!scanner.hasNext("[A-Za-z]+")){
            System.err.print("FALSE"); 
            System.exit(1);
        }ch = scanner.nextLine().charAt(0); 

        System.out.println("TRUE");
        
    }
}