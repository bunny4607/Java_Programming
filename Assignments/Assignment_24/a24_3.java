/*
Enter string :
Vedant
Enter a char :
n
4
vedantbarne@Vedants-MacBook-Air-2 Assignment_24 % java a24_3.java
Enter string :
marvellous
Enter a char :
l
5
*/

import java.util.Scanner ; 
class print { 
    public int returnIndex (String sValue , char ch ){
        int i = 0 ; 
        int iIndex = 0 ; 
        char arr[] = sValue.toCharArray(); 
        for(i =0 ; i <= sValue.length()-1 ; i++){
            if(arr[i] == ch){
                iIndex = i ; 
                return iIndex; 
            }

        }
            
        return iIndex ; 

    }
}
public class a24_3 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        print pobj = new print(); 

        String sValue = null; 
        char ch = '\0' ; 
        int iRet = 0 ; 

        System.out.println("Enter string :");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.print("Invalid Input"); 
            System.exit(1);
        }sValue = scanner.nextLine(); 

        System.out.println("Enter a char :");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.print("Invalid Input"); 
            System.exit(1);
        }ch = scanner.nextLine().charAt(0); 

        iRet = pobj.returnIndex(sValue, ch); 
        if(iRet > 0)System.out.println(iRet );
        else System.out.println("entered char is not present in string ");

        scanner.close();
    }
}
