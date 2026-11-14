/*
Enter string :
Marvellous Multi OS
Enter a char :
M
11
vedantbarne@Vedants-MacBook-Air-2 Assignment_24 % java a24_4.java
Enter string :
Marvellous Multi OS
Enter a char :
W
entered char is not present in string 
vedantbarne@Vedants-MacBook-Air-2 Assignment_24 % java a24_4.java
Enter string :
Marvellous Multi OS
Enter a char :

e
4
*/

import java.util.Scanner ; 
class print { 
    public int returnLastIndex (String sValue , char ch ){
        int i = 0 ; 
        int iIndex = 0 ; 
        char arr[] = sValue.toCharArray(); 
        for(i = 0 ; i<= sValue.length()-1 ; i++){
            if(arr[i] == ch)
                iIndex = i ; 

        }
            
        return iIndex ; 

    }
}
public class a24_4{
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

        iRet = pobj.returnLastIndex(sValue, ch); 
        if(iRet > 0)System.out.println(iRet );
        else System.out.println("entered char is not present in string ");

        scanner.close();
    }
}
