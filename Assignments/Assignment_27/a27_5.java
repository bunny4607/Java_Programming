/*
Enter a string : Vedant
tnadeV%                                                            vedantbarne@Vedants-MacBook-Air-2 Assignment_27 % java a27_5.java
Enter a string : marvellous
suollevram% 
*/

import java.util.Scanner ; 

class print {
    public void revString(String sValue ){
        int i = 0 ; 
        char ch[] = sValue.toCharArray(); 

        for(i =sValue.length()-1; i>= 0 ; i--){
            System.out.print(ch[i]);
        }


    }
}

public class a27_5{
    public static void main(String A[]) {
        Scanner scanner = new Scanner (System.in) ;
        print pobj = new print (); 

        String sValue = null ; 

        System.out.print("Enter a string : ");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.println("Invalid Input "); 
            System.exit(1);
        }sValue = scanner.nextLine(); 

        pobj.revString(sValue); 


    }
}