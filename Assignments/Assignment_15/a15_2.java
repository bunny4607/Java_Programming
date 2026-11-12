/*
write a program to accept one number from user and check weather 
that number taken form user is greater than 100 or not 
*/

import java.util.Scanner ; 

class check {
    public boolean greaterThan100(int iNo) {
        return iNo >100 ; 
    }
}
public class a15_2 {
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in); 
        check cobj = new check(); 

        int iValue = 0 ; 
        boolean bRet = false ; 
        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input "); 
            System.exit(1); 
        }iValue = scanner.nextInt(); 


        bRet =  cobj.greaterThan100(iValue ); 
        if(bRet == true ){
            System.out.println("TRUE ");

        }
        else {
            System.out.println("FALSE");
        }

    }
}
/*
Enter a number : 
89
FALSE



Enter a number : 
101
TRUE 



Enter a number : 
100
FALSE



Enter a number : 
190
TRUE
*/