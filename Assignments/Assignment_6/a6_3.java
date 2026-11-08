import java.util.Scanner;

//////////////////////////////////////////////////////////////////
/*
            Function name   : CalculateDiscount
            Description     : calculates final payable amount after discount
                              below 1000          -> 0%
                              1000 to below 5000  -> 10%
                              5000 and above      -> 20%
            Enter purchase amount: 2000
            Payable Amount = 1800.00

            input           : float
            output          : void
            Author          : Vedant Kalidas Barne
            Date            : 7/11/2026
*/
//////////////////////////////////////////////////////////////////

public class a6_3 {

    public static void CalculateDiscount(float fAmount){
        float fDiscount = 0.0f ;
        float fFinalAmount = 0.0f;

        if(fAmount < 0){
            System.err.println("Invalid input") ;
            return;
        }

        if(fAmount < 1000) {
            fDiscount = 0;
        }
        else if(fAmount < 5000){
            fDiscount = 10 ;
        }
        else{
            fDiscount = 20;
        }

        fFinalAmount = fAmount - ((fAmount * fDiscount) / 100);

        System.out.printf("Payable Amount = %.2f\n", fFinalAmount) ;
    }

    //////////////////////////////////////////////////////////////////
    //
    //                  Entry Point
    //
    //////////////////////////////////////////////////////////////////

    public static void main(String a[]) {
        float fAmount = 0.0f;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter purchase amount: ") ;

        if(!scanner.hasNextFloat()){
            System.err.println("Invalid input");
            System.exit(1);
        }
        fAmount = scanner.nextFloat();

        CalculateDiscount(fAmount);
    }
}

//////////////////////////////////////////////////////////////////
//
//                        Sample output
//
//  Enter purchase amount: 800
//  Payable Amount = 800.00
//
//
//  Enter purchase amount: 2000
//  Payable Amount = 1800.00
//
//
//  Enter purchase amount: 6000
//  Payable Amount = 4800.00
//
//
//  Enter purchase amount: -10
//  Invalid input
//
//////////////////////////////////////////////////////////////////