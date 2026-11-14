/*
Enter string :
Vedant
tnadeV%    

vedantbarne@Vedants-MacBook-Air-2 Assignment_24 %  java a24_5.java
Enter string :
marvellous
suollevram% 
*/

import java.util.Scanner ; 



class print{
    public void revString(String sValue ){
        char ch [] = sValue.toCharArray();
        int i = 0 ; 
        for (i = sValue.length()-1 ;i>= 0 ; i--){
            System.out.print(ch[i]);
        }
    }
}

public class a24_5{
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        print pobj = new print(); 

        String sValue = null ; 
        System.out.println("Enter string :");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.print("Invalid Input"); 
            System.exit(1);
        }sValue = scanner.nextLine(); 

        pobj.revString(sValue);
    }
}
