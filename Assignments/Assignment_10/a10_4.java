import java.util.Scanner ; 


class unit {
    public double FtoC (int iNo){
        double iC = ((double)iNo - 32 )*((double)5/(double)9);
        return iC; 

    }
}
/*
......................................................


                            Entry point 


......................................................
*/
public class a10_4 {
    public static void main(String A[]){
        int iValue = 0 ; 
        double iRet = 0 ; 

        unit aobj = new unit (); 
        Scanner scanner = new Scanner (System.in) ; 

        System.out.println("Enter in F :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }iValue = scanner.nextInt(); 

        iRet = aobj.FtoC(iValue);
        System.out.println(iRet );

    }
}

/*
......................................................

                        Sample output 


Enter in F :
10
-12.222222222222223
vedantbarne@Vedants-MacBook-Air-2 Assignment_10 % java a10_4.java
Enter in F :
34
1.1111111111111112

......................................................
*/
