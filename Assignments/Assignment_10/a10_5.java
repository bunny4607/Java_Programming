import java.util.Scanner ; 


class unit {
    public double sqFeetToSqM (int iNo){
        double sqm = (double)iNo * 0.0929;
        return sqm; 

    }
}
/*
......................................................


                            Entry point 


......................................................
*/
public class a10_5 {
    public static void main(String A[]){
        int iValue = 0 ; 
        double iRet = 0 ; 

        unit aobj = new unit (); 
        Scanner scanner = new Scanner (System.in) ; 

        System.out.println("Enter in sq ft :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }iValue = scanner.nextInt(); 

        iRet = aobj.sqFeetToSqM(iValue);
        System.out.println(iRet );

    }
}

/*
......................................................

                        Sample output 


Enter in sq ft :
5
0.46449999999999997
vedantbarne@Vedants-MacBook-Air-2 Assignment_10 % java a10_5.java
Enter in sq ft :
7
0.6503


......................................................
*/
