import java.util.Scanner ;


public class program19 {
    public static boolean checkEven (int iNo ){
        if (iNo %2 == 0 ) return true ;
        else return false ; 
    }
    public static void main(String A[]) {
        Scanner scanner = new Scanner (System.in ) ;
        
        int iValue = 0 ;
        boolean bRet = false ;

        System.out.println("Enter a number : ");
        iValue = scanner.nextInt(); 

        bRet = checkEven(iValue ); 

        if (bRet == true ) System.out.println("Even ");
        else if (bRet == false ) System.out.println("Odd ");


    }
}
