import java.util.Scanner ; 


class unit {
    public double metere (int iNo){
        return iNo *1000; 

    }
}
/*
......................................................


                            Entry point 


......................................................
*/
public class a10_3 {
    public static void main(String A[]){
        int iValue = 0 ; 
        double iRet = 0 ; 

        unit aobj = new unit (); 
        Scanner scanner = new Scanner (System.in) ; 

        System.out.println("Enter in km :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }iValue = scanner.nextInt(); 

        iRet = aobj.metere(iValue);
        System.out.println(iRet );

    }
}

/*
......................................................

                        Sample output 


Enter in km :
1
1000.0
vedantbarne@Vedants-MacBook-Air-2 Assignment_10 % java a10_3.java
Enter in km :
5
5000.0

......................................................
*/
