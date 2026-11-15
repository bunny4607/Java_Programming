/*
Enter a string : VedantttTT
3
vedantbarne@Vedants-MacBook-Air-2 Assignment_27 % java a27_1.java
Enter a string : Vedant Barne
2
vedantbarne@Vedants-MacBook-Air-2 Assignment_27 % java a27_1.java
Enter a string : Marvellous Infosystems OS
4
*/

import java.util.Scanner ; 

class print {
    public int countCapital(String sValue ){
        int i = 0 ;

        int iCap = 0 ; 
        char ch []= sValue.toCharArray() ; 
        for(i = 0 ; i<= sValue.length()-1 ; i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                iCap ++ ; 
            }
        }
        
        return iCap ; 
    }
}

public class a27_1{
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

        iRet = pobj.countCapital(sValue); 
        System.out.println(iRet );

    }
}