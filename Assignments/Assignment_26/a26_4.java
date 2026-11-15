/*
Enter a char :
^
TRUE

vedantbarne@Vedants-MacBook-Air-2 Assignment_26 % java a26_4.java
Enter a char :
a
FALSE

vedantbarne@Vedants-MacBook-Air-2 Assignment_26 % java a26_4.java
Enter a char :
%
TRUE

*/

import java.util.Scanner; 
class print {

    public void print (char ch ) {
        char c = '\0'; 

        if(
            ch == '!' ||
            ch == '@' ||
            ch == '#' ||
            ch == '$' ||
            ch == '%' ||
            ch == '^' ||
            ch == '&' ||
            ch == '*' 
        ){
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
        System.out.println();
    }
}
public class a26_4 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in);
        print pobj = new print()  ;

        char ch = '\0' ; 

        System.out.println("Enter a char :");
        if(!scanner.hasNext()){
            System.err.print("Invaid input ") ;
            System.exit(1);

        }
        ch = scanner.nextLine().charAt(0);

        pobj.print(ch);
    }   

}