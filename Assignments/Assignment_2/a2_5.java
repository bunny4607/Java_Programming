import java.util.Scanner; 
/////////////////////////////////////////////////////////////////////////
/// 
///     class name : evenODD
///     description : checks even or odd
///     date : 7/11/2026
///     author : Vedant Kalidas Barne 
/// 
/////////////////////////////////////////////////////////////////////////
class evenODD{
    /////////////////////////////////////////////////////////////////////////
    /// 
    ///     function name : even or odd
    ///     description : checks if number taken from user is even or odd  
    ///     input : int 
    ///     output : boolean 
    ///     date : 7/11/2026
    ///     author : Vedant Kalidas Barne
    /// 
    /////////////////////////////////////////////////////////////////////////
    public boolean checkEvenOrOdd(int iNo){
        return (iNo %2 == 0 ); 
    }
}
/////////////////////////////////////////////////////////////////////////
/// 
///     Entry point 
/// 
/////////////////////////////////////////////////////////////////////////

public class a2_5 {
    public static void main(String A[]){
        int iValue = 0 ; 
        boolean iRet = false ;

        Scanner sc = new Scanner(System.in); 
        evenODD dobj = new evenODD(); 

        System.out.println("Enter a number : ");
        if (!sc.hasNextInt()){
            System.err.println("invalid input "); 
            System.exit(1);
        }
        iValue = sc.nextInt(); 

        iRet = dobj.checkEvenOrOdd(iValue); 
        if(iRet == true ) System.out.println("Even");
        else System.out.println("Odd");

        sc.close();

    }   
    
}
/////////////////////////////////////////////////////////////////////////
/// 
///     sample outputs :
/*    
Enter a number : 
6
Even
vedantbarne@Vedants-MacBook-Air-2 Assignment_2 % java a2_5.java
Enter a number : 
3
false
vedantbarne@Vedants-MacBook-Air-2 Assignment_2 % 
*/
///
/// 
/////////////////////////////////////////////////////////////////////////
