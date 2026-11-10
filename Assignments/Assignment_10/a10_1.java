import java.util.Scanner ; 


class area {
    public double circle (int iNo){
        double  iA = 0 ; 
        iA = 3.14*((double)iNo*(double) iNo);

        return iA; 
    }
}
/*
......................................................


                            Entry point 


......................................................
*/
public class a10_1 {
    public static void main(String A[]){
        int iValue = 0 ; 
        double iRet = 0 ; 

        area aobj = new area (); 
        Scanner scanner = new Scanner (System.in) ; 

        System.out.println("Enter radius :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }iValue = scanner.nextInt(); 

        iRet = aobj.circle(iValue);
        System.out.println(iRet );

    }
}

/*
......................................................

                        Sample output 


Enter radius :
4
50.24
vedantbarne@Vedants-MacBook-Air-2 Assignment_10 % java a10_1.java
Enter radius :
8
200.96
vedantbarne@Vedants-MacBook-Air-2 Assignment_10 % java a10_1.java
Enter radius :
10
314.0

......................................................
*/
