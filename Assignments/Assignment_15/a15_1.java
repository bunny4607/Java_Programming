/*
write a program to accept name form
user and print that name 
*/

import java.util.Scanner ; 

public class a15_1{
    public static void main(String A[]){

        Scanner scanner = new Scanner (System.in); 

        String strValue = null ; 
        System.out.println("Enter a string :");
        if(!scanner.hasNext ("[A-Z a-z]+")){
            System.err.println("Invalid input "); 
            System.exit(1);
        }
        strValue = scanner.nextLine(); 
        System.out.println(strValue );
    }
}
/*
Enter a string :
Vedant Barne
Vedant Barne



Enter a string :
marvellous infosystems
marvellous infosystems



Enter a string :
Marvellous Infosystems
Marvellous Infosystems
*/