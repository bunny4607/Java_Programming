/*
Enter a string : Vednat
true
vedantbarne@Vedants-MacBook-Air-2 Assignment_27 % java a27_4.java
Enter a string : Vedant
true
vedantbarne@Vedants-MacBook-Air-2 Assignment_27 % java a27_4.java
Enter a string : not
true
vedantbarne@Vedants-MacBook-Air-2 Assignment_27 % java a27_4.java
Enter a string : klj
false
*/

import java.util.Scanner ; 

class print {
    public boolean checkVowel(String sValue ){
        boolean bRet = false ;
        int i = 0 ; 
        char ch [] = sValue.toCharArray() ; 
        for( i = 0 ; i<= sValue.length()-1 ; i++){
            if(
                ch[i] == 'A' ||ch[i] == 'E' ||ch[i] == 'I' ||ch[i] == 'O' ||ch[i] == 'U'
                ||
                ch[i] == 'a' ||ch[i] == 'e' ||ch[i] == 'i' ||ch[i] == 'o' ||ch[i] == 'u'
            ){
                bRet = true ; 
            }
        }
        return bRet ; 


    }
}

public class a27_4{
    public static void main(String A[]) {
        Scanner scanner = new Scanner (System.in) ;
        print pobj = new print (); 

        String sValue = null ; 
        boolean bRet = false ; 

        System.out.print("Enter a string : ");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.println("Invalid Input "); 
            System.exit(1);
        }sValue = scanner.nextLine(); 

        bRet  = pobj.checkVowel(sValue); 
        System.out.println(bRet  );

    }
}