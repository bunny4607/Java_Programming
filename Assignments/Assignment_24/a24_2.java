/*
Enter string :
Vedantt
Enter a char :
t
char t is occuring 2 times
vedantbarne@Vedants-MacBook-Air-2 Assignment_24 % java a24_2.java
Enter string :
marvellous
Enter a char :
o
char o is occuring 1 times
vedantbarne@Vedants-MacBook-Air-2 Assignment_24 % java a24_2.java
Enter string :
marvellous
Enter a char :
l
char l is occuring 2 times
*/

import java.util.Scanner ; 
class print { 
    public int freqChar (String sValue , char ch ){
        int i = 0 ; 
        int iCount = 0 ; 
        char arr[] = sValue.toCharArray(); 
        for(i =0 ;i<= sValue.length()-1; i++ ){
            if(arr[i] == ch)
                iCount ++; 

        }
        return iCount ; 

    }
}
public class a24_2 {
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

        iRet = pobj.freqChar(sValue, ch); 
        System.out.println("char "+ch+" is occuring "+iRet+ " times");

        scanner.close();
    }
}
