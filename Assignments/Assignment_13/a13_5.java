import java.util.Scanner; 

class Number {
    public int Diff(int iNo){
        int iDiff = 0 ; 
        int i = 0 ;
        int iEven = 0 ; 
        int iOdd = 0 ; 

        while (iNo != 0){
            i = iNo %10 ; 
            if(i%2 == 0 ){
                iEven = iEven+ i ; 
            }
            else iOdd = iOdd + i ; 
        }
        iDiff = iEven - iOdd; 

        return iDiff ; 
    }
}

public class a13_5 {

    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in);
        Number nobj = new Number(); 

        int iValue = 0 ; 
        int iRet = 0 ; 

        System.out.println("Enter a number :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input"); 
            System.exit(1); 
        }iValue = scanner.nextInt() ;

        iRet = nobj.Diff(iValue); 
        System.out.println(iRet );

    }
}
