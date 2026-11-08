import java.util.Scanner;

//////////////////////////////////////////////////////////////////
/*
            Function name   : CalculateBonus
            Description     : calculates employee bonus from salary and years
                              more than 10 years  -> 15% of salary
                              5 to 10 years       -> 10% of salary
                              less than 5 years   -> 5% of salary
            Enter salary and years of service: 30000 12
            Bonus = 4500.00

            input           : float, int
            output          : void
            Author          : Vedant Kalidas Barne
            Date            : 7/11/2026
*/
//////////////////////////////////////////////////////////////////

public class a6_5 {

    public static void CalculateBonus(float fSalary, int iYears) {
        float fBonus = 0.0f;

        if((fSalary <= 0) || (iYears < 0)){
            System.err.println("Invalid input");
            return ;
        }

        if(iYears > 10){
            fBonus = (fSalary * 15) / 100 ;
        }
        else if(iYears >= 5) {
            fBonus = (fSalary * 10) / 100;
        }
        else{
            fBonus = (fSalary * 5) / 100;
        }

        System.out.printf("Bonus = %.2f\n", fBonus);
    }

    //////////////////////////////////////////////////////////////////
    //
    //                  Entry Point
    //
    //////////////////////////////////////////////////////////////////

    public static void main(String a[]){
        float fSalary = 0.0f ;
        int iYears = 0;
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Enter salary and years of service: ");

        if(!scanner.hasNextFloat()){
            System.err.println("Invalid input");
            System.exit(1);
        }
        fSalary = scanner.nextFloat();

        if(!scanner.hasNextInt()) {
            System.err.println("Invalid input") ;
            System.exit(1);
        }
        iYears = scanner.nextInt();

        CalculateBonus(fSalary, iYears);
    }
}

//////////////////////////////////////////////////////////////////
//
//                        Sample output
//
//  Enter salary and years of service: 30000 12
//  Bonus = 4500.00
//
//
//  Enter salary and years of service: 20000 7
//  Bonus = 2000.00
//
//
//  Enter salary and years of service: 10000 2
//  Bonus = 500.00
//
//
//  Enter salary and years of service: -500 3
//  Invalid input
//
//////////////////////////////////////////////////////////////////