/*
Enter a string :
VEdant
Enter char to search in small :
e
TRUE
vedantbarne@Vedants-MacBook-Air-2 Assignment_24 % java a24_1.java
Enter a string :
MARVELLOUS
Enter char to search in small :
e
TRUE
vedantbarne@Vedants-MacBook-Air-2 Assignment_24 % java a24_1.java
Enter a string :
vedant 
Enter char to search in small :
a
TRUE
vedantbarne@Vedants-MacBook-Air-2 Assignment_24 % java a24_1.java
Enter a string :
vedant
Enter char to search in small :
f
FALSE
*/

import java.util.Scanner ; 
class print {
    public boolean checkChar(String sValue , char ch ){
        boolean bRet = false ; 
        int i = 0 ; 
        char arr[] = sValue.toCharArray(); 
        for(i = 0; i<= sValue.length()-1;i++){
            //filtering ( capital to small )
            if(arr[i] >='A' &&arr[i] <= 'Z')
                arr[i] =(char) (arr[i] + 32);
            if(arr[i] == ch ) 
                bRet = true ; 
        }

        return bRet  ;
    }
}

public class a24_1 {
    public static void main(String A[]){
        Scanner scanner  = new Scanner (System.in) ; 
        print pobj = new print(); 

        boolean bRet = false ; 
        char ch = '\0' ; 
        String sValue = null ; 

        System.out.println("Enter a string :");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.print("Invalid input "); 
            System.exit(1);
        }sValue = scanner.nextLine() ; 

        System.out.println("Enter char to search in small :");
        if(scanner.hasNext("[A-Za-z0-9]+ ")){
            System.err.print("Invalid Input"); 
            System.exit(1);
        }ch = scanner.nextLine().charAt(0); 

        bRet = pobj.checkChar(sValue, ch); 

        if(bRet == true )System.out.println("TRUE");
        else System.out.println("FALSE");

        scanner.close();

    }
}