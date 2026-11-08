import java.util.Scanner;

//////////////////////////////////////////////////////////////////
/*
            Function name   : CheckAdmission
            Description     : checks admission eligibility
                              marks >= 60 and age >= 17 -> eligible
                              marks outside 0-100 or negative age -> invalid
            Enter marks and age: 75 18
            Eligible for Admission

            input           : float, int
            output          : void
            Author          : Vedant Kalidas Barne
            Date            : 7/11/2026
*/
//////////////////////////////////////////////////////////////////

public class a6_2 {

    public static void CheckAdmission(float fMarks, int iAge) {

        if((fMarks < 0) || (fMarks > 100) || (iAge < 0)){
            System.err.println("Invalid input");
            return ;
        }

        if(fMarks >= 60 && iAge >= 17){
            System.out.println("Eligible for Admission");
        }
        else {
            System.out.println("Not Eligible");
        }
    }

    //////////////////////////////////////////////////////////////////
    //
    //                  Entry Point
    //
    //////////////////////////////////////////////////////////////////

    public static void main(String a[]){
        float fMarks = 0.0f;
        int iAge = 0 ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks and age: ");

        if(!scanner.hasNextFloat()) {
            System.err.println("Invalid input");
            System.exit(1);
        }
        fMarks = scanner.nextFloat() ;

        if(!scanner.hasNextInt()){
            System.err.println("Invalid input");
            System.exit(1) ;
        }
        iAge = scanner.nextInt();

        CheckAdmission(fMarks, iAge);
    }
}

//////////////////////////////////////////////////////////////////
//
//                        Sample output
//
//  Enter marks and age: 75 18
//  Eligible for Admission
//
//
//  Enter marks and age: 55 19
//  Not Eligible
//
//
//  Enter marks and age: 80 16
//  Not Eligible
//
//
//  Enter marks and age: 120 18
//  Invalid input
//
//////////////////////////////////////////////////////////////////