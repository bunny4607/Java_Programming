import java.util.Scanner;
//////////////////////////////////////////////////////////////////
//
//  Class Name      : Divisibility
//  Description     : Checks divisibility by 5
//  Author          : Vedant Kalidas Barne
//  Date            : 07/11/2026
//
//////////////////////////////////////////////////////////////////

class DivBy5{

     //////////////////////////////////////////////////////////////
    //
    //  Function Name   : check
    //  Description     : Checks whether number is divisible by 5
    //  Input           : int
    //  Output          : boolean
    //
    //////////////////////////////////////////////////////////////
    public boolean divBy5(int iNo){
        return (iNo %5 == 0) ; 
    }
}
//////////////////////////////////////////////////////////////////
//
//                      Entry Point
//
//////////////////////////////////////////////////////////////////

public class a1_4{
    public static void main(String A[]){
        int iValue = 0 ; 
        boolean iRet = false ; 

        Scanner sc = new Scanner(System.in); 
        DivBy5 d5obj = new DivBy5(); 

        System.out.println("Enter a number ");
        if(!sc.hasNextInt()){
            System.err.println("Invalid input ");
            System.exit(1); // same as return EXIT_ FAILURE  in C


        }
        iValue = sc.nextInt(); 

        iRet = d5obj.divBy5(iValue); 

        if(iRet == true ){
            System.out.println(iValue+" is divisible by 5 ");
        }
        else if (iRet == false )
            System.out.println(iValue+" is not divisible by 5");


        
        sc.close();
    }
}

//////////////////////////////////////////////////////////////////
//
//  Sample Output:
//
//  Enter a number: 25
//  Divisible by 5
//
//  Enter a number: 17
//  Not divisible by 5
//
//  Enter a number: -10
//  Divisible by 5
//
//////////////////////////////////////////////////////////////////

