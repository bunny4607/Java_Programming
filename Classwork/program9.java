import java.util.Scanner ; 

public class program9 {
//////////////////////////////////////////////////////////////
//
//Function Name : Addition
//Input         : Integer, Integer
//Output        : Integer
//Description   : performs addition 
//Date          : 04/10/2026
//Author        : Vedant Kalidas Barne
//
//////////////////////////////////////////////////////////////
    public static int Addition(int iNo1, int iNo2 ){
        int iResult = 0 ;
        iResult = iNo1 + iNo2;
        return iResult;

    }
//////////////////////////////////////////////////////////////
//
//Entery point of application 
//
//////////////////////////////////////////////////////////////
    public static void main(String A[]){

        Scanner sc = new Scanner (System.in);


        int iValue1 = 0, iValue2 = 0; 
        int iRet = 0 ;

        System.out.println("Enter first number : ");
        iValue1 = sc.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sc.nextInt();

        iRet = Addition(iValue1, iValue2);



        System.out.println("Addition of number is : "+ iRet );

    }
}
//////////////////////////////////////////////////////////////
//
//          Step 5 : Test the program 
//    Tested test cases
//----------------------------------------------
//    input1    Input2    Output
//----------------------------------------------
//    10        11        21
//    11        0         11
//    0         11        11
//    20        -9        11
//   -9         20         11
//   -20       -11        -31
//
//////////////////////////////////////////////////////////////


