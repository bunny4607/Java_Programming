// accept total marks and obtained marks from user and return obtained percentage 

import java.util.Scanner; 
class percentage {
    public double calculatePercent(int itotal, int iobtained){
        double iP = ((double)iobtained/ (double)itotal)*100.0; 
        return iP; 
    }
}
public class a15_5{
    public static  void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        percentage pobj = new percentage(); 

        int iObtained = 0 ; 
        int iTotal = 0 ; 

        double  iRet = 0.0  ; 

        System.out.println("Enter total marks ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }iTotal  =  scanner. nextInt(); 

        System.out.println("Enter obrianed marks ");
        if(!scanner.hasNextInt()){
            System.err.print("Invakid input"); 
            System.exit(1);
        }iObtained = scanner.nextInt() ;

        iRet = pobj.calculatePercent(iTotal, iObtained) ; 
        System.out.println(iRet);

    }
}
/*
Enter total marks 
100
Enter obrianed marks 
34
34.0
vedantbarne@Vedants-MacBook-Air-2 Assignment_15 % java a15_5.java
Enter total marks 
200
Enter obrianed marks 
98
49.0
vedantbarne@Vedants-MacBook-Air-2 Assignment_15 % java a15_5.java
Enter total marks 
200
Enter obrianed marks 
51
25.5
*/