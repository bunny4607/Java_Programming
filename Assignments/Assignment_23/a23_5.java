/*
Enter a string :
Vedant Barne
Number of spaces: 1



Enter a string :
V e d a n t
Number of spaces: 5
*/

import java.util.Scanner ; 
class print{
    public int countSpaces(String sValue ){
        int i = 0 ; 
        char ch [] = sValue.toCharArray(); 
        int iCount = 0; 


        for(i = 0; i<= sValue.length()-1; i++ ){
            if(ch[i] == ' ') iCount ++; 
        }
        return iCount ; 
    }
}
public class a23_5 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        print pobj = new print(); 

        int iRet = 0 ; 

        String sValue = null ; 
        System.out.println("Enter a string :");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.print("Invalid Input "); 
            System.exit(1);
        }sValue = scanner.nextLine(); 

        iRet = pobj.countSpaces(sValue);
        System.out.println("Number of spaces: "+iRet);

    }
    
}
