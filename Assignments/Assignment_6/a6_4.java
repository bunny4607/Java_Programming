import java.util.Scanner;

//////////////////////////////////////////////////////////////////
/*
            Function name   : CheckTriangle
            Description     : checks whether three sides form a valid triangle
                              all sides must be positive and sum of any
                              two sides must be greater than the third side
            Enter three sides: 3 4 5
            Valid Triangle

            input           : int, int, int
            output          : void
            Author          : Vedant Kalidas Barne
            Date            : 7/11/2026
*/
//////////////////////////////////////////////////////////////////

public class a6_4 {

    public static void CheckTriangle(int iSide1, int iSide2, int iSide3){

        if((iSide1 <= 0) || (iSide2 <= 0) || (iSide3 <= 0)){
            System.out.println("Invalid Triangle");
            return;
        }

        if((iSide1 + iSide2 > iSide3) && (iSide2 + iSide3 > iSide1) && (iSide1 + iSide3 > iSide2)) {
            System.out.println("Valid Triangle") ;
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }

    //////////////////////////////////////////////////////////////////
    //
    //                  Entry Point
    //
    //////////////////////////////////////////////////////////////////

    public static void main(String a[]) {
        int iSide1 = 0, iSide2 = 0, iSide3 = 0 ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three sides: ");

        if(!scanner.hasNextInt()){
            System.err.println("Invalid input");
            System.exit(1) ;
        }
        iSide1 = scanner.nextInt();

        if(!scanner.hasNextInt()) {
            System.err.println("Invalid input");
            System.exit(1);
        }
        iSide2 = scanner.nextInt() ;

        if(!scanner.hasNextInt()){
            System.err.println("Invalid input");
            System.exit(1);
        }
        iSide3 = scanner.nextInt();

        CheckTriangle(iSide1, iSide2, iSide3);
    }
}

//////////////////////////////////////////////////////////////////
//
//                        Sample output
//
//  Enter three sides: 3 4 5
//  Valid Triangle
//
//
//  Enter three sides: 1 2 3
//  Invalid Triangle
//
//
//  Enter three sides: 0 4 5
//  Invalid Triangle
//
//////////////////////////////////////////////////////////////////