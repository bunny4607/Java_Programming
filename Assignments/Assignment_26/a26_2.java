/*
Enter a char :
c
C
vedantbarne@Vedants-MacBook-Air-2 Assignment_26 % java a26_2.java
Enter a char :
K
k
vedantbarne@Vedants-MacBook-Air-2 Assignment_26 % java a26_2.java
Enter a char :
l
L
vedantbarne@Vedants-MacBook-Air-2 Assignment_26 % java a26_2.java
Enter a char :
4
4
vedantbarne@Vedants-MacBook-Air-2 Assignment_26 % java a26_2.java
Enter a char :
^
^
*/

import java.util.Scanner ; 

class print {
    public char interchange(char sValue ){
        char ch = '\0'  ; 
        if(sValue >= 'A' && sValue <= 'Z'){
            ch =(char) (sValue +32);
        }
        else if(sValue >= 'a' && sValue <= 'z'){
            ch = (char )(sValue-32 ) ;

        }else {
            ch = sValue ; 
        }
        return ch ; 
    }
}

public class a26_2{
    public static void main(String A[]){
        Scanner scanner  =  new Scanner (System.in) ;
        print pobj = new print() ; 

        char sValue  = '\0' ;
        char cRet = '\0' ;

        System.out.println("Enter a char :") ;
        if(!scanner.hasNext()) {
            System.err.print("Invalid Input") ; 
            System.exit(1);
        }sValue  = scanner.nextLine().charAt(0); 

        cRet = pobj.interchange(sValue) ;
        System.out.println(cRet );

    }
}