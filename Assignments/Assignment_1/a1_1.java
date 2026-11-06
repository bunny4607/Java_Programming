import java.util.Scanner ; 


//////////////////////////////////////////////////////////////////
//
//  Class Name      : Division
//  Description     : Performs division of two integers
//  Author          : Vedant Kalidas Barne
//  Date            : 07/11/2026
//
//////////////////////////////////////////////////////////////////
class Division{
    //////////////////////////////////////////////////////////////
    //
    //  Function Name   : divide
    //  Description     : Divides two numbers
    //  Input           : int, int
    //  Output          : int
    //
    //////////////////////////////////////////////////////////////
    public int divide(int iNo1 , int iNo2){
        int iAns = 0 ; 
        iAns = iNo1 / iNo2 ; 
        return iAns ; 
    }
}


//////////////////////////////////////////////////////////////////
//
//                      Entry Point
//
//////////////////////////////////////////////////////////////////

public class a1_1
{
    public static void main(String A[])
    {
        int iValue1 = 0 ; 
        int iValue2 = 0 ; 
        int iRet = 0 ; 

        Scanner sc = new Scanner(System.in) ; 
        Division dobj = new Division(); 

        System.out.println("enter first number : ");
        if(!sc.hasNextInt()){
            System.err.println("invalid input "); 
            sc.close();
            return ; 
        }iValue1 = sc.nextInt();

        System.out.println("Enter second number : ");
        if(!sc.hasNextInt()){
            System.err.println("invalid input ") ; 
            return ;
        }
        iValue2 = sc.nextInt() ; 

        if(iValue2 == 0 ) {
            System.err.println("Division by zero is not possible ");
            return ; 
        }
        iRet = dobj.divide(iValue1, iValue2) ; 
        System.out.println("Division is "+ iRet );
        sc.close();

    }
}



//////////////////////////////////////////////////////////////////
//
//  Sample Output:
//
//  Enter first number: 15
//  Enter second number: 5
//  Division is: 3
//
//  Enter first number: 10
//  Enter second number: 0
//  Division by zero is not allowed
//
//////////////////////////////////////////////////////////////////
