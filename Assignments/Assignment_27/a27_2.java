/*
Enter a string : Vedant 
5
vedantbarne@Vedants-MacBook-Air-2 Assignment_27 % java a27_2.java
Enter a string : Vedant Barne
9
vedantbarne@Vedants-MacBook-Air-2 Assignment_27 % java a27_2.java
Enter a string : Marvellous
9
*/

import java.util.Scanner ; 

class print {
    public int countSmall(String sValue ){
        int i = 0 ;

        int iCap = 0 ; 
        char ch []= sValue.toCharArray() ; 
        for(i = 0 ; i<= sValue.length()-1 ; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                iCap ++ ; 
            }
        }
        
        return iCap ; 
    }
}

public class a27_2{
    public static void main(String A[]) {
        Scanner scanner = new Scanner (System.in) ;
        print pobj = new print (); 

        String sValue = null ; 
        int iRet = 0 ; 

        System.out.print("Enter a string : ");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.println("Invalid Input "); 
            System.exit(1);
        }sValue = scanner.nextLine(); 

        iRet = pobj.countSmall(sValue); 
        System.out.println(iRet );

    }
}