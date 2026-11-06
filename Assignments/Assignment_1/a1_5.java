import java.util.Scanner;
//////////////////////////////////////////////////////////////////
//
//  Class Name      : Display
//  Description     : Prints stars according to user input
//  Author          : Vedant Kalidas Barne
//  Date            : 07/11/2026
//
//////////////////////////////////////////////////////////////////
class Display{
    //////////////////////////////////////////////////////////////
    //
    //  Function Name   : display
    //  Description     : Prints N number of stars
    //  Input           : int
    //  Output          : void
    //
    //////////////////////////////////////////////////////////////
    public void display(int iNo) {
        int i = 0 ; 

        if(iNo < 0 ) iNo = -iNo ; 

        for(i =1 ; i <= iNo ; i++){
            System.out.print("*\t");
            
        }
        System.out.println();
    }
}
//////////////////////////////////////////////////////////////////
//
//                      Entry Point
//
//////////////////////////////////////////////////////////////////

public class a1_5 {
    public static void main(String A[]){
        int iValue = 0 ; 

        Scanner sc = new Scanner(System.in); 
        Display dobj = new Display();

        System.out.println("Enter number : ");
        if(!sc.hasNextInt()){
            System.err.println("Invalid input");
            System.exit(1);
        }
        iValue = sc.nextInt(); 

        dobj.display(iValue);

        sc.close();


    }
}
//////////////////////////////////////////////////////////////////
//
//  Sample Output:
//
//  Enter a number: 5
//  *    *    *    *    *
//
//  Enter a number: 3
//  *    *    *
//
//
//////////////////////////////////////////////////////////////////