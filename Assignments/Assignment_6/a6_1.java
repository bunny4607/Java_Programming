import java.util.Scanner;

//////////////////////////////////////////////////////////////////
/*
            Function name   : CalculateElectricityBill
            Description     : calculates slab wise electricity bill
                              first 100 units  -> 5 per unit
                              next 100 units   -> 7 per unit
                              above 200 units  -> 10 per unit
            Enter consumed units: 150
            Bill = 850.00

            input           : int
            output          : void
            Author          : Vedant Kalidas Barne
            Date            : 7/11/2026
*/
//////////////////////////////////////////////////////////////////

public class a6_1 {

    public static void CalculateElectricityBill(int iUnits){
        float fBill = 0.0f ;

        if(iUnits < 0) {
            System.err.println("Invalid input");
            return;
        }

        if(iUnits <= 100){
            fBill = iUnits * 5 ;
        }
        else if (iUnits <= 200){
            fBill = (100 * 5) + ((iUnits - 100) * 7);
        }
        else{
            fBill = (100 * 5) + (100 * 7) + ((iUnits - 200) * 10) ;
        }

        System.out.printf("Bill = %.2f\n", fBill);
    }

    //////////////////////////////////////////////////////////////////
    //
    //                  Entry Point
    //
    //////////////////////////////////////////////////////////////////

    public static void main(String a[]) {
        int iUnits = 0;
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Enter consumed units: ");

        if(!scanner.hasNextInt()){
            System.err.println("Invalid input") ;
            System.exit(1);
        }
        iUnits = scanner.nextInt();

        CalculateElectricityBill(iUnits);
    }
}

//////////////////////////////////////////////////////////////////
//
//                        Sample output
//
//  Enter consumed units: 80
//  Bill = 400.00
//
//
//  Enter consumed units: 150
//  Bill = 850.00
//
//
//  Enter consumed units: 250
//  Bill = 1700.00
//
//
//  Enter consumed units: -5
//  Invalid input
//
//////////////////////////////////////////////////////////////////
