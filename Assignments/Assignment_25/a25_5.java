/*
Enter division :
A
Your exam is at 7AM
vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_5.java
Enter division :
a
Your exam is at 7AM
vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_5.java
Enter division :
k
Invalid input
*/

import java.util.Scanner ; 
class print {
    public void examTime(char ch){
        if(ch == 'A' || ch == 'a') System.out.println("Your exam is at 7AM");
        else if (ch == 'B' || ch == 'b')System.out.println("Your exam time is 8.30AM");
        else if (ch == 'C' || ch == 'c')System.out.println("Your exam time is 9.20 AM");
        else if (ch == 'D' || ch == 'd')System.out.println("Your exam time is 10.30 AM");
        else System.out.println("Invalid input ");

    }
}
public class a25_5{
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        print pobj = new print(); 


        char ch = '\0'; 
        System.out.println("Enter division :"); 
        if(!scanner.hasNext("[a-zA-Z]+")){
            System.err.println("Invalid input ");
            System.exit(1);
        }ch = scanner.nextLine().charAt(0); 

        pobj.examTime(ch);


        scanner.close(); 
    }
}
