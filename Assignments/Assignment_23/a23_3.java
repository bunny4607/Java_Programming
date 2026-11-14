/*
Enter a string :
Vedant Barne
vEDANT bARNE



Enter a string :
MARVELLOUS infosystems
marvellous INFOSYSTEMS



Enter a string :
Marvellous Infosystems
mARVELLOUS iNFOSYSTEMS
*/

import java.util.Scanner ; 

class print {
    public void SmalltoCapAndViceVersa(String sValue ){
        char ch[] = sValue.toCharArray(); 
        int i = 0 ; 
        for (i = 0; i<= sValue.length()-1 ; i++){
            if
            (
                (ch[i] >= 'A') && (ch[i]<= 'Z')
            ) ch[i] =(char ) (ch[i]+32 ); 
            else if
            (
                ch[i] >= 'a' &&ch[i ] <= 'z'
            ){
                ch[i]=(char) (ch[i]-32); 
            }

        }
        System.out.println(new String(ch));
    }
}
public class a23_3 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        print pobj = new print(); 


        String sValue = null ; 
        System.out.println("Enter a string :");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.print("Invalid Input "); 
            System.exit(1);
        }sValue = scanner.nextLine(); 

        pobj.SmalltoCapAndViceVersa(sValue); 

    }
}