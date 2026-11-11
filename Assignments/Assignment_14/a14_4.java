/*
program to accept a number and then returning the sum of all the non factors 
*/

import java.util.Scanner;

class fact{
    public int nonFactSum(int iNo){
        int i = 0; 
        int iSum = 0 ; 
        for(i = 1 ; i <= iNo; i++){
            if(iNo % i != 0){
                iSum = iSum + i ; 

            }
        }
        return iSum ;
    }
}
public class a14_4{
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in); 
        fact fobj = new fact (); 

        int iValue = 0 ; 
        int iRet= 0 ; 

        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input ");
            System.exit(1); 

        }
        iValue = scanner.nextInt(); 

        iRet = fobj.nonFactSum(iValue);

        System.out.println(iRet);
        System.out.println();

    }
}
/*
Enter a number : 
12
50




Enter a number : 
10
37

*/